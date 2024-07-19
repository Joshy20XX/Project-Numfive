
package net.mcreator.projectnumfive.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RubycoinItem extends Item {
	public RubycoinItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
