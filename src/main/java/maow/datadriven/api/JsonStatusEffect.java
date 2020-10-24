package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedPotion;
import maow.datadriven.json.serialized.SerializedStatusEffect;
import maow.datadriven.util.GsonUtil;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.util.registry.Registry;

public class JsonStatusEffect extends StatusEffect {
    private final SerializedStatusEffect statusEffect;

    public JsonStatusEffect(String path) {
        this(GsonUtil.fromJson(path, SerializedStatusEffect.class));
    }

    protected JsonStatusEffect(SerializedStatusEffect statusEffect) {
        super(statusEffect.getType(), statusEffect.getColor());
        this.statusEffect = statusEffect;
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return statusEffect.canApplyUpdateEffect();
    }

    public void register() {
        Registry.register(Registry.STATUS_EFFECT, statusEffect.getId(), this);
        for (SerializedPotion potion : statusEffect.getPotions()) {
            Registry.register(Registry.POTION, potion.getId(), new Potion(new StatusEffectInstance(this, potion.getDuration(), potion.getAmplifier())));
        }
    }
}
