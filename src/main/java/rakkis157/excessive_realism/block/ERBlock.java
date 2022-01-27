package rakkis157.excessive_realism.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rakkis157.excessive_realism.ExcessiveRealism;
import rakkis157.excessive_realism.item.ERItemGroup;

public class ERBlock {
    public static final Logger LOGGER = LoggerFactory.getLogger(ExcessiveRealism.MOD_ID);

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block, ERItemGroup.GROUP);
        return Registry.register(Registry.BLOCK, new Identifier(ExcessiveRealism.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ExcessiveRealism.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void init(){
        LOGGER.info("Initializing " + ExcessiveRealism.MOD_NAME + " Blocks");
    }
}
