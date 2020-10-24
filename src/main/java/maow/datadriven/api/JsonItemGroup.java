package maow.datadriven.api;

import maow.datadriven.DataDriven;
import maow.datadriven.json.serialized.SerializedItemGroup;
import maow.datadriven.util.GsonUtil;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class JsonItemGroup {
    private final SerializedItemGroup itemGroup;

    public JsonItemGroup(String path) {
        this.itemGroup = GsonUtil.fromJson(path, SerializedItemGroup.class);
    }

    public void register() {
        final Identifier id = itemGroup.getId();
        DataDriven.addItemGroup(id, FabricItemGroupBuilder.build(
                id, () -> new ItemStack(Registry.ITEM.get(itemGroup.getIcon()))
        ));
    }
}
