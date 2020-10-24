package maow.datadriven.util.constants;

import net.minecraft.block.Material;

public enum Materials {
    AIR(Material.AIR),
    STRUCTURE_VOID(Material.STRUCTURE_VOID),
    PORTAL(Material.PORTAL),
    CARPET(Material.CARPET),
    PLANT(Material.PLANT),
    UNDERWATER_PLANT(Material.UNDERWATER_PLANT),
    REPLACEABLE_PLANT(Material.REPLACEABLE_PLANT),
    NETHER_SHOOTS(Material.NETHER_SHOOTS),
    REPLACEABLE_UNDERWATER_PLANT(Material.REPLACEABLE_UNDERWATER_PLANT),
    WATER(Material.WATER),
    BUBBLE_COLUMN(Material.BUBBLE_COLUMN),
    LAVA(Material.LAVA),
    SNOW_LAYER(Material.SNOW_LAYER),
    FIRE(Material.FIRE),
    SUPPORTED(Material.SUPPORTED),
    COBWEB(Material.COBWEB),
    REDSTONE_LAMP(Material.REDSTONE_LAMP),
    ORGANIC_PRODUCT(Material.ORGANIC_PRODUCT),
    SOIL(Material.SOIL),
    SOLID_ORGANIC(Material.SOLID_ORGANIC),
    DENSE_ICE(Material.DENSE_ICE),
    AGGREGATE(Material.AGGREGATE),
    SPONGE(Material.SPONGE),
    SHULKER_BOX(Material.SHULKER_BOX),
    WOOD(Material.WOOD),
    NETHER_WOOD(Material.NETHER_WOOD),
    BAMBOO_SAPLING(Material.BAMBOO_SAPLING),
    BAMBOO(Material.BAMBOO),
    WOOL(Material.WOOD),
    TNT(Material.TNT),
    LEAVES(Material.LEAVES),
    GLASS(Material.GLASS),
    ICE(Material.ICE),
    CACTUS(Material.CACTUS),
    STONE(Material.STONE),
    METAL(Material.METAL),
    SNOW_BLOCK(Material.SNOW_BLOCK),
    REPAIR_STATION(Material.REPAIR_STATION),
    BARRIER(Material.BARRIER),
    PISTON(Material.PISTON),
    UNUSED_PLANT(Material.UNUSED_PLANT), // hehe yes
    GOURD(Material.GOURD),
    EGG(Material.EGG),
    CAKE(Material.CAKE),
    ;

    public Material material;

    Materials(Material material) {
        this.material = material;
    }

    public static Material parseString(String name) {
        Material material;
        try {
            if (name == null) {
                return null;
            }
            material = valueOf(name).material;
        } catch (IllegalArgumentException e) {
            material = null;
        }
        return material;
    }
}
