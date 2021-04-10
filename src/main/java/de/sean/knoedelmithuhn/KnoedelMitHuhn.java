package de.sean.knoedelmithuhn;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class KnoedelMitHuhn implements ModInitializer {
    public static final String MODID = "knoedelmithuhn";

    private static final FoodComponent KNOEDEL_FOOD = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    private static final FoodComponent KNOEDEL_MIT_HUHN_FOOD = (new FoodComponent.Builder()).hunger(12).saturationModifier(0.8F).meat().build();

    public static final Item KNOEDEL_ITEM = new Item(new FabricItemSettings().food(KNOEDEL_FOOD).group(ItemGroup.FOOD));
    public static final Item KNOEDEL_MIT_HUHN_ITEM = new Item(new FabricItemSettings().food(KNOEDEL_MIT_HUHN_FOOD).group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "knoedel"), KNOEDEL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "knoedel_mit_huhn"), KNOEDEL_MIT_HUHN_ITEM);
    }
}
