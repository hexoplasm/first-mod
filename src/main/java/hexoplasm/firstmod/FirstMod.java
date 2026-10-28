package hexoplasm.firstmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hexoplasm.firstmod.item.ModItems;
import hexoplasm.firstmod.tab.ModCreativeTabs;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info(MOD_ID+"initialized");

		ModCreativeTabs.registerModCreativeTabs();

		ModItems.registerModItems();
	}

}
