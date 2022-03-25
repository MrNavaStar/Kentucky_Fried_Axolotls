package mrnavastar.axolotl;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Axolotl.MODID)
public class Axolotl {
    public static final String MODID = "kfa";

    public Axolotl() {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
