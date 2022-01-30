package rakkis157.excessive_realism.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rakkis157.excessive_realism.ExcessiveRealism;

public class ERItem {

    /*  Adding A Block:
     *    1. Create an Item class and set its properties
     *    2. Create the following JSON file(s) named name.json.
     *      2a. Item Model      Creates the model of the block that shows up in your inventory and hand
     *                          in assets/excessive_realism/models/item
     *   3. Create an entry for the item in the following JSON file(s)
     *      3a. Item Name       Add "item.excessive_realism.name": "Item Name". Please input in alphabetical order and in the right category.
     *                          in assets/excessive_realism/lang/en_us.json
     *   4. Add Recipes         in data/excessive_realism/recipes
     */



    private static Item registerItem(String name){
        return Registry.register(Registry.ITEM, new Identifier(ExcessiveRealism.MOD_ID, name),
                new Item(new FabricItemSettings().group(ERItemGroup.GROUP)));
    }

    public static void init(){
        System.out.println("Initializing "+ ExcessiveRealism.MOD_NAME + " Items");
    }
}
