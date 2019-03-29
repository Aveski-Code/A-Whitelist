package pl.AVESKICODE.developers.whitelist.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import java.util.List;
import java.util.stream.Collectors;

public class ChatColorUtil {

    public static String colored(String message) {
        return ChatColor.translateAlternateColorCodes('&', message.replace(">>", "»").replace("<<", "«"));
    }

    public static boolean sendMessage(Player player, String message) {
        player.sendMessage(colored(message));
        return true;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // 3.0 Dodam wiado wh w listach czyli - "" - "ddd", wiadomosc wchodzenia na serwer do adminow 

    public static void sendAdmin(Player player, String message) {
        Bukkit.getOnlinePlayers().forEach(admins -> ChatColorUtil.sendMessage(admins, message));
    }

    public static List<String> colored(List<String> messages) {
        return messages
                .stream()
                .map(ChatColorUtil::colored)
                .collect(Collectors.toList());
    }
}
