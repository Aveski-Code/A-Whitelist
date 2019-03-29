package pl.AVESKICODE.developers.whitelist.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import pl.AVESKICODE.developers.whitelist.Main;
import pl.AVESKICODE.developers.whitelist.commands.base.Command;
import pl.AVESKICODE.developers.whitelist.configuration.Settings;
import pl.AVESKICODE.developers.whitelist.utils.ChatColorUtil;

public class WhiteListCommand extends Command {

    public WhiteListCommand() {
        super("whitelist", Settings.CONFIGURATION$WHITELIST$PERMISSIONS, Settings.CONFIGURATION$WHITELIST$USAGE_COMMAND, "bialalista");
    }

    @Override
    public boolean execute(CommandSender sender, String[] args) {
        final Player player = (Player) sender;
        if (args[0].equalsIgnoreCase("on")) {
            if (Settings.CONFIGURATION$WHITELIST$STATUS) {
                return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$STATUS_ISON);
            }
            Settings.CONFIGURATION$WHITELIST$STATUS = true;
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$STATUS_ON);
        }
        if (args[0].equalsIgnoreCase("off")) {
            if (Settings.CONFIGURATION$WHITELIST$STATUS) {
                return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$STATUS_ISOFF);
            }
            Settings.CONFIGURATION$WHITELIST$STATUS = false;
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$STATUS_OFF);
        }
        if (args[0].equalsIgnoreCase("add")) {
            if (Settings.CONFIGURATION$WHITELIST$LIST_USERS.contains(args[1])) {
                return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$ADD);
            }
            Settings.CONFIGURATION$WHITELIST$LIST_USERS.add(args[1]);
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$ADD_TOWHITELIST.replace("{PLAYER}", args[1]));
        }
        if (args[0].equalsIgnoreCase("remove")) {
            if (!Settings.CONFIGURATION$WHITELIST$LIST_USERS.contains(args[1])) {
                return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$REMOVE);
            }
            Settings.CONFIGURATION$WHITELIST$LIST_USERS.remove(args[1]);
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$REMOVE_TOWHITELIST.replace("{PLAYER}", args[1]));
        }
        if (args[0].equalsIgnoreCase("list")) {
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$LIST.replace("{PLAYERS-WHITELIST}", Settings.CONFIGURATION$WHITELIST$LIST_USERS + ""));
        }
        if (args[0].equalsIgnoreCase("reload")) {
            Main.getInst().saveConfiguration();
            Main.getInst().reloadConfig();
            return ChatColorUtil.sendMessage(player, Settings.CONFIGURATION$WHITELIST$RELOAD);
        }
        return false;
    }
}