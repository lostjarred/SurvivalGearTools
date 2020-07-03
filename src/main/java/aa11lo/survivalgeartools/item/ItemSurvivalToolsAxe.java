package aa11lo.survivalgeartools.item;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.ItemAxe;

public class ItemSurvivalToolsAxe extends ItemAxe {

    public ItemSurvivalToolsAxe(ToolMaterial material, String registryName){
        super(material, material.getAttackDamage(), material.getEfficiency());

        setTranslationKey(survivalgeartools.MODID + "." + registryName);
        setRegistryName(registryName);
        setCreativeTab(survivalgeartools.SurvivalGearToolsCreativeTab);
    }

}