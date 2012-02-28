package com.precipicegames.utilities.interfaces;

import org.bukkit.block.Block;

/**
 * Defines a complex data block (like a chest or furnace)<br>
 * This interface also has wrappers for the TileEntities that are<br>
 * supported (for ease of use)<br>
 * 
 * @author HACKhalo2
 * @author dotblank
 * @since 0.1
 * @version 0.1
 */
public interface ComplexDataBlock {
	
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
