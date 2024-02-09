package dev.nurekeshka.deutschecraft.client.renderer;

import dev.nurekeshka.deutschecraft.Deutschecraft;
import dev.nurekeshka.deutschecraft.client.models.MirasModel;
import dev.nurekeshka.deutschecraft.entity.Miras;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MirasRenderer extends MobRenderer<Miras, MirasModel> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Deutschecraft.MODID,
            "textures/entities/miras.png");

    @SuppressWarnings("null")
    public MirasRenderer(EntityRendererProvider.Context context) {
        super(context, new MirasModel(context.bakeLayer(MirasModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(@SuppressWarnings("null") Miras miras) {
        return TEXTURE;
    }
}
