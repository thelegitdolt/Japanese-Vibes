package com.dolthhaven.japanesevibes.core.events;

import com.dolthhaven.japanesevibes.client.particle.DownwardNoteParticle;
import com.dolthhaven.japanesevibes.core.registry.JVParticles;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class JVClientEvents {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.register(JVParticles.DOWNWARD_NOTE.get(), DownwardNoteParticle.Provider::new);
    }
}
