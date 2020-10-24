package maow.datadriven.json.serialized;

import maow.datadriven.util.ParseUtil;

public class SerializedPotion {
    private final String id;
    private final String duration;
    private final String amplifier;

    public SerializedPotion(String id, String duration, String amplifier) {
        this.id = id;
        this.duration = duration;
        this.amplifier = amplifier;
    }

    public String getId() {
        return id;
    }
    public int getDuration() {
        return ParseUtil.parseInt(duration);
    }
    public int getAmplifier() {
        return ParseUtil.parseInt(amplifier);
    }
}
