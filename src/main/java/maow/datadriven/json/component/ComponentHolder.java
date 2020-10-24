package maow.datadriven.json.component;

import java.util.Map;

public interface ComponentHolder {
    default String getComponent(String key) {
        if (getComponents().containsKey(key)) {
            return getComponents().get(key);
        }
        return null;
    }

    Map<String, String> getComponents();
}
