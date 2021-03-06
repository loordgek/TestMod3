package choonster.testmod3.item;

import choonster.testmod3.TestMod3;
import net.minecraft.item.Item;

/**
 * A base class for this mod's items.
 *
 * @author Choonster
 */
public class ItemTestMod3 extends Item {
	public ItemTestMod3(final String itemName) {
		setItemName(this, itemName);
		setCreativeTab(TestMod3.creativeTab);
	}

	/**
	 * Set the registry name of {@code item} to {@code itemName} and the unlocalised name to the full registry name.
	 *
	 * @param item     The item
	 * @param itemName The item's name
	 */
	public static void setItemName(final Item item, final String itemName) {
		item.setRegistryName(TestMod3.MODID, itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}
