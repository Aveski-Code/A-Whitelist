package pl.AVESKICODE.developers.whitelist.configuration.managers;

import pl.AVESKICODE.developers.whitelist.configuration.impl.ConfigurationImpl;
import java.io.File;

public class ConfigurationManager {

    public static ConfigurationImpl create(File file, Class clazz) {
        return new ConfigurationImpl(file, clazz);
    }
}
