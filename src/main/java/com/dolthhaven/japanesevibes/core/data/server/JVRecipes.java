package com.dolthhaven.japanesevibes.core.data.server;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.registry.JVBlocks;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
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

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> stuff) {
        ShapedRecipeBuilder.shaped(PAPER_LANTERN.get()).define('#', Items.PAPER).define('X', Items.TORCH).define('A', Items.STICK).pattern(" A ").pattern("#X#").pattern("###").unlockedBy("has_torch", has(Items.TORCH)).unlockedBy("has_paper", has(Items.PAPER)).save(stuff);

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

        ShapedRecipeBuilder.shaped(JIZO_STONE.get()).define('a', Blocks.CHISELED_STONE_BRICKS).define('b', Blocks.ANDESITE).pattern("a").pattern("b").unlockedBy("has_chiseled_stone", has(Blocks.CHISELED_STONE_BRICKS)).save(stuff);
        ShapedRecipeBuilder.shaped(STONE_LAMP.get()).define('a', Blocks.STONE).define('b', Blocks.TORCH).pattern("a").pattern("b").pattern("a").unlockedBy("has_stone", has(Blocks.STONE)).unlockedBy("has_torch", has(Blocks.TORCH)).save(stuff);

        largeFlowerToDyeRecipe(DyeColor.PINK, PINK_HYDRANGEA.get(), stuff);
        largeFlowerToDyeRecipe(DyeColor.LIGHT_BLUE, BLUE_HYDRANGEA.get(), stuff);

        ShapedRecipeBuilder.shaped(SMALL_LANTERN.get()).define('1', Items.PAPER).define('2', Items.STRING).define('3', Items.TORCH)
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

        ShapelessRecipeBuilder.shapeless(TAIYAKI.get()).requires(Items.WHEAT, 2).requires(Items.COCOA_BEANS).requires(Items.SUGAR).unlockedBy("has_wheat", has(Items.WHEAT)).unlockedBy("has_cocoa_bean", has(Items.COCOA_BEANS)).unlockedBy("has_sugar", has(Items.SUGAR)).save(stuff);
        ShapelessRecipeBuilder.shapeless(SHAVED_ICE.get()).requires(Items.ICE).requires(Items.HONEY_BOTTLE).requires(Items.BOWL).unlockedBy("has_ice", has(Items.ICE)).save(stuff);
        ShapelessRecipeBuilder.shapeless(CARAMEL_APPLE.get()).requires(Items.SUGAR, 2).requires(Items.APPLE).requires(Items.BOWL).unlockedBy("has_apple", has(Items.APPLE)).unlockedBy("has_sugar", has(Items.SUGAR)).save(stuff);

    }

    private void paperLanternRedyeRecipe(ItemLike lantern, DyeColor color, Consumer<FinishedRecipe> stuff) {
        redyeRecipe(lantern, col ->  JapaneseVibes.rlOf("paper_lantern_" + col.getName()), color, JVBlocks.PAPER_LANTERN.get(), true, stuff);
    }

    private void smallLanternRedyeRecipe(ItemLike lantern, DyeColor color, Consumer<FinishedRecipe> stuff) {
        redyeRecipe(lantern, col ->  JapaneseVibes.rlOf(col.getName() + "_small_lantern"), color, SMALL_LANTERN.get(), true, stuff);
    }

    private void redyeRecipe(ItemLike item, Function<DyeColor, ResourceLocation> itemMap, DyeColor color, ItemLike baseItem, boolean hasColorlessVersion, Consumer<FinishedRecipe> stuff) {
        Item dye = getDyeFromDyeColor(color);
        ShapelessRecipeBuilder.shapeless(item).requires(Ingredient.of(
                 Arrays.stream(DyeColor.values())
                      .map(col -> (ItemLike) (Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(itemMap.apply(col)))))
                      .map(i -> {
                          if (i == item.asItem()) return hasColorlessVersion ? baseItem : null;
                          else return i;
                      }).filter(Objects::nonNull).toArray(ItemLike[]::new)))
                .requires(dye).unlockedBy("has_thing", has(baseItem)).unlockedBy("has_dye", has(dye)).save(stuff);
    }

    private void largeFlowerToDyeRecipe(DyeColor dye, ItemLike flower, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(getDyeFromDyeColor(dye), 2).requires(flower).unlockedBy("has_flower", has(flower)).save(consumer);
    }

    public static @NotNull Item getDyeFromDyeColor(DyeColor color) {
        return Objects.requireNonNull(ForgeRegistries.ITEMS.getValue(new ResourceLocation(color.getName() + "_dye")));
    }
}
