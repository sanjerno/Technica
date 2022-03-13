package net.technica;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Technica implements ModInitializer {

    public static final Item WRENCH = new Wrench(new Item.Settings().group(ItemGroup.MISC).maxCount(1));

    public static final Block COBALT_ORE = new cobalt_ore();

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("technica", "wrench"), WRENCH);
        Registry.register(Registry.BLOCK, new Identifier("technica", "cobalt_ore"), COBALT_ORE);
        Registry.register(Registry.ITEM, new Identifier("technica", "cobalt_ore"), new BlockItem(COBALT_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }
    
}
