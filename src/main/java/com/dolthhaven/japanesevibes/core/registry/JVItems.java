package com.dolthhaven.japanesevibes.core.registry;

import com.dolthhaven.japanesevibes.common.items.ShavedIceItem;
import com.dolthhaven.japanesevibes.core.JapaneseVibes;
import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = JapaneseVibes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class JVItems {
    public static final ItemSubRegistryHelper HELPER = JapaneseVibes.REGISTRY_HELPER.getItemSubHelper();
    public static final RegistryObject<Item> CARAMEL_APPLE = HELPER.createItem("caramel_apple", () -> new Item(new Item.Properties().food(Food.CARAMEL_APPLE).tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> TAIYAKI = HELPER.createItem("taiyaki", () -> new Item(new Item.Properties().food(Food.TAIYAKI).tab(CreativeModeTab.TAB_FOOD)));
    public static final RegistryObject<Item> SHAVED_ICE = HELPER.createItem("shaved_ice", () -> new ShavedIceItem(new Item.Properties().food(Food.SHAVED_ICE).stacksTo(1).tab(CreativeModeTab.TAB_FOOD)));


    public static final class Food {
        public static final FoodProperties CARAMEL_APPLE = new FoodProperties.Builder().nutrition(8).saturationMod(0.7F).build();
        public static final FoodProperties TAIYAKI = new FoodProperties.Builder().nutrition(8).saturationMod(0.9F).build();
        public static final FoodProperties SHAVED_ICE = new FoodProperties.Builder().nutrition(10).saturationMod(1.1F).build();

    }
}
