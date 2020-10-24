package maow.datadriven.json.serialized;

import maow.datadriven.util.ConstantUtil;
import maow.datadriven.util.ParseUtil;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.util.InputUtil;

@Environment(EnvType.CLIENT)
public class SerializedKeybinding {
    private final String translationKey;
    private final String categoryTranslationKey;
    private final String type;
    private final String keyCode;

    public SerializedKeybinding(String translationKey, String categoryTranslationKey, String type, String keyCode) {
        this.translationKey = translationKey;
        this.categoryTranslationKey = categoryTranslationKey;
        this.type = type;
        this.keyCode = keyCode;
    }

    public String getTranslationKey() {
        return translationKey;
    }
    public String getCategoryTranslationKey() {
        return categoryTranslationKey;
    }
    public InputUtil.Type getType() {
        return ParseUtil.parseInputType(type);
    }
    public int getKeyCode() {
        return ConstantUtil.getKey(keyCode);
    }
}
