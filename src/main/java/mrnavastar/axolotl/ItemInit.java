package mrnavastar.axolotl;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Axolotl.MODID);

    public static final RegistryObject<Item> FRIED_AXOLOTL = ITEMS.register("fried_axolotl", () -> new FriedAxolotlItem(
            new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(1).food(new FoodProperties.Builder().nutrition(10).saturationMod(3).build())));
}
