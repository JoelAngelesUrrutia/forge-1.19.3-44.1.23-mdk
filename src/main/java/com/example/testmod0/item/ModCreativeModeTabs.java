package com.example.testmod0.item;

import com.example.testmod0.TestMod;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TestMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TESTMOD_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        TESTMOD_TAB  = event.registerCreativeModeTab(new ResourceLocation(TestMod.MOD_ID, "testmod_tab"),
            builder -> builder.icon(()-> new ItemStack(ModItems.gerbera.get()))
                    .title(Component.translatable("creativemodetab.testmod_tab")));
    }
}
