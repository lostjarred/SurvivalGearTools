package aa11lo.survivalgeartools;

import org.apache.logging.log4j.Logger;

import aa11lo.survivalgeartools.tabs.SurvivalGearToolsTab;

import org.apache.logging.log4j.LogManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = survivalgeartools.MODID, name = survivalgeartools.NAME, version = survivalgeartools.VERSION, acceptedMinecraftVersions = survivalgeartools.MC_VERSION)
public class survivalgeartools {

	public static final String MODID = "survialgeartools";
	public static final String NAME = "Survival Gear Tools Mod";
	public static final String VERSION = "0.1.0beta";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(survivalgeartools.MODID);

	public static final CreativeTabs SurvivalGearArmorTab = new SurvivalGearToolsTab();

	@EventHandler
	public void preInit(final FMLPreInitializationEvent event) {

	}

	@EventHandler
	public void init(final FMLInitializationEvent event) {
		LOGGER.info(survivalgeartools.NAME + ": Loading");
	}

	@EventHandler
	public void postInit(final FMLPostInitializationEvent event) {
        
	}

}