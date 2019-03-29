package pl.AVESKICODE.developers.whitelist.managers;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandMap;
import org.bukkit.plugin.SimplePluginManager;
import java.lang.reflect.Field;

public class CommandRegisterManager {

    private static CommandMap commandMap;

    public static void registerCommands(Command command) {
        if (commandMap == null) {
            try {
                Field field = SimplePluginManager.class.getDeclaredField("commandMap");
                field.setAccessible(true);
                commandMap = (CommandMap) field.get(Bukkit.getServer().getPluginManager());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        commandMap.register("BaseManager", command);
    }
}

