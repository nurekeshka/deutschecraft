package dev.nurekeshka.deutschecraft.events;

import dev.nurekeshka.deutschecraft.Deutschecraft;
import dev.nurekeshka.deutschecraft.client.models.MirasModel;
import dev.nurekeshka.deutschecraft.client.renderer.MirasRenderer;
import dev.nurekeshka.deutschecraft.init.DCEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Deutschecraft.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEvents {
    @SuppressWarnings("null")
    @SubscribeEvent
    public static void entityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(DCEntities.MIRAS.get(), MirasRenderer::new);
    }

    @SuppressWarnings("null")
    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MirasModel.LAYER_LOCATION, MirasModel::createBodyLayer);
    }
}
