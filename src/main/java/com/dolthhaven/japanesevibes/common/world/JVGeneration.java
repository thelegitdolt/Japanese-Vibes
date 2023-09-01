package com.dolthhaven.japanesevibes.common.world;

import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.registry.JVBlocks;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class JVGeneration {
    public static final class JVFeatures {
        public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, JapaneseVibes.MOD_ID);

        public static final RegistryObject<ConfiguredFeature<SimpleRandomFeatureConfiguration, ?>> PATCH_BLUE_HYDRANGEA =
                CONFIGURED_FEATURES.register("patch_blue_hydrangea", () -> new ConfiguredFeature<>(Feature.SIMPLE_RANDOM_SELECTOR,
                        new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH,
                                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                                        new SimpleBlockConfiguration(BlockStateProvider.simple(JVBlocks.BLUE_HYDRANGEA.get()))))))));

        public static final RegistryObject<ConfiguredFeature<SimpleRandomFeatureConfiguration, ?>> PATCH_PINK_HYDRANGEA =
                CONFIGURED_FEATURES.register("patch_pink_hydrangea", () -> new ConfiguredFeature<>(Feature.SIMPLE_RANDOM_SELECTOR,
                        new SimpleRandomFeatureConfiguration(HolderSet.direct(PlacementUtils.inlinePlaced(Feature.RANDOM_PATCH,
                                FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                                        new SimpleBlockConfiguration(BlockStateProvider.simple(JVBlocks.PINK_HYDRANGEA.get()))))))));


        private static <FC extends FeatureConfiguration, F extends Feature<FC>> RegistryObject<ConfiguredFeature<FC, ?>> register(String name, Supplier<ConfiguredFeature<FC, F>> feature) {
            return CONFIGURED_FEATURES.register(name, feature);
        }
    }

    public static final class JVPlacedFeatures {
        public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, JapaneseVibes.MOD_ID);

        public static final RegistryObject<PlacedFeature> PATCH_BLUE_HYDRANGEA= register("patch_blue_hydrangea", JVFeatures.PATCH_BLUE_HYDRANGEA,
                RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());
        public static final RegistryObject<PlacedFeature> PATCH_PINK_HYDRANGEA= register("patch_pink_hydrangea", JVFeatures.PATCH_PINK_HYDRANGEA,
                RarityFilter.onAverageOnceEvery(8), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP_WORLD_SURFACE, BiomeFilter.biome());


        private static RegistryObject<PlacedFeature> register(String name, RegistryObject<? extends ConfiguredFeature<?, ?>> feature, PlacementModifier... placementModifiers) {
            return PLACED_FEATURES.register(name, () -> new PlacedFeature((Holder<ConfiguredFeature<?, ?>>) feature.getHolder().get(), ImmutableList.copyOf(placementModifiers)));
        }
    }
}
