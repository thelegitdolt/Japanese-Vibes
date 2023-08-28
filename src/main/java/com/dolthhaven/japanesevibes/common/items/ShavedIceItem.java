package com.dolthhaven.japanesevibes.common.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class ShavedIceItem extends BowlFoodItem {
    public ShavedIceItem(Properties props) {
        super(props);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(@NotNull ItemStack stack, @NotNull Level level, LivingEntity entity) {
        entity.setTicksFrozen(entity.getTicksFrozen() + 200);
        return super.finishUsingItem(stack, level, entity);
    }
}
