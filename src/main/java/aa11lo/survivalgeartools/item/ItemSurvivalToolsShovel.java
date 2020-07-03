package aa11lo.survivalgeartools.item;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.ItemSpade;

public class ItemSurvivalToolsShovel extends ItemSpade {
    
    public ItemSurvivalToolsShovel(ToolMaterial material, String registryName){
        super(material);
        
        setTranslationKey(survivalgeartools.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearToolsCreativeTab);
    }

}