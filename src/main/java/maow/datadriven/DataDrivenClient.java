package maow.datadriven;

import maow.datadriven.api.JsonKeybinding;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class DataDrivenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
//        new JsonKeybinding("registry/datadriven/keybindings/json_keybinding.json").register();
    }
}
