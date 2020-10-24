package maow.datadriven.json.serialized;

import maow.datadriven.json.component.ComponentHolder;
import maow.datadriven.util.constants.BlockSoundGroups;
import maow.datadriven.util.constants.Materials;
import maow.datadriven.util.ParseUtil;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.Map;

public class SerializedBlock implements ComponentHolder {
    private final String id;
    private final Map<String, String> components;

    public SerializedBlock(String id, Map<String, String> components) {
        this.id = id;
        this.components = components;
    }

    public Identifier getId() {
        return new Identifier(id);
    }

    public AbstractBlock.Settings getSettings() {
        Material material = Materials.parseString(getComponent("minecraft:material"));
        float hardness = ParseUtil.parseFloat(getComponent("minecraft:hardness"));
        float resistance = ParseUtil.parseFloat(getComponent("minecraft:resistance"));
        BlockSoundGroup sounds = BlockSoundGroups.parseString(getComponent("minecraft:sound_group"));
        boolean requiresTool = ParseUtil.parseBoolean(getComponent("minecraft:requires_tool"));
        boolean nonOpaque = ParseUtil.parseBoolean(getComponent("minecraft:non_opaque"));
        boolean breakInstantly = ParseUtil.parseBoolean(getComponent("minecraft:break_instantly"));
        boolean air = ParseUtil.parseBoolean(getComponent("minecraft:is_air"));
        boolean dropsNothing = ParseUtil.parseBoolean(getComponent("minecraft:drops_nothing"));
        boolean noCollision = ParseUtil.parseBoolean(getComponent("minecraft:no_collision"));
        float slipperiness = ParseUtil.parseFloat(getComponent("minecraft:slipperiness"));
        boolean dynamicBounds = ParseUtil.parseBoolean(getComponent("minecraft:has_dynamic_bounds"));

        FabricBlockSettings settings = (material != null) ? FabricBlockSettings.of(material) : FabricBlockSettings.of(Material.AIR);
        settings.strength(hardness, resistance);
        settings.sounds((sounds != null) ? sounds : BlockSoundGroup.METAL);
        if (requiresTool) settings.requiresTool();
        if (nonOpaque) settings.nonOpaque();
        if (breakInstantly) settings.breakInstantly();
        if (air) settings.air();
        if (dropsNothing) settings.dropsNothing();
        if (noCollision) settings.noCollision();
        settings.slipperiness(slipperiness);
        if (dynamicBounds) settings.dynamicBounds();

        return settings;
    }

    @Override
    public Map<String, String> getComponents() {
        return components;
    }
}
