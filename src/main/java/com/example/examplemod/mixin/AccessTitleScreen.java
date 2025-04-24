package com.example.examplemod.mixin;

import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * @author ZZZank
 */
@Mixin(TitleScreen.class)
public interface AccessTitleScreen {

    @Accessor("splash")
    SplashRenderer exampleMod$panorama();
}
