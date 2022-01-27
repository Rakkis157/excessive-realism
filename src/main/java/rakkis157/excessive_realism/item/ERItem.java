package rakkis157.excessive_realism.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import rakkis157.excessive_realism.ExcessiveRealism;

public class ERItem {

    private static Item registerItem(String name){
        return Registry.register(Registry.ITEM, new Identifier(ExcessiveRealism.MOD_ID, name),
                new Item(new FabricItemSettings().group(ERItemGroup.GROUP)));
    }

    public static void init(){
        System.out.println( ExcessiveRealism.MOD_NAME + " Items Initialized");
    }
}
