
package net.mcreator.echoesoftheancients.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AnkhItem extends Item {
	public AnkhItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
