package com.dolthhaven.japanesevibes.core.data.server.tags;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.data.event.GatherDataEvent;

import static com.dolthhaven.japanesevibes.core.data.server.tags.JVNewTags.NewBlockTags.*;
import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;

public class JVTags {
    public static class JVBlockTags extends BlockTagsProvider {
        public JVBlockTags(GatherDataEvent e) {
            super(e.getGenerator(), JapaneseVibes.MOD_ID, e.getExistingFileHelper());
        }

        @Override
        public void addTags() {
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(JIZO_STONE.get(), STONE_LAMP.get(), COPPER_BELL.get());
            this.tag(BlockTags.MINEABLE_WITH_AXE).add(WOOD_BELL.get());

            this.tag(BlockTags.REPLACEABLE_PLANTS).add(BLUE_HYDRANGEA.get(), PINK_HYDRANGEA.get(), CAMELLIA_BUSH.get());
            this.tag(BlockTags.TALL_FLOWERS).add(BLUE_HYDRANGEA.get(), PINK_HYDRANGEA.get(), CAMELLIA_BUSH.get());

            this.tag(JVNewTags.NewBlockTags.PAPER_LANTERNS_COLORED_ONLY).add(
                    PAPER_LANTERN_WHITE.get(), PAPER_LANTERN_BROWN.get(), PAPER_LANTERN_GRAY.get(), PAPER_LANTERN_LIGHT_GRAY.get(),
                    PAPER_LANTERN_RED.get(), PAPER_LANTERN_ORANGE.get(), PAPER_LANTERN_YELLOW.get(), PAPER_LANTERN_LIME.get(),
                    PAPER_LANTERN_GREEN.get(), PAPER_LANTERN_BLUE.get(), PAPER_LANTERN_LIGHT_BLUE.get(), PAPER_LANTERN_CYAN.get(),
                    PAPER_LANTERN_PURPLE.get(), PAPER_LANTERN_MAGENTA.get(), PAPER_LANTERN_PINK.get(), PAPER_LANTERN_BLACK.get(), PAPER_LANTERN.get()

                    );

            this.tag(PAPER_LANTERNS).addTag(JVNewTags.NewBlockTags.PAPER_LANTERNS_COLORED_ONLY).add(
                    PAPER_LANTERN_BLACK_DOT.get(), PAPER_LANTERN_OBAKE.get(), PAPER_LANTERN_SUN.get(), PAPER_LANTERN_RED_DOT.get()
            );

            this.tag(SMALL_LANTERNS).add(
                    SMALL_LANTERN.get(),
                    WHITE_SMALL_LANTERN.get(), BROWN_SMALL_LANTERN.get(), GRAY_SMALL_LANTERN.get(), LIGHT_GRAY_SMALL_LANTERN.get(),
                    RED_SMALL_LANTERN.get(), ORANGE_SMALL_LANTERN.get(), YELLOW_SMALL_LANTERN.get(), LIME_SMALL_LANTERN.get(),
                    GREEN_SMALL_LANTERN.get(), BLUE_SMALL_LANTERN.get(), LIGHT_BLUE_SMALL_LANTERN.get(), CYAN_SMALL_LANTERN.get(),
                    PURPLE_SMALL_LANTERN.get(), MAGENTA_SMALL_LANTERN.get(), PINK_SMALL_LANTERN.get(), BLACK_SMALL_LANTERN.get());
        }

    }

    public static class JVItemTags extends ItemTagsProvider {


        public JVItemTags(GatherDataEvent e, BlockTagsProvider t) {
            super(e.getGenerator(), t, JapaneseVibes.MOD_ID, e.getExistingFileHelper());
        }

        @Override
        public void addTags() {

            this.copy(PAPER_LANTERNS_COLORED_ONLY, JVNewTags.NewItemTags.PAPER_LANTERNS_COLORED_ONLY);
            this.copy(PAPER_LANTERNS, JVNewTags.NewItemTags.PAPER_LANTERNS);
            this.copy(SMALL_LANTERNS, JVNewTags.NewItemTags.SMALL_LANTERNS);
        }
    }

}
