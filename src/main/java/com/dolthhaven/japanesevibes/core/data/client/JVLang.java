package com.dolthhaven.japanesevibes.core.data.client;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.codehaus.plexus.util.StringUtils;

import java.util.Objects;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;

public class JVLang extends LanguageProvider {

    public JVLang(GatherDataEvent e) {
        super(e.getGenerator(), JapaneseVibes.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.add(PAPER_LANTERN.get(), "Paper Lantern");

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
    }

    private void paperLantern(RegistryObject<Block> lantern) {
        String path = StringUtils.capitaliseAllWords(Objects.requireNonNull(ForgeRegistries.ITEMS.getKey(lantern.get().asItem())).getPath().replace('_', ' ').substring(14));

        this.add(lantern.get(), path + " Paper Lantern");
    }


}
