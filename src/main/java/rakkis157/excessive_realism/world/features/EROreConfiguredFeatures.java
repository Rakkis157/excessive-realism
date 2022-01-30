package rakkis157.excessive_realism.world.features;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.tag.BlockTags;

public class EROreConfiguredFeatures {

    public static final RuleTest BASE_DIRT_OVERWORLD = new BlockMatchRuleTest(Blocks.DIRT);
    public static final RuleTest BASE_TERRACOTTA_OVERWORLD = new BlockMatchRuleTest(Blocks.TERRACOTTA);
    public static final RuleTest BASE_SAND_OVERWORLD = new BlockMatchRuleTest(Blocks.SAND);
    public static final RuleTest BASE_RED_SAND_OVERWORLD = new BlockMatchRuleTest(Blocks.RED_SAND);

}
