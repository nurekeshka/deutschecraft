package dev.nurekeshka.deutschecraft;

import java.util.Locale;

// import org.jetbrains.annotations.NotNull;

import dev.nurekeshka.deutschecraft.init.DCEntities;
import dev.nurekeshka.deutschecraft.init.DCSounds;
import net.minecraft.resources.ResourceLocation;
// import net.minecraft.world.item.CreativeModeTab;
// import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Deutschecraft.MODID)
public class Deutschecraft {
    public static final String MODID = "deutschecraft";

    public Deutschecraft() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        DCEntities.ENTITIES.register(bus);
        DCSounds.SOUNDS.register(bus);
    }

    @SuppressWarnings("null")
    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MODID, name.toLowerCase(Locale.ROOT));
    }

    // public static final CreativeModeTab TAB = new
    // CreativeModeTab(Deutschecraft.MODID) {
    // @Override
    // public @NotNull ItemStack makeIcon() {

    // }
    // };
}
