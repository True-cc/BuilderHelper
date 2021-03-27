package uwu.smsgamer.builderhelper.compat.worldedit;

import net.fabricmc.loader.api.FabricLoader;
import uwu.smsgamer.builderhelper.compat.CompatibilityLoader;
import uwu.smsgamer.builderhelper.compat.worldedit.utils.WEBlockUtils;
import uwu.smsgamer.builderhelper.utils.BlockUtils;

public class WorldEditCompat extends CompatibilityLoader {
    @Override
    public boolean shouldInitialize() {
        return FabricLoader.getInstance().isModLoaded("worldedit");
    }

    @Override
    public void onInitialize() {
        System.out.println("BuilderHelper WorldEdit Compatibility loading!");
        BlockUtils.INSTANCE = new WEBlockUtils();
    }
}
