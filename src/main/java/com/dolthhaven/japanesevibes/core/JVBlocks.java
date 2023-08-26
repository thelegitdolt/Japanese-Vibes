package com.dolthhaven.japanesevibes.core;


import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = JapaneseVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JVBlocks {
    public static final BlockSubRegistryHelper HELPER = JapaneseVibes.REGISTRY_HELPER.getBlockSubHelper();

    public static final RegistryObject<Block> PAPER_LANTERN_WHITE = HELPER.createBlock("paper_lantern_white", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.SNOW)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BROWN = HELPER.createBlock("paper_lantern_brown", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BROWN)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GRAY = HELPER.createBlock("paper_lantern_gray", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GRAY)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_GRAY = HELPER.createBlock("paper_lantern_light_gray", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GRAY)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_RED = HELPER.createBlock("paper_lantern_red", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_RED)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_ORANGE = HELPER.createBlock("paper_lantern_orange", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_ORANGE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_YELLOW = HELPER.createBlock("paper_lantern_yellow", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_YELLOW)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIME = HELPER.createBlock("paper_lantern_lime", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_GREEN)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_GREEN = HELPER.createBlock("paper_lantern_green", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_GREEN)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLUE = HELPER.createBlock("paper_lantern_blue", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLUE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_LIGHT_BLUE = HELPER.createBlock("paper_lantern_light_blue", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_LIGHT_BLUE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_CYAN = HELPER.createBlock("paper_lantern_cyan", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_CYAN)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PURPLE = HELPER.createBlock("paper_lantern_purple", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PURPLE)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_MAGENTA = HELPER.createBlock("paper_lantern_magenta", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_MAGENTA)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_PINK = HELPER.createBlock("paper_lantern_pink", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_PINK)), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> PAPER_LANTERN_BLACK = HELPER.createBlock("paper_lantern_black", () -> new LanternBlock(Properties.getLanternPropsOfColor(MaterialColor.COLOR_BLACK)), CreativeModeTab.TAB_BUILDING_BLOCKS);






    public static class Properties {
        public static BlockBehaviour.Properties getLanternPropsOfColor(MaterialColor color) {
            return Block.Properties.of(Material.WOOL, color).strength(3.0F, 1200.0F).sound(SoundType.LANTERN).lightLevel(state -> 12);
        }

    }
}