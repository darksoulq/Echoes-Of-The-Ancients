
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.echoesoftheancients.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.echoesoftheancients.block.SandstonePillarBlock;
import net.mcreator.echoesoftheancients.block.SandstoneBricksWallsBlock;
import net.mcreator.echoesoftheancients.block.SandstoneBricksStairsBlock;
import net.mcreator.echoesoftheancients.block.SandstoneBricksBlock;
import net.mcreator.echoesoftheancients.block.RiftBlock;
import net.mcreator.echoesoftheancients.block.DesertLockedDoorBlock;
import net.mcreator.echoesoftheancients.EchoesOfTheAncientsMod;

public class EchoesOfTheAncientsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EchoesOfTheAncientsMod.MODID);
	public static final RegistryObject<Block> SANDSTONE_PILLAR = REGISTRY.register("sandstone_pillar", () -> new SandstonePillarBlock());
	public static final RegistryObject<Block> RIFT = REGISTRY.register("rift", () -> new RiftBlock());
	public static final RegistryObject<Block> SANDSTONE_BRICKS = REGISTRY.register("sandstone_bricks", () -> new SandstoneBricksBlock());
	public static final RegistryObject<Block> SANDSTONE_BRICKS_STAIRS = REGISTRY.register("sandstone_bricks_stairs", () -> new SandstoneBricksStairsBlock());
	public static final RegistryObject<Block> SANDSTONE_BRICKS_WALLS = REGISTRY.register("sandstone_bricks_walls", () -> new SandstoneBricksWallsBlock());
	public static final RegistryObject<Block> DESERT_LOCKED_DOOR = REGISTRY.register("desert_locked_door", () -> new DesertLockedDoorBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
