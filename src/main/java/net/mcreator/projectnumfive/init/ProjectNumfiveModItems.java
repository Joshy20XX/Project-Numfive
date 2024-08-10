
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectnumfive.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.projectnumfive.item.SlicedCheeseItem;
import net.mcreator.projectnumfive.item.RubycoinItem;
import net.mcreator.projectnumfive.item.IdontknowItem;
import net.mcreator.projectnumfive.ProjectNumfiveMod;

public class ProjectNumfiveModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, ProjectNumfiveMod.MODID);
	public static final DeferredHolder<Item, Item> RUBYCOIN = REGISTRY.register("rubycoin", () -> new RubycoinItem());
	public static final DeferredHolder<Item, Item> IDONTKNOW = REGISTRY.register("idontknow", () -> new IdontknowItem());
	public static final DeferredHolder<Item, Item> SLICED_CHEESE = REGISTRY.register("sliced_cheese", () -> new SlicedCheeseItem());
	public static final DeferredHolder<Item, Item> BLOCKOF_CHEESE = block(ProjectNumfiveModBlocks.BLOCKOF_CHEESE);
	public static final DeferredHolder<Item, Item> PACKED_COBBLE_STONE = block(ProjectNumfiveModBlocks.PACKED_COBBLE_STONE);
	public static final DeferredHolder<Item, Item> SUPER_PACKED_COBBLE_STONE = block(ProjectNumfiveModBlocks.SUPER_PACKED_COBBLE_STONE);
	public static final DeferredHolder<Item, Item> SQUIRREL_SPAWN_EGG = REGISTRY.register("squirrel_spawn_egg", () -> new DeferredSpawnEggItem(ProjectNumfiveModEntities.SQUIRREL, -6737152, -10092544, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
