package dev.nurekeshka.deutschecraft.util;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import javax.annotation.Nullable;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;

public class EntityUtil {
    private static final MethodHandles.Lookup LOOKUP = MethodHandles.lookup();
    private static final Method LivingEntity_getDeathSound = ObfuscationReflectionHelper.findMethod(LivingEntity.class,
            "getDeathSound");
    private static final MethodHandle handle_LivingEntity_getDeathSound;

    static {
        MethodHandle tmp_handle_LivingEntity_getDeathSound = null;

        try {
            tmp_handle_LivingEntity_getDeathSound = LOOKUP.unreflect(LivingEntity_getDeathSound);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        handle_LivingEntity_getDeathSound = tmp_handle_LivingEntity_getDeathSound;
    }

    @Nullable
    public static SoundEvent getDeathSound(LivingEntity living) {
        SoundEvent sound = null;

        if (handle_LivingEntity_getDeathSound != null) {
            try {
                sound = (SoundEvent) handle_LivingEntity_getDeathSound.invokeExact(living);
            } catch (Throwable e) {
                // FAIL SILENTLY
            }
        }
        return sound;
    }
}
