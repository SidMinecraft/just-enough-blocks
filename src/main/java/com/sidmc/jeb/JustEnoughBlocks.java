package com.sidmc.jeb;

import com.sidmc.jeb.blocks.AndesiteTile;
import com.sidmc.jeb.blocks.DioriteTile;
import com.sidmc.jeb.blocks.GraniteTile;

import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class JustEnoughBlocks implements ModInitializer {

	public static final Block ANDESITE_TILE = new AndesiteTile();

	public static final Block DIORITE_TILE = new DioriteTile();

	public static final Block GRANITE_TILE = new GraniteTile();

	@Override
	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("jeb", "andesite_tile"), ANDESITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("jeb", "andesite_tile"), new BlockItem(ANDESITE_TILE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("jeb", "diorite_tile"), DIORITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("jeb", "diorite_tile"), new BlockItem(DIORITE_TILE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.BLOCK, new Identifier("jeb", "granite_tile"), GRANITE_TILE);
		Registry.register(Registry.ITEM, new Identifier("jeb", "granite_tile"), new BlockItem(GRANITE_TILE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
	}
	
}
