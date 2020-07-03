package aa11lo.survivalgeartools.material;

import aa11lo.survivalgeartools.survivalgeartools;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class SurvivalGearToolsMaterials {
    //name harvestlevel maxuses efficienty dammage enchantably
    public static final ToolMaterial SURVIVAL_TOOL = EnumHelper.addToolMaterial(survivalgeartools.MODID + ":" + "survival_tool" , 2, 625, 7.0f, 2.5f, 10);
}