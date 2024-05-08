
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.echoesoftheancients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.echoesoftheancients.item.SandstoneBrickItem;
import net.mcreator.echoesoftheancients.item.AnkhItem;
import net.mcreator.echoesoftheancients.EchoesOfTheAncientsMod;

public class EchoesOfTheAncientsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EchoesOfTheAncientsMod.MODID);
	public static final RegistryObject<Item> SANDSTONE_PILLAR = block(EchoesOfTheAncientsModBlocks.SANDSTONE_PILLAR);
	public static final RegistryObject<Item> RIFT = block(EchoesOfTheAncientsModBlocks.RIFT);
	public static final RegistryObject<Item> SANDSTONE_BRICKS = block(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS);
	public static final RegistryObject<Item> SANDSTONE_BRICKS_STAIRS = block(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS_STAIRS);
	public static final RegistryObject<Item> SANDSTONE_BRICKS_WALLS = block(EchoesOfTheAncientsModBlocks.SANDSTONE_BRICKS_WALLS);
	public static final RegistryObject<Item> SANDSTONE_BRICK = REGISTRY.register("sandstone_brick", () -> new SandstoneBrickItem());
	public static final RegistryObject<Item> MUMMY_SPAWN_EGG = REGISTRY.register("mummy_spawn_egg", () -> new ForgeSpawnEggItem(EchoesOfTheAncientsModEntities.MUMMY, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> ANKH = REGISTRY.register("ankh", () -> new AnkhItem());
	public static final RegistryObject<Item> DESERT_LOCKED_DOOR = block(EchoesOfTheAncientsModBlocks.DESERT_LOCKED_DOOR);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
