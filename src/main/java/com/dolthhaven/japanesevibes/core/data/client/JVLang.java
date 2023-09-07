package com.dolthhaven.japanesevibes.core.data.client;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.codehaus.plexus.util.StringUtils;

import java.util.Objects;

import static com.dolthhaven.japanesevibes.core.data.client.JVSoundEventStuff.getBlockSubtitle;
import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;
import static com.dolthhaven.japanesevibes.core.registry.JVItems.*;

public class JVLang extends LanguageProvider {

    public JVLang(GatherDataEvent e) {
        super(e.getGenerator(), JapaneseVibes.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.simpleBlock(PAPER_LANTERN);

        this.paperLantern(PAPER_LANTERN_WHITE);
        this.paperLantern(PAPER_LANTERN_BROWN);
        this.paperLantern(PAPER_LANTERN_GRAY);
        this.paperLantern(PAPER_LANTERN_LIGHT_GRAY);
        this.paperLantern(PAPER_LANTERN_RED);
        this.paperLantern(PAPER_LANTERN_ORANGE);
        this.paperLantern(PAPER_LANTERN_YELLOW);
        this.paperLantern(PAPER_LANTERN_LIME);
        this.paperLantern(PAPER_LANTERN_GREEN);
        this.paperLantern(PAPER_LANTERN_BLUE);
        this.paperLantern(PAPER_LANTERN_LIGHT_BLUE);
        this.paperLantern(PAPER_LANTERN_CYAN);
        this.paperLantern(PAPER_LANTERN_PURPLE);
        this.paperLantern(PAPER_LANTERN_MAGENTA);
        this.paperLantern(PAPER_LANTERN_PINK);
        this.paperLantern(PAPER_LANTERN_BLACK);

        this.paperLantern(PAPER_LANTERN_BLACK_DOT);
        this.paperLantern(PAPER_LANTERN_OBAKE);
        this.paperLantern(PAPER_LANTERN_RED_DOT);
        this.paperLantern(PAPER_LANTERN_SUN);

        this.simpleBlock(SMALL_LANTERN);
        this.simpleBlock(WHITE_SMALL_LANTERN);
        this.simpleBlock(BROWN_SMALL_LANTERN);
        this.simpleBlock(GRAY_SMALL_LANTERN);
        this.simpleBlock(LIGHT_GRAY_SMALL_LANTERN);
        this.simpleBlock(RED_SMALL_LANTERN);
        this.simpleBlock(ORANGE_SMALL_LANTERN);
        this.simpleBlock(YELLOW_SMALL_LANTERN);
        this.simpleBlock(LIME_SMALL_LANTERN);
        this.simpleBlock(GREEN_SMALL_LANTERN);
        this.simpleBlock(BLUE_SMALL_LANTERN);
        this.simpleBlock(LIGHT_BLUE_SMALL_LANTERN);
        this.simpleBlock(CYAN_SMALL_LANTERN);
        this.simpleBlock(PURPLE_SMALL_LANTERN);
        this.simpleBlock(MAGENTA_SMALL_LANTERN);
        this.simpleBlock(PINK_SMALL_LANTERN);
        this.simpleBlock(BLACK_SMALL_LANTERN);

        this.simpleBlock(WOOD_BELL);
        this.simpleBlock(GLASS_BELL);
        this.simpleBlock(COPPER_BELL);

        this.simpleBlock(JIZO_STONE);
        this.simpleBlock(STONE_LAMP);
        this.simpleBlock(TATAMI_LANTERN);

        this.simpleItem(CARAMEL_APPLE);
        this.simpleItem(SHAVED_ICE);
        this.simpleItem(TAIYAKI);

        this.simpleBlock(CAMELLIA_BUSH);
        this.simpleBlock(PINK_HYDRANGEA);
        this.simpleBlock(BLUE_HYDRANGEA);

        this.add(getBlockSubtitle(WOOD_BELL, "chime"),  "Wood Bell Chimes");
        this.add(getBlockSubtitle(GLASS_BELL, "chime"),  "Glass Bell Chimes");
        this.add(getBlockSubtitle(COPPER_BELL, "chime"),  "Copper Bell Chimes");
    }

    private void paperLantern(RegistryObject<Block> lantern) {
        String path = StringUtils.capitaliseAllWords(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(lantern.get().asItem())).getPath().replace('_', ' ').substring(14));

        this.add(lantern.get(), path + " Paper Lantern");
    }

    private void subtitle() {

    }

    private void simpleBlock(RegistryObject<Block> block) {
        String name = StringUtils.capitaliseAllWords(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(block.get().asItem())).getPath().replace('_', ' '));

        this.add(block.get(), name);
    }

    private void simpleItem(RegistryObject<Item> item) {
        String name = StringUtils.capitaliseAllWords(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(item.get())).getPath().replace('_', ' '));

        this.add(item.get(), name);
    }


}
