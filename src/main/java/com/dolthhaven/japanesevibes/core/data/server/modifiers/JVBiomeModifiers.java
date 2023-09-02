package com.dolthhaven.japanesevibes.core.data.server.modifiers;

import com.dolthhaven.japanesevibes.common.world.JVGeneration;
import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.dolthhaven.japanesevibes.core.data.server.tags.JVNewTags;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.HolderSet;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.JsonCodecProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JVBiomeModifiers {
    private static final RegistryAccess access = RegistryAccess.builtinCopy();
    private static final Registry<Biome> biomeRegistry = access.registryOrThrow(Registry.BIOME_REGISTRY);
    private static final Registry<PlacedFeature> placedFeatures = access.registryOrThrow(Registry.PLACED_FEATURE_REGISTRY);
    private static final HashMap<ResourceLocation, BiomeModifier> modifiers = new HashMap<>();

    public static JsonCodecProvider<BiomeModifier> register(GatherDataEvent event) {
        // features
        addFeature("blue_hydrangeas", JVNewTags.NewBiomeTags.HAS_HYDRANGEA_PATCH, GenerationStep.Decoration.VEGETAL_DECORATION, JVGeneration.JVPlacedFeatures.PATCH_BLUE_HYDRANGEA);
        addFeature("pink_hydrangeas", JVNewTags.NewBiomeTags.HAS_HYDRANGEA_PATCH, GenerationStep.Decoration.VEGETAL_DECORATION, JVGeneration.JVPlacedFeatures.PATCH_PINK_HYDRANGEA);

        addFeature("camellia_bush", JVNewTags.NewBiomeTags.HAS_CAMELLIA_PATCH, GenerationStep.Decoration.VEGETAL_DECORATION, JVGeneration.JVPlacedFeatures.PATCH_CAMELLIA_BUSH);



        return JsonCodecProvider.forDatapackRegistry(event.getGenerator(), event.getExistingFileHelper(), JapaneseVibes.MOD_ID, RegistryOps.create(JsonOps.INSTANCE, access), ForgeRegistries.Keys.BIOME_MODIFIERS, modifiers);
    }


    @SafeVarargs
    private static void addFeature(String name, TagKey<Biome> tagKey, GenerationStep.Decoration step, RegistryObject<PlacedFeature>... features) {
        modifiers.put(JapaneseVibes.REGISTRY_HELPER.prefix("features/" + name),
                new ForgeBiomeModifiers.AddFeaturesBiomeModifier(new HolderSet.Named<>(biomeRegistry, tagKey), featureSet(features), step));
    }

    @SafeVarargs
    private static HolderSet<PlacedFeature> featureSet(RegistryObject<PlacedFeature>... features) {
        return HolderSet.direct(Stream.of(features).map(registryObject -> {
            assert registryObject.getKey() != null;
            return placedFeatures.getOrCreateHolderOrThrow(registryObject.getKey());
        }).collect(Collectors.toList()));
    }
}
