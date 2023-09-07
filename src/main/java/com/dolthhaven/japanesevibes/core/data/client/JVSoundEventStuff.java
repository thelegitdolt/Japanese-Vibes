package com.dolthhaven.japanesevibes.core.data.client;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.registry.JVBlocks;
import com.dolthhaven.japanesevibes.core.registry.JVSoundEvents;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.Consumer;

public class JVSoundEventStuff extends SoundDefinitionsProvider {
    public JVSoundEventStuff(GatherDataEvent e) {
        super(e.getGenerator(), JapaneseVibes.MOD_ID, e.getExistingFileHelper());
    }

    @Override
    public void registerSounds() {
        this.register(JVSoundEvents.WOOD_BELL, "bells/wood", getBlockSubtitle(JVBlocks.WOOD_BELL, "chime"), null);
        this.register(JVSoundEvents.GLASS_BELL, "bells/glass", getBlockSubtitle(JVBlocks.GLASS_BELL, "chime"), null);
        this.register(JVSoundEvents.COPPER_BELL, "bells/copper", getBlockSubtitle(JVBlocks.COPPER_BELL, "chime"), null);
    }

    private void register(RegistryObject<SoundEvent> soundEvent, String location, @Nullable String subtitle, Consumer<SoundDefinition.Sound> consumer) {
        SoundDefinition.Sound sound = sound(JapaneseVibes.REGISTRY_HELPER.prefix(location));


        if (consumer != null)
            consumer.accept(sound);

        this.add(soundEvent.get(), definition().with(sound).subtitle(subtitle));
    }

    public static String getBlockSubtitle(RegistryObject<Block> block, String action) {
        return "subtitle.block." + Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block.get())).toString().replace(':', '.') + "." + action;
    }

}
