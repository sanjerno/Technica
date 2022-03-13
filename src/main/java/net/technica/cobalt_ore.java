package net.technica;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;

public class cobalt_ore extends Block {

    public cobalt_ore() {
        super(FabricBlockSettings.copy(Blocks.IRON_ORE).sounds(BlockSoundGroup.STONE));
    }
    
}
