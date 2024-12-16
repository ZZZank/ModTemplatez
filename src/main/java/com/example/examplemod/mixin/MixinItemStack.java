package com.example.examplemod.mixin;

import com.example.examplemod.inerface_injection.InjectItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author ZZZank
 */
@Mixin(ItemStack.class)
public abstract class MixinItemStack implements InjectItemStack {

    @Shadow
    private CompoundTag tag;

    @Override
    public ItemStack exampleMod$self() {
        return (ItemStack) (Object) this;
    }

    @Override
    public void exampleMod$clearTag() {
        this.tag = null;
    }
}
