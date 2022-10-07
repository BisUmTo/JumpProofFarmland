package it.bisumto.jumpprooffarmland;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JumpProofFarmland implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("jumpprooffarmland");

    @Override
    public void onInitialize() {
        LOGGER.info("Mod loaded");
    }
}
