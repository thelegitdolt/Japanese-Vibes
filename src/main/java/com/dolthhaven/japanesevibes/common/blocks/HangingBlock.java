package com.dolthhaven.japanesevibes.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class HangingBlock extends Block implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private final VoxelShape shape;

    public HangingBlock(Properties props, VoxelShape shape) {
        super(props);
        this.shape = shape;
        this.registerDefaultState(this.getStateDefinition().any().setValue(WATERLOGGED, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());

        for (Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockstate = this.defaultBlockState();

                if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                    return blockstate.setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
                }
            }
        }

        return null;
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, BlockPos pos) {;
        return Block.canSupportCenter(level, pos.relative(Direction.UP), Direction.DOWN);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateDef) {
        stateDef.add(WATERLOGGED);
    }

    @Override
    public @NotNull BlockState updateShape(BlockState state, @NotNull Direction dir, @NotNull BlockState p_153485_, @NotNull LevelAccessor level, @NotNull BlockPos p_153487_, @NotNull BlockPos p_153488_) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(p_153487_, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }

        return Direction.UP == dir && !state.canSurvive(level, p_153487_) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, dir, p_153485_, level, p_153487_, p_153488_);
    }

    @Override
    public boolean isPathfindable(@NotNull BlockState p_153469_, @NotNull BlockGetter p_153470_, @NotNull BlockPos p_153471_, @NotNull PathComputationType p_153472_) {
        return false;
    }


    @Override
    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }


    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return shape;
    }
}
