package com.dolthhaven.japanesevibes.core.data.server;


import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.google.common.collect.ImmutableList;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;

public class JVLoot extends LootTableProvider {

    public JVLoot(GatherDataEvent event) {
        super(event.getGenerator().getPackOutput(), BuiltInLootTables.all(), ImmutableList.of(
                new LootTableProvider.SubProviderEntry(JVBlockLoot::new, LootContextParamSets.BLOCK)
        ));
    }

    @Override
    protected void validate(@NotNull Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) { }

    private static <T> Iterable<T> getContent(IForgeRegistry<T> entry) {
        return entry.getValues().stream().filter(i -> entry.getKey(i) != null
                && JapaneseVibes.MOD_ID.equals(Objects.requireNonNull
                (entry.getKey(i))
                .getNamespace()))
                .collect(Collectors.toSet());
    }

    private static class JVBlockLoot extends BlockLootSubProvider {
        private static final Set<Item> EXPLOSION_RESISTANT = Stream.of(Blocks.DRAGON_EGG, Blocks.BEACON, Blocks.CONDUIT, Blocks.SKELETON_SKULL, Blocks.WITHER_SKELETON_SKULL, Blocks.PLAYER_HEAD, Blocks.ZOMBIE_HEAD, Blocks.CREEPER_HEAD, Blocks.DRAGON_HEAD, Blocks.PIGLIN_HEAD, Blocks.SHULKER_BOX, Blocks.BLACK_SHULKER_BOX, Blocks.BLUE_SHULKER_BOX, Blocks.BROWN_SHULKER_BOX, Blocks.CYAN_SHULKER_BOX, Blocks.GRAY_SHULKER_BOX, Blocks.GREEN_SHULKER_BOX, Blocks.LIGHT_BLUE_SHULKER_BOX, Blocks.LIGHT_GRAY_SHULKER_BOX, Blocks.LIME_SHULKER_BOX, Blocks.MAGENTA_SHULKER_BOX, Blocks.ORANGE_SHULKER_BOX, Blocks.PINK_SHULKER_BOX, Blocks.PURPLE_SHULKER_BOX, Blocks.RED_SHULKER_BOX, Blocks.WHITE_SHULKER_BOX, Blocks.YELLOW_SHULKER_BOX).map(ItemLike::asItem).collect(Collectors.toSet());

        protected JVBlockLoot() {
            super(EXPLOSION_RESISTANT, FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            this.dropSelf(PAPER_LANTERN.get());

            this.dropSelf(PAPER_LANTERN_WHITE.get());
            this.dropSelf(PAPER_LANTERN_BROWN.get());
            this.dropSelf(PAPER_LANTERN_GRAY.get());
            this.dropSelf(PAPER_LANTERN_LIGHT_GRAY.get());
            this.dropSelf(PAPER_LANTERN_RED.get());
            this.dropSelf(PAPER_LANTERN_ORANGE.get());
            this.dropSelf(PAPER_LANTERN_YELLOW.get());
            this.dropSelf(PAPER_LANTERN_LIME.get());
            this.dropSelf(PAPER_LANTERN_GREEN.get());
            this.dropSelf(PAPER_LANTERN_BLUE.get());
            this.dropSelf(PAPER_LANTERN_LIGHT_BLUE.get());
            this.dropSelf(PAPER_LANTERN_CYAN.get());
            this.dropSelf(PAPER_LANTERN_PURPLE.get());
            this.dropSelf(PAPER_LANTERN_MAGENTA.get());
            this.dropSelf(PAPER_LANTERN_PINK.get());
            this.dropSelf(PAPER_LANTERN_BLACK.get());

            this.dropSelf(PAPER_LANTERN_BLACK_DOT.get());
            this.dropSelf(PAPER_LANTERN_OBAKE.get());
            this.dropSelf(PAPER_LANTERN_RED_DOT.get());
            this.dropSelf(PAPER_LANTERN_SUN.get());

            this.dropSelf(SMALL_LANTERN.get());
            this.dropSelf(WHITE_SMALL_LANTERN.get());
            this.dropSelf(BROWN_SMALL_LANTERN.get());
            this.dropSelf(GRAY_SMALL_LANTERN.get());
            this.dropSelf(LIGHT_GRAY_SMALL_LANTERN.get());
            this.dropSelf(RED_SMALL_LANTERN.get());
            this.dropSelf(ORANGE_SMALL_LANTERN.get());
            this.dropSelf(YELLOW_SMALL_LANTERN.get());
            this.dropSelf(LIME_SMALL_LANTERN.get());
            this.dropSelf(GREEN_SMALL_LANTERN.get());
            this.dropSelf(BLUE_SMALL_LANTERN.get());
            this.dropSelf(LIGHT_BLUE_SMALL_LANTERN.get());
            this.dropSelf(CYAN_SMALL_LANTERN.get());
            this.dropSelf(PURPLE_SMALL_LANTERN.get());
            this.dropSelf(MAGENTA_SMALL_LANTERN.get());
            this.dropSelf(PINK_SMALL_LANTERN.get());
            this.dropSelf(BLACK_SMALL_LANTERN.get());

            this.dropSelf(TATAMI_LANTERN.get());
            this.dropSelf(JIZO_STONE.get());
            this.dropSelf(STONE_LAMP.get());

            this.dropSelf(WOOD_BELL.get());
            this.dropSelf(GLASS_BELL.get());
            this.dropSelf(COPPER_BELL.get());

            this.add(PINK_HYDRANGEA.get(), (block) -> createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
            this.add(BLUE_HYDRANGEA.get(), (block) -> createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
            this.add(CAMELLIA_BUSH.get(), (block) -> createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
        }

        @Override
        public @NotNull Iterable<Block> getKnownBlocks() {
            return getContent(ForgeRegistries.BLOCKS);
        }
    }
}
