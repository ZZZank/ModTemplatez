package com.example.examplemod.inerface_injection;

import lombok.val;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * @author ZZZank
 */
public class InjectionUsageExample {

    /**
     * use this syntax if `architectury.common.json` is not used
     */
    public static void clearTag(@NotNull ItemStack stack) {
        val inject = (InjectItemStack) (Object) stack;
        inject.exampleMod$clearTag();
    }

    /**
     *
     */
    public static void injectedClearTag(@NotNull ItemStack stack) {
        stack.exampleMod$clearTag();
    }
}
