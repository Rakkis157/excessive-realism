package rakkis157.excessive_realism.world.features;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.NoiseColumnSampler;
import net.minecraft.world.gen.feature.*;
import rakkis157.excessive_realism.ExcessiveRealism;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;


public class ERConfiguredFeatures {

    public static void init() {
        ExcessiveRealism.LOGGER.info("Initializing " + ExcessiveRealism.MOD_NAME + " Features");

        //Banded Iron
        placedFeature("ore_banded_iron", EROreFeatures.BANDED_IRON);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(ExcessiveRealism.MOD_ID, "ore_banded_iron")));
        placedFeature("ore_banded_iron_terracotta", EROreFeatures.BANDED_IRON_TERRACOTTA);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.BADLANDS),
                GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(ExcessiveRealism.MOD_ID, "ore_banded_iron_terracotta")));

        //Bog Iron
        placedFeature("ore_bog_iron", EROreFeatures.BOG_IRON);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE, BiomeKeys.SWAMP),
                GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(ExcessiveRealism.MOD_ID, "ore_bog_iron")));

        //Ironstone
        placedFeature("ore_ironstone", EROreFeatures.IRONSTONE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                new Identifier(ExcessiveRealism.MOD_ID, "ore_ironstone")));

        /* TODO:
        *   Add Meteoric Iron
        */
    }
    
    public static void placedFeature(String name, PlacedFeature placedFeature){
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(ExcessiveRealism.MOD_ID, name), placedFeature);
    }
}