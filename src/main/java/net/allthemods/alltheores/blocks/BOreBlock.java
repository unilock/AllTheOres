package net.allthemods.alltheores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BOreBlock extends OreBlock {

	public BOreBlock(float strength1, float strength2) {
		super(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound((strength1 == 4.0f) ? SoundType.NETHER_ORE : SoundType.ANCIENT_DEBRIS)
				.strength(strength1,strength2));

	}


}
