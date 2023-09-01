package com.dolthhaven.japanesevibes.core.other;

import com.teamabnormals.blueprint.core.util.DataUtil;

import static com.dolthhaven.japanesevibes.core.registry.JVBlocks.*;
import static com.dolthhaven.japanesevibes.core.registry.JVItems.*;

public class JVIntegration {
    public static void register() {
        registerCompostables();
    }

    public static void registerCompostables() {
        DataUtil.registerCompostable(BLUE_HYDRANGEA.get(), 0.65f);
        DataUtil.registerCompostable(PINK_HYDRANGEA.get(), 0.65f);
        DataUtil.registerCompostable(CAMELLIA_BUSH.get(), 0.65f);

        DataUtil.registerCompostable(TAIYAKI.get(), 0.8f);
    }



}
