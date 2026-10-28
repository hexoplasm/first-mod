package hexoplasm.firstmod.tab;

import hexoplasm.firstmod.FirstMod;
import hexoplasm.firstmod.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTabs {
    public static final CreativeModeTab FLUORITE_ITEM_TAB = Registry.register(
        // 1. What (are we registering)
        BuiltInRegistries.CREATIVE_MODE_TAB,
        // 2. Where (is this registry)
        Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "fluorite_items"),
        // 3. Apply (the object to your registry)
        FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.FLUORITE))
            .title(Component.translatable("createtab.firstmod.fluorite_items"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.FLUORITE);
                output.accept(ModItems.RAW_FLUORITE);
    }).build());


    public static final CreativeModeTab FLUORITE_BLOCK_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
        Identifier.fromNamespaceAndPath(FirstMod.MOD_ID, "fluorite_block"),
        FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_FLUORITE))
            .title(Component.translatable("createtab.firstmod.fluorite_block"))
            .displayItems((parameters, output) -> {
                output.accept(ModItems.RAW_FLUORITE);
    }).build());





    public static void registerModCreativeTabs() {
        FirstMod.LOGGER.info("Registering Creative Tabs");
    }
}
