package net.devvyyxyz.abcchromakey;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.ClientModInitializer;

import net.devvyyxyz.abcchromakey.init.AbcChromakeyModBlocksRenderers;

@Environment(EnvType.CLIENT)
public class AbcChromakeyModClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// Start of user code block mod constructor
		// End of user code block mod constructor
		AbcChromakeyModBlocksRenderers.clientLoad();
		// Start of user code block mod init
		// End of user code block mod init
	}
	// Start of user code block mod methods
	// End of user code block mod methods
}