
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectnumfive.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.projectnumfive.block.BlockofCheeseBlock;
import net.mcreator.projectnumfive.ProjectNumfiveMod;

public class ProjectNumfiveModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, ProjectNumfiveMod.MODID);
	public static final DeferredHolder<Block, Block> BLOCKOF_CHEESE = REGISTRY.register("blockof_cheese", () -> new BlockofCheeseBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
