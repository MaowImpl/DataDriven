package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedBlockItem;
import maow.datadriven.util.GsonUtil;
import net.minecraft.item.BlockItem;
import net.minecraft.util.registry.Registry;

public class JsonBlockItem extends BlockItem {
    private final SerializedBlockItem blockItem;

    public JsonBlockItem(String path) {
        this(GsonUtil.fromJson(path, SerializedBlockItem.class));
    }

    protected JsonBlockItem(SerializedBlockItem blockItem) {
        super(blockItem.getBlock(), blockItem.getSettings());
        this.blockItem = blockItem;
    }

    public void register() {
        Registry.register(Registry.ITEM, blockItem.getId(), this);
    }
}
