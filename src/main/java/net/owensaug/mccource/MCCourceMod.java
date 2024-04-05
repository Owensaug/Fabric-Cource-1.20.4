package net.owensaug.mccource;

import net.fabricmc.api.ModInitializer;

import net.owensaug.mccource.block.ModBlocks;
import net.owensaug.mccource.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCCourceMod implements ModInitializer {
	public static final String MOD_ID = "mccource";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}