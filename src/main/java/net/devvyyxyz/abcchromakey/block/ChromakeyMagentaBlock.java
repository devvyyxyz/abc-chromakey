package net.devvyyxyz.abcchromakey.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class ChromakeyMagentaBlock extends Block {
	public ChromakeyMagentaBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}