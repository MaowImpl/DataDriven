package maow.datadriven.json.serialized;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Map;

public class SerializedBlockItem extends SerializedItem {
    public SerializedBlockItem(String id, Map<String, String> components) {
        super(id, components);
    }

    public String getBlockId() {
        return super.getComponent("minecraft:associated_block");
    }

    public Block getBlock() {
        return Registry.BLOCK.get(new Identifier(getBlockId()));
    }
}
