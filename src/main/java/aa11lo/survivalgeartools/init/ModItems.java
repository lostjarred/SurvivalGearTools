package aa11lo.survivalgeartools.init;

import aa11lo.survivalgeartools.survivalgeartools;
import aa11lo.survivalgeartools.item.ItemSurvivalToolsAxe;
import aa11lo.survivalgeartools.material.SurvivalGearToolsMaterials;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(survivalgeartools.MODID)
public class ModItems {
   //TOOLS
    public static final Item TOOL_SURVIVAL_AXE = null;


    @EventBusSubscriber(modid = survivalgeartools.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                new ItemSurvivalToolsAxe(SurvivalGearToolsMaterials.SURVIVAL_TOOL, 2.5f, 7.0f, "tool_survival_axe", "tool_survival_axe")
            };
            
            survivalgeartools.LOGGER.info("Begining Item Register");
            for(int i =0; i < items.length; i++){
                survivalgeartools.LOGGER.info("Registering " + items[i].getTranslationKey());
                event.getRegistry().register(items[i]);
            }
        }
    }

}