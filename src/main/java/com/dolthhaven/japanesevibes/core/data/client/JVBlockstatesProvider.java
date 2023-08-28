package com.dolthhaven.japanesevibes.core.data.client;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;


public class JVBlockstatesProvider extends BlockStateProvider {

    public JVBlockstatesProvider(GatherDataEvent event) {
        super(event.getGenerator(), JapaneseVibes.MOD_ID, event.getExistingFileHelper());
    }
    @Override
    protected void registerStatesAndModels() {
        this.paperLanternVanilla();

        this.paperLantern(PAPER_LANTERN_WHITE, DyeColor.WHITE);
        this.paperLantern(PAPER_LANTERN_BROWN, DyeColor.BROWN);
        this.paperLantern(PAPER_LANTERN_GRAY, DyeColor.GRAY);
        this.paperLantern(PAPER_LANTERN_LIGHT_GRAY, DyeColor.LIGHT_GRAY);
        this.paperLantern(PAPER_LANTERN_RED, DyeColor.RED);
        this.paperLantern(PAPER_LANTERN_ORANGE, DyeColor.ORANGE);
        this.paperLantern(PAPER_LANTERN_YELLOW, DyeColor.YELLOW);
        this.paperLantern(PAPER_LANTERN_LIME, DyeColor.LIME);
        this.paperLantern(PAPER_LANTERN_GREEN, DyeColor.GREEN);
        this.paperLantern(PAPER_LANTERN_BLUE, DyeColor.BLUE);
        this.paperLantern(PAPER_LANTERN_LIGHT_BLUE, DyeColor.LIGHT_BLUE);
        this.paperLantern(PAPER_LANTERN_CYAN, DyeColor.CYAN);
        this.paperLantern(PAPER_LANTERN_PURPLE, DyeColor.PURPLE);
        this.paperLantern(PAPER_LANTERN_MAGENTA, DyeColor.MAGENTA);
        this.paperLantern(PAPER_LANTERN_PINK, DyeColor.PINK);
        this.paperLantern(PAPER_LANTERN_BLACK, DyeColor.BLACK);

        this.paperLanternSpecial(PAPER_LANTERN_BLACK_DOT, "black_dot");
        this.paperLanternSpecial(PAPER_LANTERN_OBAKE, "obake");
        this.paperLanternSpecial(PAPER_LANTERN_RED_DOT, "red_dot");
        this.paperLanternSpecial(PAPER_LANTERN_SUN, "sun");

        this.simpleCross(SMALL_LANTERN);
        this.simpleCross(WHITE_SMALL_LANTERN);
        this.simpleCross(BROWN_SMALL_LANTERN);
        this.simpleCross(GRAY_SMALL_LANTERN);
        this.simpleCross(LIGHT_GRAY_SMALL_LANTERN);
        this.simpleCross(RED_SMALL_LANTERN);
        this.simpleCross(ORANGE_SMALL_LANTERN);
        this.simpleCross(YELLOW_SMALL_LANTERN);
        this.simpleCross(LIME_SMALL_LANTERN);
        this.simpleCross(GREEN_SMALL_LANTERN);
        this.simpleCross(BLUE_SMALL_LANTERN);
        this.simpleCross(LIGHT_BLUE_SMALL_LANTERN);
        this.simpleCross(CYAN_SMALL_LANTERN);
        this.simpleCross(PURPLE_SMALL_LANTERN);
        this.simpleCross(MAGENTA_SMALL_LANTERN);
        this.simpleCross(PINK_SMALL_LANTERN);
        this.simpleCross(BLACK_SMALL_LANTERN);

        this.simpleCross(WOOD_BELL);

        this.existingModelWithDirection(JIZO_STONE);
        this.existingModel(TATAMI_LANTERN);
        this.existingModel(STONE_LAMP);
    }


    private void paperLantern(RegistryObject<Block> lantern, DyeColor color) {
        this.getVariantBuilder(lantern.get())
                .partialState().with(LanternBlock.HANGING, true).addModels(existingModel("block/paper_lantern_" + color.getName()))
                .partialState().with(LanternBlock.HANGING, false).addModels(existingModel("block/paper_lantern_" + color.getName()));
    }

    private void paperLanternSpecial(RegistryObject<Block> lantern, String type) {
        this.getVariantBuilder(lantern.get()).forAllStates(blockState -> ConfiguredModel.builder()
                .modelFile(new ModelFile.ExistingModelFile(JapaneseVibes.rlOf("block/paper_lantern_" + type), this.models().existingFileHelper))
                .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                .build());
    }

    private void existingModel(RegistryObject<Block> block) {
        this.simpleBlock(block.get(), new ModelFile.ExistingModelFile(JapaneseVibes.rlOf("block/" + this.getName(block)), this.models().existingFileHelper));
    }

    private void existingModelWithDirection(RegistryObject<Block> block) {
        this.getVariantBuilder(block.get()).forAllStates(state -> ConfiguredModel.builder()
                .modelFile(new ModelFile.ExistingModelFile(JapaneseVibes.rlOf("block/" + this.getName(block)), this.models().existingFileHelper))
                .rotationY(((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                .build());
    }

    private void existingModelItemSprite(RegistryObject<Block> block) {
        this.existingModel(block);
        this.itemModel(block);
    }

    private void paperLanternVanilla() {
        this.getVariantBuilder(PAPER_LANTERN.get())
                .partialState().with(LanternBlock.HANGING, true).addModels(existingModel("block/paper_lantern"))
                .partialState().with(LanternBlock.HANGING, false).addModels(existingModel("block/paper_lantern"));
    }

    private void simpleCross(RegistryObject<? extends Block> block) {
        this.simpleBlock(block.get(), this.models().cross(this.getName(block), this.blockTexture(block.get())).renderType("cutout"));
    }



    private void cubeAll(RegistryObject<? extends Block> block, ResourceLocation texture) {
        this.simpleBlock(block.get(), this.models().cubeAll(this.getName(block), texture));
        this.itemModel(block);
    }




    private void itemModel(RegistryObject<? extends Block> block) {
        this.itemModels().withExistingParent(this.getName(block), this.blockTexture(block.get()));
    }

    private void generatedItem(RegistryObject<? extends ItemLike> item) {
        this.itemModels().withExistingParent(this.getName(item), "item/generated").texture("layer0", this.modLoc("block/" + this.getName(item)));
    }

    private String getName(Supplier<? extends ItemLike> object) {
        return ForgeRegistries.ITEMS.getKey(object.get().asItem()).getPath();
    }

    private ConfiguredModel existingModel(String nameSpace) {
        return new ConfiguredModel(new ModelFile.ExistingModelFile(JapaneseVibes.rlOf(nameSpace), this.models().existingFileHelper));
    }
}
