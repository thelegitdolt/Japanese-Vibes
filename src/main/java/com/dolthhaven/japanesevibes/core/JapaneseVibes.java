package com.dolthhaven.japanesevibes.core;

import com.dolthhaven.japanesevibes.common.world.JVGeneration;
import com.dolthhaven.japanesevibes.core.data.client.JVBlockstatesProvider;
import com.dolthhaven.japanesevibes.core.data.client.JVItemModels;
import com.dolthhaven.japanesevibes.core.data.client.JVLang;
import com.dolthhaven.japanesevibes.core.data.server.JVLoot;
import com.dolthhaven.japanesevibes.core.data.server.JVRecipes;
import com.dolthhaven.japanesevibes.core.data.server.modifiers.JVAdvancementModifiers;
import com.dolthhaven.japanesevibes.core.data.server.modifiers.JVBiomeModifiers;
import com.dolthhaven.japanesevibes.core.data.server.tags.JVTags;
import com.dolthhaven.japanesevibes.core.other.JVIntegration;
import com.dolthhaven.japanesevibes.core.registry.JVParticles;
import com.mojang.logging.LogUtils;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(JapaneseVibes.MOD_ID)
public class JapaneseVibes {
    public static final String MOD_ID = "japanese_vibes";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static final Logger LOGGER = LogUtils.getLogger();

    public JapaneseVibes() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        REGISTRY_HELPER.register(bus);

        JVParticles.PARTICLES.register(bus);
        JVGeneration.JVFeatures.CONFIGURED_FEATURES.register(bus);
        JVGeneration.JVPlacedFeatures.PLACED_FEATURES.register(bus);

        bus.addListener(this::commonSetup);
        bus.addListener(this::dataSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        JVIntegration.register();
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    private void dataSetup(GatherDataEvent event) {
        DataGenerator gen = event.getGenerator();
        boolean client = event.includeClient();
        boolean server = event.includeServer();

        JVTags.JVBlockTags tags = new JVTags.JVBlockTags(event);

        gen.addProvider(server, new JVLoot(event));
        gen.addProvider(server, new JVTags.JVBlockTags(event));
        gen.addProvider(server, new JVAdvancementModifiers(event));
        gen.addProvider(server, tags);
        gen.addProvider(server, new JVTags.JVItemTags(event, tags));
        gen.addProvider(server, new JVRecipes(event));
        gen.addProvider(server, new JVTags.JVBiomeTags(event));
        gen.addProvider(server, JVBiomeModifiers.register(event));


        gen.addProvider(client, new JVBlockstatesProvider(event));
        gen.addProvider(client, new JVItemModels(event));
        gen.addProvider(client, new JVLang(event));
    }

    public static ResourceLocation rlOf(String namespace) {
        return new ResourceLocation(MOD_ID, namespace);
    }
}
