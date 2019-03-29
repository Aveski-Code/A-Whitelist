package pl.AVESKICODE.developers.whitelist.managers;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import pl.AVESKICODE.developers.whitelist.Main;
import java.util.Arrays;

public class EventRegisterManager {

    public static void registerEvents(Listener... listeners) {
        PluginManager pluginManager = Bukkit.getPluginManager();
        Arrays.stream(listeners).forEach(listener -> pluginManager.registerEvents(listener, Main.getInst()));
    }
}
