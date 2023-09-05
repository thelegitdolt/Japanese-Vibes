package com.dolthhaven.japanesevibes.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class NotFullBlock extends UniqueBlock {
    public NotFullBlock(Properties props, VoxelShape shape) {
        super(props, shape);
    }


    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, BlockPos p_152831_) {
        return Block.canSupportCenter(level, p_152831_.below(), Direction.UP);
    }
}
