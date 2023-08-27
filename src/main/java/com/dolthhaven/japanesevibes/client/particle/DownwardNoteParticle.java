package com.dolthhaven.japanesevibes.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class DownwardNoteParticle extends TextureSheetParticle {

    protected DownwardNoteParticle(ClientLevel level, double x, double y, double z, double velocity) {
        super(level, x, y, z, 0, 0, 0);
        this.friction = 0.66F;
        this.speedUpWhenYMotionIsBlocked = true;
        this.xd *= 0.01F;
        this.yd *= 0.01F;
        this.zd *= 0.01F;
        this.yd += 0.2D;
        this.rCol = Math.max(0.0F, Mth.sin(((float)velocity + 0.0F) * ((float)Math.PI * 2F)) * 0.65F + 0.35F);
        this.gCol = Math.max(0.0F, Mth.sin(((float)velocity + 0.33333334F) * ((float)Math.PI * 2F)) * 0.65F + 0.35F);
        this.bCol = Math.max(0.0F, Mth.sin(((float)velocity + 0.6666667F) * ((float)Math.PI * 2F)) * 0.65F + 0.35F);
        this.quadSize *= 1.5F;
        this.lifetime = 6;
    }

    @Override
    public @NotNull ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    @Override
    public float getQuadSize(float partialTick) {
        return this.quadSize * Mth.clamp(((float)this.age + partialTick) / (float)this.lifetime * 32.0F, 0.0F, 1.0F);
    }
}
