package com.dolthhaven.japanesevibes.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class UniqueLanternBlock extends LanternBlock {
    private final VoxelShape normal;
    private final VoxelShape hanging;

    public UniqueLanternBlock(Properties props, VoxelShape normal, VoxelShape hanging) {
        super(props);
        this.normal = normal;
        this.hanging = hanging;
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return state.getValue(HANGING) ? hanging : normal;
    }
}
