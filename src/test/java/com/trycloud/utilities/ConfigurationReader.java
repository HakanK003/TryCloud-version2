package com.trycloud.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties = new Properties();


    static {


        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("SMTH happened");
            e.printStackTrace();
        }


    }


    public static String getProperty(String key) {
return properties.getProperty(key);
    }


}
