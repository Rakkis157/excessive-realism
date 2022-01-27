package rakkis157.excessive_realism.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import rakkis157.excessive_realism.ExcessiveRealism;

public class ERItemGroup {

    public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier(ExcessiveRealism.MOD_ID, "group"),
            () -> new ItemStack(Blocks.ANDESITE));
}
