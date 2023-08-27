package com.dolthhaven.japanesevibes.core.data.server;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.data.event.GatherDataEvent;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;

public class JVTags {
    public static class Blocks extends BlockTagsProvider {
        public Blocks(GatherDataEvent e) {
            super(e.getGenerator(), JapaneseVibes.MOD_ID, e.getExistingFileHelper());
        }

        @Override
        public void addTags() {
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(JIZO_STONE.get(), STONE_LAMP.get());
        }

    }

}
