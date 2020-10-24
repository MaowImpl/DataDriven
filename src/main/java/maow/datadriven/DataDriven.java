package maow.datadriven;

import maow.datadriven.api.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class DataDriven implements ModInitializer {
    private static final Map<Identifier, ItemGroup> REGISTERED_ITEMGROUPS = new HashMap<>();

    @Override
    public void onInitialize() {
        // Example Stuff! Uncomment the below if you wanna see the API in action.

        /*
        new JsonItemGroup("registry/datadriven/item_groups/item_group.json").register();
        new JsonBlock("registry/datadriven/blocks/json_block.json").register();
        new JsonBlockItem("registry/datadriven/blocks/items/json_block.json").register();
        new JsonItem("registry/datadriven/items/json_item.json").register();
        new JsonEnchantment("registry/datadriven/enchantments/json_enchantment.json").register();
        new JsonStatusEffect("registry/datadriven/status_effects/json_status_effect.json").register();
         */

        addItemGroup(new Identifier("building_blocks"), ItemGroup.BUILDING_BLOCKS);
        addItemGroup(new Identifier("decorations"), ItemGroup.DECORATIONS);
        addItemGroup(new Identifier("redstone"), ItemGroup.REDSTONE);
        addItemGroup(new Identifier("transportation"), ItemGroup.TRANSPORTATION);
        addItemGroup(new Identifier("misc"), ItemGroup.MISC);
        addItemGroup(new Identifier("food"), ItemGroup.FOOD);
        addItemGroup(new Identifier("tools"), ItemGroup.TOOLS);
        addItemGroup(new Identifier("combat"), ItemGroup.COMBAT);
        addItemGroup(new Identifier("brewing"), ItemGroup.BREWING);
        addItemGroup(new Identifier("materials"), ItemGroup.MATERIALS);
    }

    public static ItemGroup getItemGroup(Identifier key) {
        if (!REGISTERED_ITEMGROUPS.containsKey(key)) {
            return ItemGroup.MISC;
        }
        return REGISTERED_ITEMGROUPS.get(key);
    }

    public static void addItemGroup(Identifier key, ItemGroup group) {
        REGISTERED_ITEMGROUPS.put(key, group);
    }
}