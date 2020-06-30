package aa11lo.survivalgeartools.tabs;

import aa11lo.survivalgeartools.survivalgeartools;
import aa11lo.survivalgeartools.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SurvivalGearToolsTab extends CreativeTabs {
    
    public SurvivalGearToolsTab(){
        super(survivalgeartools.MODID);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack createIcon(){
        return new ItemStack(ModItems.TOOL_SURIVIVAL_AXE);
    }
}