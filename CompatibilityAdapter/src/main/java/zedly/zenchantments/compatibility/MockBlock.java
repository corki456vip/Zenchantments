/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zedly.zenchantments.compatibility;

import java.util.Collection;
import java.util.List;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.plugin.Plugin;

/**
 * Wrapper class for firing more accurate events
 * @author Dennis
 */
public class MockBlock implements Block {

    private final Block realBlock;
    private final Material newType;
    private final byte newData;

    public MockBlock(Block realBlock, Material newType, byte newData) {
        this.realBlock = realBlock;
        this.newType = newType;
        this.newData = newData;
    }

    @Override
    public byte getData() {
        return newData;
    }

    @Override
    public Block getRelative(int i, int i1, int i2) {
        return realBlock.getRelative(i, i1, i2);
    }

    @Override
    public Block getRelative(BlockFace bf) {
         return realBlock.getRelative(bf);
    }

    @Override
    public Block getRelative(BlockFace bf, int i) {
        return realBlock.getRelative(bf, i);
    }

    @Override
    public Material getType() {
        return newType;
    }

    @Override
    public int getTypeId() {
        return newType.getId();
    }

    @Override
    public byte getLightLevel() {
        return realBlock.getLightLevel();
    }

    @Override
    public byte getLightFromSky() {
        return realBlock.getLightFromSky();
    }

    @Override
    public byte getLightFromBlocks() {
       return realBlock.getLightFromSky();
    }

    @Override
    public World getWorld() {
        return realBlock.getWorld();
    }

    @Override
    public int getX() {
        return realBlock.getX();
    }

    @Override
    public int getY() {
        return realBlock.getY();
    }

    @Override
    public int getZ() {
        return realBlock.getZ();
    }

    @Override
    public Location getLocation() {
        return realBlock.getLocation();
    }

    @Override
    public Location getLocation(Location lctn) {
        return realBlock.getLocation(lctn);
    }

    @Override
    public Chunk getChunk() {
        return realBlock.getChunk();
    }

    @Override
    public void setData(byte b) {
        realBlock.setData(b);
    }

    @Override
    public void setData(byte b, boolean bln) {
        realBlock.setData(b, bln);
    }

    @Override
    public void setType(Material mtrl) {
        realBlock.setType(mtrl);
    }

    @Override
    public void setType(Material mtrl, boolean bln) {
        realBlock.setType(mtrl, bln);
    }

    @Override
    public boolean setTypeId(int i) {
        return realBlock.setTypeId(i);
    }

    @Override
    public boolean setTypeId(int i, boolean bln) {
        return realBlock.setTypeId(i, bln);
    }

    @Override
    public boolean setTypeIdAndData(int i, byte b, boolean bln) {
        return realBlock.setTypeIdAndData(i, b, bln);
    }

    @Override
    public BlockFace getFace(Block block) {
        return realBlock.getFace(block);
    }

    @Override
    public BlockState getState() {
        return new MockBlockState(realBlock, newType, newData);
    }

    @Override
    public Biome getBiome() {
        return realBlock.getBiome();
    }

    @Override
    public void setBiome(Biome biome) {
        realBlock.setBiome(biome);
    }

    @Override
    public boolean isBlockPowered() {
        return realBlock.isBlockPowered();
    }

    @Override
    public boolean isBlockIndirectlyPowered() {
       return realBlock.isBlockIndirectlyPowered();
    }

    @Override
    public boolean isBlockFacePowered(BlockFace bf) {
        return realBlock.isBlockFacePowered(bf);
    }

    @Override
    public boolean isBlockFaceIndirectlyPowered(BlockFace bf) {
        return realBlock.isBlockFaceIndirectlyPowered(bf);
    }

    @Override
    public int getBlockPower(BlockFace bf) {
        return realBlock.getBlockPower(bf);
    }

    @Override
    public int getBlockPower() {
        return realBlock.getBlockPower();
    }

    @Override
    public boolean isEmpty() {
        return newType == Material.AIR;
    }

    @Override
    public boolean isLiquid() {
        return false;
    }

    @Override
    public double getTemperature() {
        return realBlock.getTemperature();
    }

    @Override
    public double getHumidity() {
        return realBlock.getHumidity();
    }

    @Override
    public PistonMoveReaction getPistonMoveReaction() {
        return realBlock.getPistonMoveReaction();
    }

    @Override
    public boolean breakNaturally() {
        return realBlock.breakNaturally();
    }

    @Override
    public boolean breakNaturally(ItemStack is) {
        return realBlock.breakNaturally(is);
    }

    @Override
    public Collection<ItemStack> getDrops() {
        return realBlock.getDrops();
    }

    @Override
    public Collection<ItemStack> getDrops(ItemStack is) {
        return realBlock.getDrops(is);
    }

    @Override
    public void setMetadata(String string, MetadataValue mv) {
        realBlock.setMetadata(string, mv);
    }

    @Override
    public List<MetadataValue> getMetadata(String string) {
        return realBlock.getMetadata(string);
    }

    @Override
    public boolean hasMetadata(String string) {
        return realBlock.hasMetadata(string);
    }

    @Override
    public void removeMetadata(String string, Plugin plugin) {
        realBlock.removeMetadata(string, plugin);
    }

}
