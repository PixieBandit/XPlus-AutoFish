package troy.autofish.compat;

import net.fabricmc.loader.api.FabricLoader;

/**
 * Utility class for checking the presence of optional mods.
 */
public final class Mods {
    private Mods() { }

    /**
     * True when the Stardew Fishing overhaul is loaded.
     */
    public static final boolean STARDEW_FISHING =
            FabricLoader.getInstance().isModLoaded("stardewfishing");
}

