package maow.datadriven.util.constants;

import net.minecraft.sound.BlockSoundGroup;

public enum BlockSoundGroups {
    WOOD(BlockSoundGroup.WOOD),
    GRAVEL(BlockSoundGroup.GRAVEL),
    GRASS(BlockSoundGroup.GRASS),
    LILY_PAD(BlockSoundGroup.LILY_PAD),
    STONE(BlockSoundGroup.STONE),
    METAL(BlockSoundGroup.METAL),
    GLASS(BlockSoundGroup.GLASS),
    WOOL(BlockSoundGroup.WOOL),
    SAND(BlockSoundGroup.SAND),
    SNOW(BlockSoundGroup.SNOW),
    LADDER(BlockSoundGroup.LADDER),
    ANVIL(BlockSoundGroup.ANVIL),
    SLIME(BlockSoundGroup.SLIME),
    HONEY(BlockSoundGroup.HONEY),
    WET_GRASS(BlockSoundGroup.WET_GRASS),
    CORAL(BlockSoundGroup.CORAL),
    BAMBOO(BlockSoundGroup.BAMBOO),
    BAMBOO_SAPLING(BlockSoundGroup.BAMBOO_SAPLING),
    SCAFFOLDING(BlockSoundGroup.SCAFFOLDING),
    SWEET_BERRY_BUSH(BlockSoundGroup.SWEET_BERRY_BUSH),
    CROP(BlockSoundGroup.CROP),
    STEM(BlockSoundGroup.STEM),
    VINE(BlockSoundGroup.VINE),
    NETHER_WART(BlockSoundGroup.NETHER_WART),
    LANTERN(BlockSoundGroup.LANTERN),
    NETHER_STEM(BlockSoundGroup.NETHER_STEM),
    NYLIUM(BlockSoundGroup.NYLIUM),
    FUNGUS(BlockSoundGroup.FUNGUS),
    ROOTS(BlockSoundGroup.ROOTS),
    SHROOMLIGHT(BlockSoundGroup.SHROOMLIGHT),
    WEEPING_VINES(BlockSoundGroup.WEEPING_VINES),
    WEEPING_VINES_LOW_PITCH(BlockSoundGroup.WEEPING_VINES_LOW_PITCH),
    SOUL_SAND(BlockSoundGroup.SOUL_SAND),
    SOUL_SOIL(BlockSoundGroup.SOUL_SOIL),
    BASALT(BlockSoundGroup.BASALT),
    WART_BLOCK(BlockSoundGroup.WART_BLOCK),
    NETHERRACK(BlockSoundGroup.NETHERRACK),
    NETHER_BRICKS(BlockSoundGroup.NETHER_BRICKS),
    NETHER_SPROUTS(BlockSoundGroup.NETHER_SPROUTS),
    NETHER_ORE(BlockSoundGroup.NETHER_ORE),
    BONE(BlockSoundGroup.BONE),
    NETHERITE(BlockSoundGroup.NETHERITE),
    ANCIENT_DEBRIS(BlockSoundGroup.ANCIENT_DEBRIS),
    LODESTONE(BlockSoundGroup.LODESTONE),
    CHAIN(BlockSoundGroup.CHAIN),
    NETHER_GOLD_ORE(BlockSoundGroup.NETHER_GOLD_ORE),
    GILDED_BLACKSTONE(BlockSoundGroup.GILDED_BLACKSTONE),
    ;

    public BlockSoundGroup soundGroup;

    BlockSoundGroups(BlockSoundGroup soundGroup) {
        this.soundGroup = soundGroup;
    }

    public static BlockSoundGroup parseString(String name) {
        BlockSoundGroup soundGroup;
        try {
            if (name == null) {
                return null;
            }
            soundGroup = valueOf(name).soundGroup;
        } catch (IllegalArgumentException e) {
            soundGroup = null;
        }
        return soundGroup;
    }
}
