package com.dolthhaven.japanesevibes.core.registry;


import com.dolthhaven.japanesevibes.common.blocks.*;
import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.teamabnormals.blueprint.common.block.BlueprintTallFlowerBlock;
import com.teamabnormals.blueprint.core.util.PropertyUtil;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.BiFunction;

@Mod.EventBusSubscriber(modid = JapaneseVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JVBlocks {
    public static final BlockSubRegistryHelper HELPER = JapaneseVibes.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> PAPER_LANTERN = HELPER.createBlock("paper_lantern", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.TERRACOTTA_WHITE), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_WHITE = HELPER.createBlock("paper_lantern_white", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BROWN = HELPER.createBlock("paper_lantern_brown", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BROWN), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GRAY = HELPER.createBlock("paper_lantern_gray", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GRAY), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_GRAY = HELPER.createBlock("paper_lantern_light_gray", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GRAY), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_RED = HELPER.createBlock("paper_lantern_red", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_ORANGE = HELPER.createBlock("paper_lantern_orange", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_ORANGE), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_YELLOW = HELPER.createBlock("paper_lantern_yellow", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_YELLOW), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIME = HELPER.createBlock("paper_lantern_lime", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GREEN), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GREEN = HELPER.createBlock("paper_lantern_green", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GREEN), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLUE = HELPER.createBlock("paper_lantern_blue", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLUE), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_BLUE = HELPER.createBlock("paper_lantern_light_blue", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_BLUE), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_CYAN = HELPER.createBlock("paper_lantern_cyan", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_CYAN), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PURPLE = HELPER.createBlock("paper_lantern_purple", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PURPLE), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_MAGENTA = HELPER.createBlock("paper_lantern_magenta", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_MAGENTA), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PINK = HELPER.createBlock("paper_lantern_pink", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PINK), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLACK = HELPER.createBlock("paper_lantern_black", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLACK_DOT = HELPER.createBlock("paper_lantern_black_dot", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_OBAKE = HELPER.createBlock("paper_lantern_obake", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_RED_DOT = HELPER.createBlock("paper_lantern_red_dot", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_SUN = HELPER.createBlock("paper_lantern_sun", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW), Hitboxes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> SMALL_LANTERN = HELPER.createBlock("small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.TERRACOTTA_WHITE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WHITE_SMALL_LANTERN = HELPER.createBlock("white_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BROWN_SMALL_LANTERN = HELPER.createBlock("brown_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BROWN), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GRAY_SMALL_LANTERN = HELPER.createBlock("gray_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GRAY), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_GRAY_SMALL_LANTERN = HELPER.createBlock("light_gray_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GRAY), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> RED_SMALL_LANTERN = HELPER.createBlock("red_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> ORANGE_SMALL_LANTERN = HELPER.createBlock("orange_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_ORANGE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> YELLOW_SMALL_LANTERN = HELPER.createBlock("yellow_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_YELLOW), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIME_SMALL_LANTERN = HELPER.createBlock("lime_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_BLUE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GREEN_SMALL_LANTERN = HELPER.createBlock("green_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GREEN), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLUE_SMALL_LANTERN = HELPER.createBlock("blue_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLUE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> LIGHT_BLUE_SMALL_LANTERN = HELPER.createBlock("light_blue_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_BLUE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> CYAN_SMALL_LANTERN = HELPER.createBlock("cyan_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_CYAN), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PURPLE_SMALL_LANTERN = HELPER.createBlock("purple_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PURPLE), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> MAGENTA_SMALL_LANTERN = HELPER.createBlock("magenta_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_MAGENTA), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PINK_SMALL_LANTERN = HELPER.createBlock("pink_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PINK), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> BLACK_SMALL_LANTERN = HELPER.createBlock("black_small_lantern", () -> new HangingBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK), Hitboxes.SMALL_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> TATAMI_LANTERN = HELPER.createBlock("tatami_lantern", () -> new UnfloatableBlock(Properties.TATAMI_LANTERN, Hitboxes.TATAMI_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> STONE_LAMP = HELPER.createBlock("stone_lamp", () -> new UniqueBlock(Properties.STONE_LAMP, Hitboxes.STONE_LAMP_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> JIZO_STONE = HELPER.createBlock("jizo_stone", () -> new JizoBlock(BlockBehaviour.Properties.copy(Blocks.STONE)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> WOOD_BELL = HELPER.createBlock("wood_bell", () -> new ChimeBlock(BlockBehaviour.Properties.copy(Blocks.JUKEBOX), Hitboxes.SMALL_LANTERN_AABB, null), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> GLASS_BELL = HELPER.createBlock("glass_bell", () -> new ChimeBlock(BlockBehaviour.Properties.copy(Blocks.GLASS), Hitboxes.SMALL_LANTERN_AABB, null), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> COPPER_BELL = HELPER.createBlock("copper_bell", () -> new ChimeBlock(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK), Hitboxes.SMALL_LANTERN_AABB, null), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> CAMELLIA_BUSH = HELPER.createBlock("camellia_bush", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> BLUE_HYDRANGEA = HELPER.createBlock("blue_hydrangea", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<Block> PINK_HYDRANGEA = HELPER.createBlock("pink_hydrangea", () -> new BlueprintTallFlowerBlock(PropertyUtil.FLOWER), CreativeModeTab.TAB_DECORATIONS);








    public static class Properties {
        public static BlockBehaviour.Properties getLanternPropsOfColor(MaterialColor color) {
            return Block.Properties.of(Material.WOOL, color).strength(1f).sound(SoundType.WOOL).lightLevel(state -> 12);
        }

        public static final BlockBehaviour.Properties TATAMI_LANTERN =  Block.Properties.of(Material.BAMBOO, MaterialColor.TERRACOTTA_WHITE).strength(1.2f).sound(SoundType.SCAFFOLDING).lightLevel(state -> 15);
        public static final BlockBehaviour.Properties STONE_LAMP = Block.Properties.of(Material.STONE, MaterialColor.STONE).strength(1.5f, 6.0f).sound(SoundType.STONE).lightLevel(state -> 15).requiresCorrectToolForDrops();
    }

    public static class Hitboxes {
        public static final VoxelShape VANILLA_LANTERN_AABB = Shapes.or(Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), Block.box(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
        public static final VoxelShape HANGING_VANILLA_LANTERN_AABB = Shapes.or(Block.box(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));

        public static final VoxelShape PAPER_LANTERN_AABB = Block.box(1, 1, 1, 15, 15, 15);
        public static final VoxelShape SMALL_LANTERN_AABB = Block.box(3, 2, 3, 13, 16, 13);

        public static final VoxelShape STONE_LAMP_AABB = Shapes.joinUnoptimized(Shapes.joinUnoptimized(
                Block.box(3, 10, 3, 13, 12, 13),
                Block.box(5, 5, 5, 11, 10, 11), BooleanOp.OR),
                Block.box(4, 0, 4, 12, 5, 12), BooleanOp.OR
        );

        public static final VoxelShape TATAMI_LANTERN_AABB = Shapes.joinUnoptimized(
                Block.box(3, 12, 3, 13, 13, 13),
                Block.box(4, 0, 4, 12, 12, 12), BooleanOp.OR);

        public static VoxelShape joinAll(VoxelShape... shapes) {
            return joinAllHelper(shapes, 0);
        }

        private static VoxelShape joinAllHelper(VoxelShape[] list, int i) {
            BiFunction<VoxelShape, VoxelShape, VoxelShape> nullableJoin = (v, v2) -> {
                if (v2 == null)
                    return v;
                else
                    return Shapes.joinUnoptimized(v, v2, BooleanOp.OR);
            };

            if (i - 1 >= list.length) {
                return null;
            }
            else {
                return nullableJoin.apply(list[i], joinAllHelper(list, i + 1));
            }
        }
    }
}