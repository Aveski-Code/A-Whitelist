package pl.AVESKICODE.developers.whitelist.configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Settings {

    public static String CONFIGURATION$PLUGIN_IS_ENABLE = "Wlaczono Poprawnie!";
    public static String CONFIGURATION$PLUGIN_IS_DISABLE = "Wylaczono Poprawnie!";
    public static boolean CONFIGURATION$WHITELIST$STATUS = true;
    public static String CONFIGURATION$WHITELIST$PERMISSIONS = "wh.perm";
    public static String CONFIGURATION$WHITELIST$PERMISSIONS_MESSAGE = "&4Blad: &8>> &cNie posiadasz permisji!";
    public static String CONFIGURATION$WHITELIST$USAGE_COMMAND = "/whitelist <on/off/add/remove/list/reload>";
    public static String CONFIGURATION$WHITELIST$USAGE = "&8>> &7Uzycie: &6{USAGE}";
    public static String CONFIGURATION$WHITELIST$STATUS_ISON = "&4Blad: &8>> &cWhitelist jest juz wlaczona!";
    public static String CONFIGURATION$WHITELIST$STATUS_ON = "&8>> &7Whitelist zostala: &aWlaczona!";
    public static String CONFIGURATION$WHITELIST$STATUS_ISOFF = "&4Blad: &8>> &cWhitelist jest juz wylaczona!";
    public static String CONFIGURATION$WHITELIST$STATUS_OFF = "&8>> &7Whitelist zostala: &cWylaczona!";
    public static String CONFIGURATION$WHITELIST$ADD = "&4Blad: &8>> &cPodany gracz jest juz na whitelist!";
    public static String CONFIGURATION$WHITELIST$ADD_TOWHITELIST = "&8>> &7Dodano gracza: &6{PLAYER} do whitelist!";
    public static String CONFIGURATION$WHITELIST$REMOVE = "&4Blad: &8>> &cPodany gracz jest juz usuniety z whitelist!";
    public static String CONFIGURATION$WHITELIST$REMOVE_TOWHITELIST = "&8>> &7Usunieto gracza: &6{PLAYER} do whitelist!";
    public static String CONFIGURATION$WHITELIST$LIST = "&8>> &7Lista osob dodana na whitelist: &6{PLAYERS-WHITELIST}";
    public static String CONFIGURATION$WHITELIST$RELOAD = "&8>> &cPrzeladowano konfiguracje config.yml!";
    public static String CONFIGURATION$WHITELIST$MESSAGES = "[N][N]&8>> &cTrawaja prace techniczne nad serwerem! &8<<[N]&8>> &aPozdrawiamy Administracja: --- &8<<[N][N]";
    public static List<String> CONFIGURATION$WHITELIST$LIST_USERS = new ArrayList<>(Collections.singletonList("Aveski"));
}
