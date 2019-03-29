package pl.AVESKICODE.developers.whitelist.commands.base;

import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import pl.AVESKICODE.developers.whitelist.configuration.Settings;
import pl.AVESKICODE.developers.whitelist.utils.ChatColorUtil;

import java.util.Arrays;

public abstract class Command extends BukkitCommand {

    public Command(String name, String permission, String usage, String... aliases) {
        super(name, "desc", usage, Arrays.asList(aliases));
        setPermission(permission);
    }

    public abstract boolean execute(CommandSender sender, String[] args);

    public boolean execute(CommandSender sender, String arg, String[] args) {
        if (!sender.hasPermission(getPermission())) {
            ChatColorUtil.sendMessage((Player) sender, Settings.CONFIGURATION$WHITELIST$PERMISSIONS_MESSAGE);
            return false;
        }
        try {
            return execute(sender, args);
        } catch (IndexOutOfBoundsException exception) {
            ChatColorUtil.sendMessage((Player) sender, Settings.CONFIGURATION$WHITELIST$USAGE.replace("{USAGE}", getUsage()));
        } return true;
    }
}