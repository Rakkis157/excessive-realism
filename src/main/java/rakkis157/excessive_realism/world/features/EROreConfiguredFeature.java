package rakkis157.excessive_realism.world.features;

import net.minecraft.world.gen.feature.*;
import rakkis157.excessive_realism.block.ERBlock;

public class EROreConfiguredFeature {

    //Bog Iron
    public static final ConfiguredFeature<?, ?> ORE_BOG_IRON = ConfiguredFeatures.register("ore_bog_iron", Feature.ORE.configure(
            new OreFeatureConfig(EROreConfiguredFeatures.BASE_DIRT_OVERWORLD, ERBlock.BOG_IRON.getDefaultState(), 40)));

    //Banded Iron
    public static final ConfiguredFeature<?, ?> ORE_BANDED_IRON = ConfiguredFeatures.register("ore_banded_iron", Feature.ORE.configure(
            new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD, ERBlock.BANDED_IRON.getDefaultState(), 64)));
    public static final ConfiguredFeature<?, ?> ORE_BANDED_IRON_TERRACOTTA = ConfiguredFeatures.register("ore_banded_iron_terracotta", Feature.ORE.configure(
            new OreFeatureConfig(EROreConfiguredFeatures.BASE_TERRACOTTA_OVERWORLD, ERBlock.BANDED_IRON.getDefaultState(), 64)));

    //Ironstone
    public static final ConfiguredFeature<?, ?> ORE_IRONSTONE = ConfiguredFeatures.register("ore_ironstone", Feature.ORE.configure(
            new OreFeatureConfig(OreConfiguredFeatures.BASE_STONE_OVERWORLD, ERBlock.IRONSTONE.getDefaultState(), 64)));

    //Meteoric Iron
    /*public static final ConfiguredFeature<?, ?> ORE_METEORIC_IRON_DESERT = ConfiguredFeatures.register("ore_meteoric_iron_desert", Feature.ORE.configure(
            new OreFeatureConfig(EROreConfiguredFeatures.BASE_SAND_OVERWORLD, ERBlock.METEORIC_IRON.getDefaultState(), 8)));*/
}
