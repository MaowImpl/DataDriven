package maow.datadriven.json.serialized;

import maow.datadriven.json.component.ComponentHolder;
import maow.datadriven.util.ParseUtil;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Identifier;

import java.util.Map;

public class SerializedStatusEffect implements ComponentHolder {
    private final String id;
    private final String type;
    private final String color;
    private final SerializedPotion[] potions;
    private final Map<String, String> components;

    public SerializedStatusEffect(String id, String type, String color, SerializedPotion[] potions, Map<String, String> components) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.potions = potions;
        this.components = components;
    }

    public Identifier getId() {
        return new Identifier(id);
    }
    public StatusEffectType getType() {
        return ParseUtil.parseStatusEffectType(type);
    }
    public int getColor() {
        return ParseUtil.parseInt(color);
    }
    public SerializedPotion[] getPotions() {
        return potions;
    }

    public boolean canApplyUpdateEffect() {
        return ParseUtil.parseBoolean(getComponent("minecraft:can_apply_update_effect"));
    }

    @Override
    public Map<String, String> getComponents() {
        return components;
    }
}
