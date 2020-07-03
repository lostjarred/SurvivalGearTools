package aa11lo.survivalgeartools.item;

import net.minecraft.item.ItemSword;
import aa11lo.survivalgeartools.survivalgeartools;
public class ItemSurvivalToolsKnife extends ItemSword {
    public ItemSurvivalToolsKnife(ToolMaterial material, String registryName){
        super(material);

        setTranslationKey(survivalgeartools.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearToolsCreativeTab);
    }

}