package rakkis157.excessive_realism.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GravelBlock;
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

/*  Adding A Block:
*    1. Create a Block class and set its properties
*    2. Create the following JSON file(s) named name.json. You can use resources/print_json.py to automatically create files 2a, 2b, 2c and 2d
*       2a. Blockstate      Determines what version of a block is used
*                           in assets/excessive_realism/blockstates.
*       2b. Block Model     Creates the model of the block that shows up in world
*                           in assets/excessive_realism/models/block
 *      2c. Item Model      Creates the model of the block that shows up in your inventory and hand
 *                          in assets/excessive_realism/models/item
 *      2d. Loot Table      Determines what drops when the block is broken.
 *                          in data/excessive_realism/loot_tables
 *   3. Create an entry for the block in the following JSON file(s)
 *      3a. Item Name       Add "block.excessive_realism.name": "Item Name". Please input in alphabetical order and in the right category.
 *                          in assets/excessive_realism/lang/en_us.json
 *      3b. Tool Used       Add "excessive_realism:name" in the file representing the correct tool(s). Please use alphabetical order.
 *                          in data/minecraft/tags/blocks/mineable
 *   4. Add Recipes         in data/excessive_realism/recipes
*/

// Blocks:
//  Mineral
    public static final Block BANDED_IRON = copyBlock("banded_iron", Blocks.ANDESITE);
    public static final Block BOG_IRON = registerBlock("bog_iron", new GravelBlock(FabricBlockSettings.copy(Blocks.GRAVEL)));
    public static final Block IRONSTONE = copyBlock("ironstone", Blocks.ANDESITE);
    //public static final Block METEORIC_IRON = copyBlock("meteoric_iron", Blocks.IRON_BLOCK);

//  Decorative
    public static final Block POLISHED_IRONSTONE = copyBlock("polished_ironstone", Blocks.POLISHED_ANDESITE);


/* Block Types:
*   registerBlock       Manually input all the Block's properties.
*   copyBlock           Creates a block with some properties of an existing block (Hardness, Sounds).
* */

    private static Block copyBlock(String name, AbstractBlock abstractBlock){
        Block block = new Block(FabricBlockSettings.copy(abstractBlock));
        registerBlockItem(name, block, ERItemGroup.GROUP);
        return Registry.register(Registry.BLOCK, new Identifier(ExcessiveRealism.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block, ERItemGroup.GROUP);
        return Registry.register(Registry.BLOCK, new Identifier(ExcessiveRealism.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(ExcessiveRealism.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void init(){
        System.out.println("Initializing "+ ExcessiveRealism.MOD_NAME + " Blocks");
    }
}
