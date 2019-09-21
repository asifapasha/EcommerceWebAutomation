package com.automation.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties")));
            prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\src\\test\\resources\\messages.properties")));
            System.out.println(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
}
