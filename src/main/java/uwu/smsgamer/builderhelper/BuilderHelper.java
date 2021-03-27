package uwu.smsgamer.builderhelper;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import uwu.smsgamer.builderhelper.compat.CompatibilityLoader;
import uwu.smsgamer.builderhelper.items.*;

public class BuilderHelper implements ModInitializer {
    public static final String MOD_ID = "builder_helper";

    public static final FillItem FILL_ITEM = new FillItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    public static final WallItem WALL_ITEM = new WallItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "fill_item"), FILL_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wall_item"), WALL_ITEM);
        CompatibilityLoader.loadCompatibilityLoaders();
    }
}
