package com.dolthhaven.japanesevibes.client.data;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;
import java.util.function.Supplier;

import static com.dolthhaven.japanesevibes.core.JVBlocks.*;


public class JVBlockstatesProvider extends BlockStateProvider {

    public JVBlockstatesProvider(GatherDataEvent event) {
        super(event.getGenerator(), JapaneseVibes.MOD_ID, event.getExistingFileHelper());
    }
    @Override
    protected void registerStatesAndModels() {
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
    }


    private void paperLantern(RegistryObject<Block> lantern, DyeColor color) {
        String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(lantern.get())).getPath();
        this.getVariantBuilder(lantern.get())
                .partialState().with(LanternBlock.HANGING, true).addModels(existingModel("block/paper_lantern_" + color.getName()))
                .partialState().with(LanternBlock.HANGING, false).addModels(existingModel("block/paper_lantern_" + color.getName()));

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
