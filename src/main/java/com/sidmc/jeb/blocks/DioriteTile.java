package com.sidmc.jeb.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class DioriteTile extends Block {

    public DioriteTile() {
        super(FabricBlockSettings.copy(Blocks.DIORITE));
    }
    
}