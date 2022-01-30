package rakkis157.excessive_realism.world.features;

import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacedFeature;

public class EROreFeatures {

    // Banded Iron
    public static PlacedFeature BANDED_IRON = EROreConfiguredFeature.ORE_BANDED_IRON.withPlacement(
            RarityFilterPlacementModifier.of(10), CountPlacementModifier.of(2), SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.fixed(-16), YOffset.fixed(60)));
    public static PlacedFeature BANDED_IRON_TERRACOTTA = EROreConfiguredFeature.ORE_BANDED_IRON_TERRACOTTA.withPlacement(
            RarityFilterPlacementModifier.of(1), CountPlacementModifier.of(2), SquarePlacementModifier.of(),
            HeightRangePlacementModifier.trapezoid(YOffset.fixed(50), YOffset.fixed(100)));

    // Bog Iron
    public static PlacedFeature BOG_IRON = EROreConfiguredFeature.ORE_BOG_IRON.withPlacement(
            CountPlacementModifier.of(2), SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.fixed(52), YOffset.fixed(60)));

    // Ironstone
    public static PlacedFeature IRONSTONE = EROreConfiguredFeature.ORE_IRONSTONE.withPlacement(
            RarityFilterPlacementModifier.of(10), CountPlacementModifier.of(2),
            HeightRangePlacementModifier.uniform(YOffset.fixed(16), YOffset.fixed(80)));

    // Meteoric Iron
    /*public static PlacedFeature METEORIC_IRON_DESERT = EROreConfiguredFeature.ORE_METEORIC_IRON_DESERT.withPlacement(
            RarityFilterPlacementModifier.of(10), CountPlacementModifier.of(4),
            HeightRangePlacementModifier.uniform(YOffset.fixed(60), YOffset.fixed(90)));*/
}


