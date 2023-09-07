package com.dolthhaven.japanesevibes.core.registry;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JVPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, JapaneseVibes.MOD_ID);

    public static final RegistryObject<PaintingVariant> THE_WAVE = PAINTING_VARIANTS.register("the_wave", () -> new PaintingVariant(64, 32));
}
