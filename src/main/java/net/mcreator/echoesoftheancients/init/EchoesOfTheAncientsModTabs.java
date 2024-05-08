
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.echoesoftheancients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.echoesoftheancients.EchoesOfTheAncientsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EchoesOfTheAncientsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EchoesOfTheAncientsMod.MODID);
	public static final RegistryObject<CreativeModeTab> ANCIENT_DESERTS = REGISTRY.register("ancient_deserts",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.echoes_of_the_ancients.ancient_deserts")).icon(() -> new ItemStack(EchoesOfTheAncientsModBlocks.SANDSTONE_PILLAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EchoesOfTheAncientsModBlocks.SANDSTONE_PILLAR.get().asItem());
				tabData.accept(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS.get().asItem());
				tabData.accept(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS_STAIRS.get().asItem());
				tabData.accept(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS_WALLS.get().asItem());
				tabData.accept(EchoesOfTheAncientsModItems.SANDSTONE_BRICK.get());
				tabData.accept(EchoesOfTheAncientsModItems.ANKH.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(EchoesOfTheAncientsModItems.MUMMY_SPAWN_EGG.get());
		}
	}
}
