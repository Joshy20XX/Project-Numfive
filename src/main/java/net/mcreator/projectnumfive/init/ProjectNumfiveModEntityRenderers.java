
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectnumfive.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.projectnumfive.client.renderer.SquirrelRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ProjectNumfiveModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ProjectNumfiveModEntities.SQUIRREL.get(), SquirrelRenderer::new);
	}
}
