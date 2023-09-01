package com.dolthhaven.japanesevibes.common.blocks;

import com.dolthhaven.japanesevibes.core.registry.JVParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ChimeBlock extends HangingBlock {
    private final SoundEvent sound;

    public ChimeBlock(Properties props, VoxelShape shape, SoundEvent sound) {
        super(props, shape);
        this.sound = sound;
    }


    public @NotNull InteractionResult use(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult result) {
        if (level.isClientSide) {
            level.addParticle(JVParticles.DOWNWARD_NOTE.get(), pos.getX() + 0.5D, pos.getY() -0.2D,
                    pos.getZ() + 0.5D, -level.getRandom().nextInt(25) / 24D, 0D, 0D);
            return InteractionResult.SUCCESS;
        }
        else {
            if (sound != null)
                level.playSound(null, pos, sound, SoundSource.BLOCKS, 1.0f, 1.0f);

            return InteractionResult.CONSUME;
        }
    }
}
