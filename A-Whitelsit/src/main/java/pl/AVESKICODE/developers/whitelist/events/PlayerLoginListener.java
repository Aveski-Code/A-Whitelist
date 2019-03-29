package pl.AVESKICODE.developers.whitelist.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import pl.AVESKICODE.developers.whitelist.configuration.Settings;
import pl.AVESKICODE.developers.whitelist.utils.ChatColorUtil;

public class PlayerLoginListener implements Listener {

    @EventHandler
    public void onLogin(PlayerLoginEvent event) {
        final Player player = event.getPlayer();
        if (Settings.CONFIGURATION$WHITELIST$STATUS && !Settings.CONFIGURATION$WHITELIST$LIST_USERS.contains(player.getDisplayName())) {
            event.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColorUtil.colored(Settings.CONFIGURATION$WHITELIST$MESSAGES).replace("[N]", "\n"));
        }
    }
}


