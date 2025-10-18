package portablejim.bbw.basics;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import javax.annotation.Nullable;

/**
 * Created by james on 16/12/16.
 */
public class ReplacementTriplet {
    public IBlockState source, target;
    public @Nullable NBTTagCompound targetTE;
    public ItemStack items;

    public ReplacementTriplet(IBlockState source, ItemStack items, IBlockState target, @Nullable NBTTagCompound targetTE) {
        this.source = source;
        this.target = target;
        this.targetTE = targetTE;
        this.items = items;
    }
}

