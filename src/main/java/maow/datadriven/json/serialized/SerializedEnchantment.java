package maow.datadriven.json.serialized;

import maow.datadriven.json.component.ComponentHolder;
import maow.datadriven.util.ParseUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SerializedEnchantment implements ComponentHolder {
    private final String id;
    protected final String weight;
    protected final String type;
    protected final String[] slotTypes;
    private final Map<String, String> components;

    public SerializedEnchantment(String id, String weight, String type, String[] slotTypes, Map<String, String> components) {
        this.id = id;
        this.weight = weight;
        this.type = type;
        this.slotTypes = slotTypes;
        this.components = components;
    }

    public Identifier getId() {
        return new Identifier(id);
    }
    public Enchantment.Rarity getWeight() {
        return ParseUtil.parseEnchantmentRarity(weight);
    }
    public EnchantmentTarget getType() {
        return ParseUtil.parseEnchantmentTarget(type);
    }
    public EquipmentSlot[] getSlotTypes() {
        List<EquipmentSlot> slots = new ArrayList<>();
        for (String string : slotTypes) {
            slots.add(ParseUtil.parseEquipmentSlot(string));
        }
        return slots.toArray(new EquipmentSlot[]{});
    }

    public int getMinPower(int level) {
        boolean multiplyByLevel = Boolean.parseBoolean(getComponent("datadriven:multiply_by_level"));
        int minPower = ParseUtil.parseInt(getComponent("minecraft:minimum_power"));
        return multiplyByLevel ? minPower * level : minPower;
    }
    public int getMaxLevel() {
        return ParseUtil.parseInt(getComponent("minecraft:max_level"));
    }

    @Override
    public Map<String, String> getComponents() {
        return components;
    }
}
