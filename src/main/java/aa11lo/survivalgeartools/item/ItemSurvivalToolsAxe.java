package aa11lo.survivalgeartools.item;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.ItemAxe;

public class ItemSurvivalToolsAxe extends ItemAxe {

    public ItemSurvivalToolsAxe(ToolMaterial material, float dammage, float speed, String unlocalizedName, String registryName){
        super(material, dammage, speed);

        setTranslationKey(survivalgeartools.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearToolsCreativeTab);
    }

}