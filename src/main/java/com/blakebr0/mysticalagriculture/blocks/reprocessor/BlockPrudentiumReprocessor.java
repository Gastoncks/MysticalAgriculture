package com.blakebr0.mysticalagriculture.blocks.reprocessor;

import com.blakebr0.cucumber.lib.Colors;
import com.blakebr0.mysticalagriculture.tileentity.reprocessor.TilePrudentiumReprocessor;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockPrudentiumReprocessor extends BlockEssenceReprocessor {

	public BlockPrudentiumReprocessor() {
		super("prudentium_reprocessor");
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		return new TilePrudentiumReprocessor();
	}
	
	@Override
	public String getTooltipColor() {
		return Colors.GREEN;
	}
}
