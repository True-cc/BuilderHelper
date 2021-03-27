package uwu.smsgamer.builderhelper.compat;

import uwu.smsgamer.builderhelper.compat.chitsAndBisels.BACCompat;
import uwu.smsgamer.builderhelper.compat.worldedit.WorldEditCompat;

public abstract class CompatibilityLoader {
    public static void loadCompatibilityLoaders() {
        new BACCompat().load();
        new WorldEditCompat().load();
    }

    public void load() {
        if (shouldInitialize()) onInitialize();
    }

    public abstract boolean shouldInitialize();

    public abstract void onInitialize();
}
