package aa11lo.survivalgeartools.item;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.Item;

public class ItemBasic extends Item{
    public ItemBasic(String unlocalisedName, String registryName){
        setTranslationKey(survivalgeartools.MODID + "." + unlocalisedName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearArmorTab);
    }
}