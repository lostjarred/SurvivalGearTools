package aa11lo.survivalgeartools.init;

import aa11lo.survivalgeartools.survivalgeartools;
import aa11lo.survivalgeartools.item.ItemBasic;
import aa11lo.survivalgeartools.material.SurvivalGearToolsMaterials;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(survivalgeartools.MODID)
public class ModItems {
   
    @EventBusSubscriber(modid = survivalgeartools.MODID)
    public static class RegistrationHandler{
        @SubscribeEvent
        public static void registerItems(Register<Item> event){
            final Item[] items ={
                
            };
            
            survivalgeartools.LOGGER.info("Begining Item Register");
            for(int i =0; i < items.length; i++){
                survivalgeartools.LOGGER.info("Registering " + items[i].getTranslationKey());
                event.getRegistry().register(items[i]);
            }
        }
    }

}