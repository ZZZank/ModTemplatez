package com.example.examplemod.inerface_injection;

import lombok.val;
import net.minecraft.world.item.ItemStack;

/**
 * @author ZZZank
 */
public class InjectionUsageExample {

    public static void clearTag(ItemStack stack) {
        if (stack == null) {
            return;
        }
        val inject = (InjectItemStack) (Object) stack;
        inject.exampleMod$clearTag();
    }
}
