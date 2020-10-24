package maow.datadriven.api;

import maow.datadriven.json.serialized.SerializedBlock;
import maow.datadriven.util.GsonUtil;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

public class JsonBlock extends Block {
    private final SerializedBlock block;

    public JsonBlock(String path) {
        this(GsonUtil.fromJson(path, SerializedBlock.class));
    }

    protected JsonBlock(SerializedBlock block) {
        super(block.getSettings());
        this.block = block;
    }

    public void register() {
        Registry.register(Registry.BLOCK, block.getId(), this);
    }
}
