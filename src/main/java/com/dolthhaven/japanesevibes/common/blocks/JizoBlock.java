package com.dolthhaven.japanesevibes.common.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class JizoBlock extends NotFullBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    private static final Map<Direction, VoxelShape> VOXEL_MAP = new HashMap<>();

    static {
        VOXEL_MAP.put(Direction.SOUTH, Shapes.joinUnoptimized(
                Block.box(4, 6, 4.5, 12, 13, 11.5), Block.box(5, 0, 5.5, 11, 6, 10.5), BooleanOp.OR));

        VOXEL_MAP.put(Direction.NORTH, Shapes.joinUnoptimized(
                Block.box(4, 6, 4.5, 12, 13, 11.5), Block.box(5, 0, 5.5, 11, 6, 10.5), BooleanOp.OR));

        VOXEL_MAP.put(Direction.EAST, Shapes.joinUnoptimized(
                Block.box(4.5, 6, 4, 11.5, 13, 12), Block.box(5.5, 0, 5, 10.5, 6, 11), BooleanOp.OR));

        VOXEL_MAP.put(Direction.WEST, Shapes.joinUnoptimized(
                Block.box(4.5, 6, 4, 11.5, 13, 12), Block.box(5.5, 0, 5, 10.5, 6, 11), BooleanOp.OR));
    }


    public JizoBlock(Properties props) {
        super(props, null);
        this.registerDefaultState(this.getStateDefinition().any().setValue(WATERLOGGED, false).setValue(FACING, Direction.NORTH));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateDef) {
        stateDef.add(WATERLOGGED, FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER);
    }

    @Override
    public @NotNull FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter getter, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return VOXEL_MAP.get(state.getValue(HorizontalDirectionalBlock.FACING));
    }
}
