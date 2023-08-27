package com.dolthhaven.japanesevibes.core.data.client;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;

public class JVItemModels extends ItemModelProvider {
    public JVItemModels(GatherDataEvent event) {
        super(event.getGenerator(), JapaneseVibes.MOD_ID, event.getExistingFileHelper());
    }

    @Override
    protected void registerModels() {
        this.generatedBlockSprite(PAPER_LANTERN);

        this.generatedBlockSprite(PAPER_LANTERN_WHITE);
        this.generatedBlockSprite(PAPER_LANTERN_BROWN);
        this.generatedBlockSprite(PAPER_LANTERN_GRAY);
        this.generatedBlockSprite(PAPER_LANTERN_LIGHT_GRAY);
        this.generatedBlockSprite(PAPER_LANTERN_RED);
        this.generatedBlockSprite(PAPER_LANTERN_ORANGE);
        this.generatedBlockSprite(PAPER_LANTERN_YELLOW);
        this.generatedBlockSprite(PAPER_LANTERN_LIME);
        this.generatedBlockSprite(PAPER_LANTERN_GREEN);
        this.generatedBlockSprite(PAPER_LANTERN_BLUE);
        this.generatedBlockSprite(PAPER_LANTERN_LIGHT_BLUE);
        this.generatedBlockSprite(PAPER_LANTERN_CYAN);
        this.generatedBlockSprite(PAPER_LANTERN_PURPLE);
        this.generatedBlockSprite(PAPER_LANTERN_MAGENTA);
        this.generatedBlockSprite(PAPER_LANTERN_PINK);
        this.generatedBlockSprite(PAPER_LANTERN_BLACK);

        this.generatedBlockSprite(PAPER_LANTERN_BLACK_DOT);
        this.generatedBlockSprite(PAPER_LANTERN_OBAKE);
        this.generatedBlockSprite(PAPER_LANTERN_RED_DOT);
        this.generatedBlockSprite(PAPER_LANTERN_SUN);

        this.generatedCross(SMALL_LANTERN);
        this.generatedCross(WHITE_SMALL_LANTERN);
        this.generatedCross(BROWN_SMALL_LANTERN);
        this.generatedCross(GRAY_SMALL_LANTERN);
        this.generatedCross(LIGHT_GRAY_SMALL_LANTERN);
        this.generatedCross(RED_SMALL_LANTERN);
        this.generatedCross(ORANGE_SMALL_LANTERN);
        this.generatedCross(YELLOW_SMALL_LANTERN);
        this.generatedCross(LIME_SMALL_LANTERN);
        this.generatedCross(GREEN_SMALL_LANTERN);
        this.generatedCross(BLUE_SMALL_LANTERN);
        this.generatedCross(LIGHT_BLUE_SMALL_LANTERN);
        this.generatedCross(CYAN_SMALL_LANTERN);
        this.generatedCross(PURPLE_SMALL_LANTERN);
        this.generatedCross(MAGENTA_SMALL_LANTERN);
        this.generatedCross(PINK_SMALL_LANTERN);
        this.generatedCross(BLACK_SMALL_LANTERN);
    }

    // Uses item/generated with texture in jv:item/item_name
    private void generated(RegistryObject<? extends ItemLike> item) {
        this.withExistingParent(this.getName(item), "item/generated").texture("layer0", this.modLoc("item/" + this.getName(item)));
    }

    // Uses item/generated with texture in jv:block/item_name
    private void generatedCross(RegistryObject<? extends ItemLike> item) {
        this.withExistingParent(this.getName(item), "item/generated").texture("layer0", this.modLoc("block/" + this.getName(item)));
    }

    // A block that uses item/generated with texture in jv:block/item_name
    private void generatedBlockSprite(RegistryObject<? extends Block> block) {
        this.withExistingParent(this.getName(() -> block.get().asItem()), "item/generated").texture("layer0", this.modLoc("item/" + this.getName(() -> block.get().asItem())));
    }

    private void generatedWithOverlay(RegistryObject<? extends ItemLike> item) {
        String name = this.getName(item);
        this.withExistingParent(name, "item/generated").texture("layer0", this.modLoc("item/" + name)).texture("layer1", this.modLoc("item/" + name + "_overlay"));
    }

    private void spawnEgg(RegistryObject<? extends Item> egg) {
        this.withExistingParent(this.getName(egg), "item/template_spawn_egg");
    }




    private String getName(Supplier<? extends ItemLike> object) {
        return ForgeRegistries.ITEMS.getKey(object.get().asItem()).getPath();
    }
}
