package dev.nurekeshka.deutschecraft.init;

import dev.nurekeshka.deutschecraft.Deutschecraft;
import dev.nurekeshka.deutschecraft.entity.Miras;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DCEntities {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister
			.create(ForgeRegistries.ENTITY_TYPES, Deutschecraft.MODID);

	public static final RegistryObject<EntityType<Miras>> MIRAS = ENTITIES.register("miras",
			() -> EntityType.Builder.of(Miras::new, MobCategory.MONSTER).sized(1.0f, 2.0f)
					.build(Deutschecraft.MODID + ":miras"));
}
