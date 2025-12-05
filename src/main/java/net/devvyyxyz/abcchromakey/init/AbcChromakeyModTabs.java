/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.devvyyxyz.abcchromakey.init;

import net.minecraft.world.item.CreativeModeTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class AbcChromakeyModTabs {
	public static void load() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(tabData -> {
			tabData.accept(AbcChromakeyModBlocks.CHROMAKEY_WHITE.asItem());
			tabData.accept(AbcChromakeyModBlocks.CHROMAKEY_ORANGE.asItem());
			tabData.accept(AbcChromakeyModBlocks.CHROMAKEY_MAGENTA.asItem());
			tabData.accept(AbcChromakeyModBlocks.CHROMAKEY_LIGHT_BLUE.asItem());
		});
	}
}