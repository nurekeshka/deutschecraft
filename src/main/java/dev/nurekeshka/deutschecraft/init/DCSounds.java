package dev.nurekeshka.deutschecraft.init;

import dev.nurekeshka.deutschecraft.Deutschecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class DCSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(
            ForgeRegistries.SOUND_EVENTS, Deutschecraft.MODID);

    public static final RegistryObject<SoundEvent> MIRAS_DEATH = createEvent("entity.deutschecraft.miras.death");

    @SuppressWarnings("null")
    private static RegistryObject<SoundEvent> createEvent(String sound) {
        ResourceLocation location = Deutschecraft.prefix(sound);
        return SOUNDS.register(sound, () -> new SoundEvent(location));
    }
}