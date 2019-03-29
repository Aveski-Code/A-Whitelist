package pl.AVESKICODE.developers.whitelist;

import org.bukkit.plugin.java.JavaPlugin;
import pl.AVESKICODE.developers.whitelist.commands.WhiteListCommand;
import pl.AVESKICODE.developers.whitelist.configuration.Settings;
import pl.AVESKICODE.developers.whitelist.configuration.managers.Config;
import pl.AVESKICODE.developers.whitelist.configuration.managers.ConfigurationManager;
import pl.AVESKICODE.developers.whitelist.events.PlayerLoginListener;
import pl.AVESKICODE.developers.whitelist.managers.CommandRegisterManager;
import pl.AVESKICODE.developers.whitelist.managers.EventRegisterManager;
import java.io.File;
import java.util.Objects;

public class Main extends JavaPlugin {

    private static Main inst;
    private Config settings = ConfigurationManager.create(new File(getDataFolder(), "config.yml"), Settings.class);

    public static Main getInst() {
        return inst;
    }

    public void saveConfiguration() {
        if (Objects.nonNull(settings)) {
            settings.save();
        }
    }

    @Override
    public void onEnable() {
        inst = this;
        if (!getDataFolder().exists()) getDataFolder().mkdir();
        registerCommands();
        registerEvents();
        getLogger().info(Settings.CONFIGURATION$PLUGIN_IS_ENABLE);
    }

    private void registerCommands() {
        CommandRegisterManager.registerCommands(new WhiteListCommand());

    }

    private void registerEvents() {
        EventRegisterManager.registerEvents(new PlayerLoginListener());

    }

    @Override
    public void onDisable() {
        getLogger().info(Settings.CONFIGURATION$PLUGIN_IS_DISABLE);
    }

}
