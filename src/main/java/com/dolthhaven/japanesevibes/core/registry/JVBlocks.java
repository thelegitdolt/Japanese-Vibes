package com.dolthhaven.japanesevibes.core.registry;


import com.dolthhaven.japanesevibes.common.blocks.DirectionalLanternBlock;
import com.dolthhaven.japanesevibes.common.blocks.UniqueLanternBlock;
import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = JapaneseVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JVBlocks {
    public static final BlockSubRegistryHelper HELPER = JapaneseVibes.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> PAPER_LANTERN = HELPER.createBlock("paper_lantern", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.TERRACOTTA_WHITE), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_WHITE = HELPER.createBlock("paper_lantern_white", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BROWN = HELPER.createBlock("paper_lantern_brown", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BROWN), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GRAY = HELPER.createBlock("paper_lantern_gray", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GRAY), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_GRAY = HELPER.createBlock("paper_lantern_light_gray", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GRAY), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_RED = HELPER.createBlock("paper_lantern_red", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_ORANGE = HELPER.createBlock("paper_lantern_orange", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_ORANGE), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_YELLOW = HELPER.createBlock("paper_lantern_yellow", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_YELLOW), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIME = HELPER.createBlock("paper_lantern_lime", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GREEN), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GREEN = HELPER.createBlock("paper_lantern_green", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GREEN), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLUE = HELPER.createBlock("paper_lantern_blue", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLUE), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_BLUE = HELPER.createBlock("paper_lantern_light_blue", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_BLUE), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_CYAN = HELPER.createBlock("paper_lantern_cyan", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_CYAN), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PURPLE = HELPER.createBlock("paper_lantern_purple", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PURPLE), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_MAGENTA = HELPER.createBlock("paper_lantern_magenta", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_MAGENTA), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PINK = HELPER.createBlock("paper_lantern_pink", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PINK), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLACK = HELPER.createBlock("paper_lantern_black", () -> new UniqueLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLACK_DOT = HELPER.createBlock("paper_lantern_black_dot", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_OBAKE = HELPER.createBlock("paper_lantern_obake", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_RED_DOT = HELPER.createBlock("paper_lantern_red_dot", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_SUN = HELPER.createBlock("paper_lantern_sun", () -> new DirectionalLanternBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW), Shapes.PAPER_LANTERN_AABB, Shapes.PAPER_LANTERN_AABB), CreativeModeTab.TAB_BUILDING_BLOCKS);





    public static class Properties {
        public static BlockBehaviour.Properties getLanternPropsOfColor(MaterialColor color) {
            return Block.Properties.of(Material.WOOL, color).strength(1f).sound(SoundType.WOOL).lightLevel(state -> 12);
        }
    }

    public static class Shapes {
        public static final VoxelShape VANILLA_LANTERN_AABB = net.minecraft.world.phys.shapes.Shapes.or(Block.box(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), Block.box(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
        public static final VoxelShape HANGING_VANILLA_LANTERN_AABB = net.minecraft.world.phys.shapes.Shapes.or(Block.box(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.box(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));

        public static final VoxelShape PAPER_LANTERN_AABB = Block.box(1, 1, 1, 15, 15, 15);
    }
}