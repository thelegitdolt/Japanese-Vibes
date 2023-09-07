package com.dolthhaven.japanesevibes.core.data.server;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.registry.JVBlocks;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;
import static com.dolthhaven.japanesevibes.core.registry.JVItems.*;

public class JVRecipes extends RecipeProvider {
    public JVRecipes(GatherDataEvent e) {
        super(e.getGenerator());
    }

    private static final String PAPER_LANTERN_GROUP = "japanese_vibes:paper_lanterns";
    private static final String SMALL_LANTERN_GROUP = "japanese_vibes:small_lanterns";


    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> stuff) {
        ShapedRecipeBuilder.shaped(PAPER_LANTERN.get()).define('#', Items.PAPER).define('X', Items.TORCH).define('A', Items.STICK).pattern(" A ").pattern("#X#").pattern("###").unlockedBy("has_torch", has(Items.TORCH)).unlockedBy("has_paper", has(Items.PAPER)).group(PAPER_LANTERN_GROUP).save(stuff);

        paperLanternRedyeRecipe(PAPER_LANTERN_WHITE.get(), DyeColor.WHITE, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_BROWN.get(), DyeColor.BROWN, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_GRAY.get(), DyeColor.GRAY, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_LIGHT_GRAY.get(), DyeColor.LIGHT_GRAY, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_RED.get(), DyeColor.RED, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_ORANGE.get(), DyeColor.ORANGE, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_YELLOW.get(), DyeColor.YELLOW, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_LIME.get(), DyeColor.LIME, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_GREEN.get(), DyeColor.GREEN, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_BLUE.get(), DyeColor.BLUE, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_LIGHT_BLUE.get(), DyeColor.LIGHT_BLUE, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_CYAN.get(), DyeColor.CYAN, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_PURPLE.get(), DyeColor.PURPLE, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_MAGENTA.get(), DyeColor.MAGENTA, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_PINK.get(), DyeColor.PINK, stuff);
        paperLanternRedyeRecipe(PAPER_LANTERN_BLACK.get(), DyeColor.BLACK, stuff);

        ShapelessRecipeBuilder.shapeless(PAPER_LANTERN_BLACK_DOT.get())
                .requires(PAPER_LANTERN_RED.get()).requires(Items.INK_SAC).unlockedBy("has_red_lantern", has(PAPER_LANTERN_RED.get())).unlockedBy("has_dye", has(Items.INK_SAC)).save(stuff);
        ShapelessRecipeBuilder.shapeless(PAPER_LANTERN_RED_DOT.get())
                .requires(PAPER_LANTERN_BLACK.get()).requires(Items.REDSTONE).unlockedBy("has_black_lantern", has(PAPER_LANTERN_BLACK.get())).unlockedBy("has_dye", has(Items.REDSTONE)).save(stuff);
        ShapelessRecipeBuilder.shapeless(PAPER_LANTERN_SUN.get())
                .requires(PAPER_LANTERN_WHITE.get()).requires(Items.REDSTONE).unlockedBy("has_white_lantern", has(PAPER_LANTERN_WHITE.get())).unlockedBy("has_dye", has(Items.REDSTONE)).save(stuff);
        ShapelessRecipeBuilder.shapeless(PAPER_LANTERN_OBAKE.get())
                .requires(PAPER_LANTERN_RED.get()).requires(Items.ENDER_PEARL).unlockedBy("has_red_lantern", has(PAPER_LANTERN_RED.get())).unlockedBy("has_dye", has(Items.ENDER_PEARL)).save(stuff);


        ShapedRecipeBuilder.shaped(JIZO_STONE.get()).define('a', Blocks.CHISELED_STONE_BRICKS).define('b', Blocks.ANDESITE).pattern("a").pattern("b").unlockedBy("has_chiseled_stone", has(Blocks.CHISELED_STONE_BRICKS)).save(stuff);
        ShapedRecipeBuilder.shaped(STONE_LAMP.get()).define('a', Blocks.STONE).define('b', Blocks.TORCH).pattern("a").pattern("b").pattern("a").unlockedBy("has_stone", has(Blocks.STONE)).unlockedBy("has_torch", has(Blocks.TORCH)).save(stuff);

        largeFlowerToDyeRecipe(DyeColor.PINK, PINK_HYDRANGEA.get(), stuff);
        largeFlowerToDyeRecipe(DyeColor.LIGHT_BLUE, BLUE_HYDRANGEA.get(), stuff);

        ShapedRecipeBuilder.shaped(SMALL_LANTERN.get()).define('1', Items.PAPER).define('2', Items.STRING).define('3', Items.TORCH).group(SMALL_LANTERN_GROUP)
                .pattern(" 2 ").pattern("131").pattern(" 2 ").unlockedBy("has_paper", has(Items.PAPER)).unlockedBy("has_torch", has(Items.TORCH)).save(stuff);

        smallLanternRedyeRecipe(WHITE_SMALL_LANTERN.get(), DyeColor.WHITE, stuff);
        smallLanternRedyeRecipe(BROWN_SMALL_LANTERN.get(), DyeColor.BROWN, stuff);
        smallLanternRedyeRecipe(GRAY_SMALL_LANTERN.get(), DyeColor.GRAY, stuff);
        smallLanternRedyeRecipe(LIGHT_GRAY_SMALL_LANTERN.get(), DyeColor.LIGHT_GRAY, stuff);
        smallLanternRedyeRecipe(RED_SMALL_LANTERN.get(), DyeColor.RED, stuff);
        smallLanternRedyeRecipe(ORANGE_SMALL_LANTERN.get(), DyeColor.ORANGE, stuff);
        smallLanternRedyeRecipe(YELLOW_SMALL_LANTERN.get(), DyeColor.YELLOW, stuff);
        smallLanternRedyeRecipe(LIME_SMALL_LANTERN.get(), DyeColor.LIME, stuff);
        smallLanternRedyeRecipe(GREEN_SMALL_LANTERN.get(), DyeColor.GREEN, stuff);
        smallLanternRedyeRecipe(BLUE_SMALL_LANTERN.get(), DyeColor.BLUE, stuff);
        smallLanternRedyeRecipe(LIGHT_BLUE_SMALL_LANTERN.get(), DyeColor.LIGHT_BLUE, stuff);
        smallLanternRedyeRecipe(CYAN_SMALL_LANTERN.get(), DyeColor.CYAN, stuff);
        smallLanternRedyeRecipe(PURPLE_SMALL_LANTERN.get(), DyeColor.PURPLE, stuff);
        smallLanternRedyeRecipe(MAGENTA_SMALL_LANTERN.get(), DyeColor.MAGENTA, stuff);
        smallLanternRedyeRecipe(PINK_SMALL_LANTERN.get(), DyeColor.PINK, stuff);
        smallLanternRedyeRecipe(BLACK_SMALL_LANTERN.get(), DyeColor.BLACK, stuff);

        ShapedRecipeBuilder.shaped(TATAMI_LANTERN.get()).define('1', Items.PAPER).define('2', Items.BAMBOO).define('3', Items.TORCH)
                .pattern(" 2 ").pattern("131").pattern(" 2 ").unlockedBy("has_paper", has(Items.PAPER)).unlockedBy("has_torch", has(Items.TORCH)).unlockedBy("has_bamboo", has(Items.BAMBOO)).save(stuff);

        ShapelessRecipeBuilder.shapeless(TAIYAKI.get()).requires(Items.WHEAT, 2).requires(Items.COCOA_BEANS).requires(Items.SUGAR).unlockedBy("has_wheat", has(Items.WHEAT)).unlockedBy("has_cocoa_bean", has(Items.COCOA_BEANS)).unlockedBy("has_sugar", has(Items.SUGAR)).save(stuff);
        ShapelessRecipeBuilder.shapeless(SHAVED_ICE.get()).requires(Items.ICE).requires(Items.HONEY_BOTTLE).requires(Items.BOWL).unlockedBy("has_ice", has(Items.ICE)).save(stuff);
        ShapelessRecipeBuilder.shapeless(CARAMEL_APPLE.get()).requires(Items.SUGAR, 2).requires(Items.APPLE).requires(Items.BOWL).unlockedBy("has_apple", has(Items.APPLE)).unlockedBy("has_sugar", has(Items.SUGAR)).save(stuff);

        ShapedRecipeBuilder.shaped(GLASS_BELL.get()).define('a', Items.GLASS).define('b', Items.STICK).define('c', Items.IRON_NUGGET).pattern(" b ").pattern(" a ").pattern("ccc").unlockedBy("has_glass", has(Items.GLASS)).save(stuff);
        ShapedRecipeBuilder.shaped(COPPER_BELL.get()).define('a', Items.COPPER_BLOCK).define('b', Items.LIGHTNING_ROD).define('c', Items.COPPER_INGOT).pattern("b").pattern("a").pattern("c").unlockedBy("has_copper_block", has(Items.COPPER_BLOCK)).save(stuff);
        ShapedRecipeBuilder.shaped(WOOD_BELL.get()).define('a', ItemTags.PLANKS).define('b', Items.STICK).define('c', Items.IRON_NUGGET).pattern(" b ").pattern("aca").pattern(" c ").unlockedBy("has_planks", has(ItemTags.PLANKS)).save(stuff);
    }

    private void paperLanternRedyeRecipe(ItemLike lantern, DyeColor color, Consumer<FinishedRecipe> stuff) {
        redyeRecipe(lantern, col ->  JapaneseVibes.rlOf("paper_lantern_" + col), color, JVBlocks.PAPER_LANTERN.get(), true, PAPER_LANTERN_GROUP, stuff);
    }

    private void smallLanternRedyeRecipe(ItemLike lantern, DyeColor color, Consumer<FinishedRecipe> stuff) {
        redyeRecipe(lantern,  col ->  JapaneseVibes.rlOf(col + "_small_lantern"), color, SMALL_LANTERN.get(), true, SMALL_LANTERN_GROUP, stuff);
    }

    private void redyeRecipe(ItemLike item, Function<String, ResourceLocation> itemMap, DyeColor color, ItemLike baseItem, boolean hasColorlessVersion, String group, Consumer<FinishedRecipe> stuff) {
        Item dye = getDyeFromDyeColor(color);
        ShapelessRecipeBuilder.shapeless(item).requires(Ingredient.of(
                 Arrays.stream(DyeColor.values())
                      .map(col -> (Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(itemMap.apply(col.getName())))))
                      .map(i -> i == item.asItem() ? (hasColorlessVersion ? baseItem : null) : i).filter(Objects::nonNull).toArray(ItemLike[]::new)))
                .requires(dye).unlockedBy("has_thing", has(baseItem)).group(group).unlockedBy("has_dye", has(dye)).save(stuff);
    }

    private void largeFlowerToDyeRecipe(DyeColor dye, ItemLike flower, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(getDyeFromDyeColor(dye), 2).requires(flower).unlockedBy("has_flower", has(flower)).save(consumer, JapaneseVibes.rlOf(dye.getName() + "_dye_from_" + Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(flower.asItem())).getPath()));
    }

    public static @NotNull Item getDyeFromDyeColor(DyeColor color) {
        return Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(new ResourceLocation(color.getName() + "_dye")));
    }
}
