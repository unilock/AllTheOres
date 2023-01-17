package net.allthemods.alltheores.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class AOreBlock extends OreBlock {

	public AOreBlock(float strength1, float strength2) {
		super(Block.Properties.of(Material.METAL).requiresCorrectToolForDrops().sound((strength1 > 3.0f) ? SoundType.DEEPSLATE : SoundType.STONE)
					.strength(strength1,strength2));

	}


}
