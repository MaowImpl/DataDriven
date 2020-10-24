package maow.datadriven.json.serialized;

import net.minecraft.util.Identifier;

public class SerializedItemGroup {
    private final String id;
    private final String icon;

    public SerializedItemGroup(String id, String icon) {
        this.id = id;
        this.icon = icon;
    }

    public Identifier getId() {
        return new Identifier(id);
    }
    public Identifier getIcon() {
        return new Identifier(icon);
    }
}
