package com.dolthhaven.japanesevibes.core.data.server.tags;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.teamabnormals.blueprint.core.util.TagUtil;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class JVNewTags {
    public static class NewBlockTags {
        public static final TagKey<Block> PAPER_LANTERNS = blockTag("paper_lanterns");
        public static final TagKey<Block> PAPER_LANTERNS_COLORED_ONLY = blockTag("paper_lanterns_colored_only");
        public static final TagKey<Block> SMALL_LANTERNS = blockTag("small_lanterns");

        private static TagKey<Block> blockTag(String tagName) {
            return TagUtil.blockTag(JapaneseVibes.MOD_ID, tagName);
        }
    }

    public static class NewItemTags {
        public static final TagKey<Item> PAPER_LANTERNS = itemTag("paper_lanterns");
        public static final TagKey<Item> PAPER_LANTERNS_COLORED_ONLY = itemTag("paper_lanterns_colored_only");
        public static final TagKey<Item> SMALL_LANTERNS = itemTag("small_lanterns");

        private static TagKey<Item> itemTag(String tagName) {
            return TagUtil.itemTag(JapaneseVibes.MOD_ID, tagName);
        }
    }
}
