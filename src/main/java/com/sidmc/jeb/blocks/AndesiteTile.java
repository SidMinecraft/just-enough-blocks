package com.sidmc.jeb.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class AndesiteTile extends Block {

    public AndesiteTile() {
        super(FabricBlockSettings.copy(Blocks.ANDESITE));
    }
    
}