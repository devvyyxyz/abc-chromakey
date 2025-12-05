/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.devvyyxyz.abcchromakey.init;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.devvyyxyz.abcchromakey.block.ChromakeyWhiteBlock;
import net.devvyyxyz.abcchromakey.block.ChromakeyOrangeBlock;
import net.devvyyxyz.abcchromakey.block.ChromakeyMagentaBlock;
import net.devvyyxyz.abcchromakey.block.ChromakeyLightBlueBlock;
import net.devvyyxyz.abcchromakey.AbcChromakeyMod;

import java.util.function.Function;

public class AbcChromakeyModBlocks {
	public static Block CHROMAKEY_WHITE;
	public static Block CHROMAKEY_ORANGE;
	public static Block CHROMAKEY_MAGENTA;
	public static Block CHROMAKEY_LIGHT_BLUE;

	public static void load() {
		CHROMAKEY_WHITE = register("chromakey_white", ChromakeyWhiteBlock::new);
		CHROMAKEY_ORANGE = register("chromakey_orange", ChromakeyOrangeBlock::new);
		CHROMAKEY_MAGENTA = register("chromakey_magenta", ChromakeyMagentaBlock::new);
		CHROMAKEY_LIGHT_BLUE = register("chromakey_light_blue", ChromakeyLightBlueBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> B register(String name, Function<BlockBehaviour.Properties, B> supplier) {
		return (B) Blocks.register(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AbcChromakeyMod.MODID, name)), (Function<BlockBehaviour.Properties, Block>) supplier, BlockBehaviour.Properties.of());
	}
}