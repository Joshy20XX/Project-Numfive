
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.projectnumfive.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.projectnumfive.ProjectNumfiveMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ProjectNumfiveModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectNumfiveMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(ProjectNumfiveModBlocks.PACKED_COBBLE_STONE.get().asItem());
			tabData.accept(ProjectNumfiveModBlocks.SUPER_PACKED_COBBLE_STONE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(ProjectNumfiveModItems.SUPER_PACKED_CLUB.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ProjectNumfiveModItems.SQUIRREL_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(ProjectNumfiveModItems.RUBYCOIN.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(ProjectNumfiveModItems.SLICED_CHEESE.get());
			tabData.accept(ProjectNumfiveModBlocks.BLOCKOF_CHEESE.get().asItem());
		}
	}
}
