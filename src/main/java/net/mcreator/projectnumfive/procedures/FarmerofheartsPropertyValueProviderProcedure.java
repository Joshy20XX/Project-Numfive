package net.mcreator.projectnumfive.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class FarmerofheartsPropertyValueProviderProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandlerEntSetSlot) {
			ItemStack _setstack = new ItemStack(Items.CAKE).copy();
			_setstack.setCount(1);
			_modHandlerEntSetSlot.setStackInSlot(0, _setstack);
		}
	}
}
