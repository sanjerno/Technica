package net.technica;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Technica implements ModInitializer {

    public static final Item FABRIC_ITEM = new Wrench(new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("technica", "wrench"), FABRIC_ITEM);
    }
    
}
