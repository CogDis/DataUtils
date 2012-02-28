package com.precipicegames.utilities.interfaces;

import org.bukkit.block.Block;

/**
 * Defines a block that has simple Data Values<br>
 * (eg 90% of all the data-enabled blocks in Minecraft)<br>
 * This also defines simple block switching (like rose to yellow flower)
 * @author HACKhalo2
 * @author dotblank
 * @since 0.1
 * @version 0.1
 *
 */
public interface SimplisticDataBlock {
	
	/**
	 * Rotates the Data Value of the given block left<br>
	 * This is dependent on the block, as Minecraft<br>
	 * has some funky data values on certian blocks
	 * 
	 * @param block the Bukkit Block 
	 * @return the modified data value (byte)
	 */
	byte rotateLeft(Block block);
	
	/**
	 * Rotates the Data Value of the given block right<br>
	 * This is dependent on the block, as Minecraft<br>
	 * has some funky data values on certian blocks
	 * 
	 * @param block the Bukkit Block 
	 * @return the modified data value (byte)
	 */
	byte rotateRight(Block block);
	
	/**
	 * Mirror's the block (inverses the data)<br>
	 * Useful if you want to mirror one side to the other
	 * 
	 * @param block the Bukkit Block 
	 * @return the modified data value (byte)
	 */
	byte mirror(Block block);

}
