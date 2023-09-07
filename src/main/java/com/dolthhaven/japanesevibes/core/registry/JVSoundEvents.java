package com.dolthhaven.japanesevibes.core.registry;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.teamabnormals.blueprint.core.util.registry.SoundSubRegistryHelper;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = JapaneseVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JVSoundEvents {
    private static final SoundSubRegistryHelper HELPER = JapaneseVibes.REGISTRY_HELPER.getSoundSubHelper();


    public static final RegistryObject<SoundEvent> WOOD_BELL = HELPER.createSoundEvent("bell.wood");
    public static final RegistryObject<SoundEvent> COPPER_BELL = HELPER.createSoundEvent("bell.copper");
    public static final RegistryObject<SoundEvent> GLASS_BELL = HELPER.createSoundEvent("bell.glass");


}
