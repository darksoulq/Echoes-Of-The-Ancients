
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.echoesoftheancients.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.echoesoftheancients.client.renderer.MummyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EchoesOfTheAncientsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EchoesOfTheAncientsModEntities.MUMMY.get(), MummyRenderer::new);
	}
}
