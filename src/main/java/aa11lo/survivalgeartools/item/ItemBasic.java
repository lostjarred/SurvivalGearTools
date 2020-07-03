package aa11lo.survivalgeartools.item;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.Item;

public class ItemBasic extends Item{
    public ItemBasic(String registryName){
        setTranslationKey(survivalgeartools.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearToolsCreativeTab);
    }
}