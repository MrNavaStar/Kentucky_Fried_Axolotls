package mrnavastar.axolotl;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class FriedAxolotlItem extends Item {

    public FriedAxolotlItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, @NotNull LivingEntity entityLiving) {
        ItemStack itemStack = super.finishUsingItem(stack, level, entityLiving);
        if (entityLiving instanceof Player && ((Player) entityLiving).isCreative()) return itemStack;
        return new ItemStack(Items.BUCKET);
    }
}
