package maow.datadriven.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.InputUtil;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.util.Rarity;

public class ParseUtil {
    public static float parseFloat(String string) {
        float f;
        try {
            if (string == null) {
                return 0.0f;
            }
            f = Float.parseFloat(string);
        } catch (IllegalArgumentException ex) {
            f = 0.0f;
        }
        return f;
    }

    public static boolean parseBoolean(String string) {
        boolean b;
        try {
            if (string == null) {
                return false;
            }
            b = Boolean.parseBoolean(string);
        } catch (IllegalArgumentException ex) {
            b = false;
        }
        return b;
    }

    public static Rarity parseRarity(String string) {
        Rarity r;
        try {
            if (string == null) {
                return Rarity.COMMON;
            }
            r = Rarity.valueOf(string);
        } catch (IllegalArgumentException ex) {
            r = Rarity.COMMON;
        }
        return r;
    }

    public static int parseInt(String string) {
        int i;
        try {
            if (string == null) {
                return 0;
            }
            i = Integer.parseInt(string);
        } catch (IllegalArgumentException ex) {
            i = 0;
        }
        return i;
    }

    public static Enchantment.Rarity parseEnchantmentRarity(String string) {
        Enchantment.Rarity r;
        try {
            if (string == null) {
                return Enchantment.Rarity.COMMON;
            }
            r = Enchantment.Rarity.valueOf(string);
        } catch (IllegalArgumentException ex) {
            r = Enchantment.Rarity.COMMON;
        }
        return r;
    }

    public static EnchantmentTarget parseEnchantmentTarget(String string) {
        EnchantmentTarget e;
        try {
            if (string == null) {
                return EnchantmentTarget.WEARABLE;
            }
            e = EnchantmentTarget.valueOf(string);
        } catch (IllegalArgumentException ex) {
            e = EnchantmentTarget.WEARABLE;
        }
        return e;
    }

    public static EquipmentSlot parseEquipmentSlot(String string) {
        EquipmentSlot e;
        try {
            if (string == null) {
                return EquipmentSlot.MAINHAND;
            }
            e = EquipmentSlot.valueOf(string);
        } catch (IllegalArgumentException ex) {
            e = EquipmentSlot.MAINHAND;
        }
        return e;
    }

    public static StatusEffectType parseStatusEffectType(String string) {
        StatusEffectType s;
        try {
            if (string == null) {
                return StatusEffectType.NEUTRAL;
            }
            s = StatusEffectType.valueOf(string);
        } catch (IllegalArgumentException ex) {
            s = StatusEffectType.NEUTRAL;
        }
        return s;
    }

    @Environment(EnvType.CLIENT)
    public static InputUtil.Type parseInputType(String string) {
        InputUtil.Type t;
        try {
            if (string == null) {
                return InputUtil.Type.KEYSYM;
            }
            t = InputUtil.Type.valueOf(string);
        } catch (IllegalArgumentException ex) {
            t = InputUtil.Type.KEYSYM;
        }
        return t;
    }
}
