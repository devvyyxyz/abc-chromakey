/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.devvyyxyz.abcchromakey.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.devvyyxyz.abcchromakey.AbcChromakeyMod;

import java.util.function.Function;

public class AbcChromakeyModItems {
	public static Item CHROMAKEY_WHITE;
	public static Item CHROMAKEY_ORANGE;
	public static Item CHROMAKEY_MAGENTA;
	public static Item CHROMAKEY_LIGHT_BLUE;

	public static void load() {
		CHROMAKEY_WHITE = block(AbcChromakeyModBlocks.CHROMAKEY_WHITE, "chromakey_white", new Item.Properties().fireResistant());
		CHROMAKEY_ORANGE = block(AbcChromakeyModBlocks.CHROMAKEY_ORANGE, "chromakey_orange", new Item.Properties().fireResistant());
		CHROMAKEY_MAGENTA = block(AbcChromakeyModBlocks.CHROMAKEY_MAGENTA, "chromakey_magenta", new Item.Properties().fireResistant());
		CHROMAKEY_LIGHT_BLUE = block(AbcChromakeyModBlocks.CHROMAKEY_LIGHT_BLUE, "chromakey_light_blue", new Item.Properties().fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> I register(String name, Function<Item.Properties, ? extends I> supplier) {
		return (I) Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AbcChromakeyMod.MODID, name)), (Function<Item.Properties, Item>) supplier);
	}

	private static Item block(Block block, String name) {
		return block(block, name, new Item.Properties());
	}

	private static Item block(Block block, String name, Item.Properties properties) {
		return Items.registerItem(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AbcChromakeyMod.MODID, name)), prop -> new BlockItem(block, prop), properties);
	}
}