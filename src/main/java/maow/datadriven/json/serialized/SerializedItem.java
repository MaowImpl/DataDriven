package maow.datadriven.json.serialized;

import maow.datadriven.DataDriven;
import maow.datadriven.json.component.ComponentHolder;
import maow.datadriven.util.ParseUtil;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.Map;

public class SerializedItem implements ComponentHolder {
    private final String id;
    protected final Map<String, String> components;

    public SerializedItem(String id, Map<String, String> components) {
        this.id = id;
        this.components = components;
    }

    public Identifier getId() {
        return new Identifier(id);
    }

    public Item.Settings getSettings() {
        String itemGroup = getComponent("minecraft:item_group");
        Rarity rarity = ParseUtil.parseRarity(getComponent("minecraft:rarity"));
        int maxCount = ParseUtil.parseInt(getComponent("minecraft:max_count"));
        boolean fireproof = ParseUtil.parseBoolean(getComponent("minecraft:is_fireproof"));
        int maxDamage = ParseUtil.parseInt(getComponent("minecraft:max_damage"));
        int maxDamageIfAbsent = ParseUtil.parseInt(getComponent("minecraft:max_damage_if_absent"));

        Item.Settings settings = new Item.Settings();
        settings.group((itemGroup != null) ? DataDriven.getItemGroup(new Identifier(itemGroup)) : ItemGroup.MISC);
        settings.rarity(rarity);
        settings.maxCount(maxCount);
        if (fireproof) settings.fireproof();
        settings.maxDamage(maxDamage);
        settings.maxDamageIfAbsent(maxDamageIfAbsent);

        return settings;
    }

    @Override
    public Map<String, String> getComponents() {
        return components;
    }
}
