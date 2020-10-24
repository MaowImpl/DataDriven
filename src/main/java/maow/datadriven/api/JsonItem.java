package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedItem;
import maow.datadriven.util.GsonUtil;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

public class JsonItem extends Item {
    protected final SerializedItem item;

    public JsonItem(String path) {
        this(GsonUtil.fromJson(path, SerializedItem.class));
    }

    protected JsonItem(SerializedItem item) {
        super(item.getSettings());
        this.item = item;
    }

    public void register() {
        Registry.register(Registry.ITEM, item.getId(), this);
    }
}
