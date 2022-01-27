package rakkis157.excessive_realism;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rakkis157.excessive_realism.block.ERBlock;
import rakkis157.excessive_realism.item.ERItem;
import rakkis157.excessive_realism.item.ERItemGroup;

public class ExcessiveRealism implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_NAME = "Excessive Realism";
	public static final String MOD_ID = "excessive_realism";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ERItem.init();
		ERBlock.init();
		LOGGER.info("Setup for " + MOD_NAME + " Complete.");
	}
}
