package dev.nurekeshka.deutschecraft.events;

import dev.nurekeshka.deutschecraft.Deutschecraft;
import dev.nurekeshka.deutschecraft.entity.Miras;
import dev.nurekeshka.deutschecraft.init.DCEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Deutschecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonEvents {
    @SubscribeEvent
    public static void entityAttributes(EntityAttributeCreationEvent event) {
        event.put(DCEntities.MIRAS.get(), Miras.createAttributes().build());
    }
}
