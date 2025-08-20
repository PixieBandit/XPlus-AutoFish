package troy.autofish.compat.stardewfishing;

import net.minecraft.entity.projectile.FishingBobberEntity;
import troy.autofish.compat.Mods;

/**
 * Minimal hooks for interacting with Stardew Fishing when present.
 */
public final class StardewFishingCompat {
    private StardewFishingCompat() { }

    /**
     * Returns {@code true} if the given bobber belongs to Stardew Fishing.
     * The mod reuses the vanilla {@link FishingBobberEntity} class, so this
     * simply checks if the mod is loaded.
     */
    public static boolean isStardewBobber(FishingBobberEntity bobber) {
        return Mods.STARDEW_FISHING && bobber != null;
    }
}
