package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedEnchantment;
import maow.datadriven.util.GsonUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

public class JsonEnchantment extends Enchantment {
    private final SerializedEnchantment enchantment;

    public JsonEnchantment(String path) {
        this(GsonUtil.fromJson(path, SerializedEnchantment.class));
    }

    protected JsonEnchantment(SerializedEnchantment enchantment) {
        super(enchantment.getWeight(), enchantment.getType(), enchantment.getSlotTypes());
        this.enchantment = enchantment;
    }

    @Override
    public int getMinPower(int level) {
        return enchantment.getMinPower(level);
    }

    @Override
    public int getMaxLevel() {
        return enchantment.getMaxLevel();
    }

    public void register() {
        Registry.register(Registry.ENCHANTMENT, enchantment.getId(), this);
    }
}
