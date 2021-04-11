package de.sean.dumplings;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DumplingsMod implements ModInitializer {
    public static final String MODID = "dumplings";

    private static final FoodComponent DUMPLINGS_FOOD = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.6F).build();
    private static final FoodComponent DUMPLINGS_WITH_CHICKEN_FOOD = (new FoodComponent.Builder()).hunger(12).saturationModifier(0.8F).meat().build();

    public static final Item DUMPLINGS_ITEM = new Item(new FabricItemSettings().food(DUMPLINGS_FOOD).group(ItemGroup.FOOD));
	public static final Item BREAD_DUMPLINGS_ITEM = new Item(new FabricItemSettings().food(DUMPLINGS_FOOD).group(ItemGroup.FOOD));

    public static final Item DUMPLINGS_WITH_CHICKEN_ITEM = new Item(new FabricItemSettings().food(DUMPLINGS_WITH_CHICKEN_FOOD).group(ItemGroup.FOOD));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MODID, "dumplings"), DUMPLINGS_ITEM);
		Registry.register(Registry.ITEM, new Identifier(MODID, "bread_dumplings"), BREAD_DUMPLINGS_ITEM);

        Registry.register(Registry.ITEM, new Identifier(MODID, "dumplings_with_chicken"), DUMPLINGS_WITH_CHICKEN_ITEM);
    }
}
