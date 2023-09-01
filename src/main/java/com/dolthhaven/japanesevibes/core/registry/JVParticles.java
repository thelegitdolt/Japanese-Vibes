package com.dolthhaven.japanesevibes.core.registry;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class JVParticles {
    public static final DeferredRegister<ParticleType<?>> PARTICLES = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, JapaneseVibes.MOD_ID);

    public static final RegistryObject<SimpleParticleType> DOWNWARD_NOTE = PARTICLES.register("downward_note", () -> new SimpleParticleType(false));

}
