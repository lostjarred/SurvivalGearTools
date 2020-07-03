package aa11lo.survivalgeartools.client;

import aa11lo.survivalgeartools.survivalgeartools;
import aa11lo.survivalgeartools.init.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = survivalgeartools.MODID)
public class ModelRegistrationHandler {
    @SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
        registerModel(ModItems.TOOL_SURVIVAL_AXE, 0);
        registerModel(ModItems.TOOL_SURVIVAL_KNIFE, 0);
    }

    private static void registerModel(Item item, int meta) {
        aa11lo.survivalgeartools.survivalgeartools.LOGGER.info("loading model from " + item.getRegistryName());
        
        ModelLoader.setCustomModelResourceLocation(item, meta, 
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}