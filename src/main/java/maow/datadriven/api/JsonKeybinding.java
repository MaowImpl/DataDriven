package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedKeybinding;
import maow.datadriven.util.GsonUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.options.KeyBinding;

@Environment(EnvType.CLIENT)
public class JsonKeybinding extends KeyBinding {
    public JsonKeybinding(String path) {
        this(GsonUtil.fromJson(path, SerializedKeybinding.class));
    }

    protected JsonKeybinding(SerializedKeybinding keybinding) {
        super(keybinding.getTranslationKey(), keybinding.getType(), keybinding.getKeyCode(), keybinding.getCategoryTranslationKey());
    }

    public void register() {
        KeyBindingHelper.registerKeyBinding(this);
    }
}
