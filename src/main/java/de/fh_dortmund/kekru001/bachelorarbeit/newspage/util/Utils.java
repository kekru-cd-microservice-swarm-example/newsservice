package de.fh_dortmund.kekru001.bachelorarbeit.newspage.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by krummenauer on 08.01.2017.
 */
public class Utils {

    public static String getPropertOrSystemEnvOrDefault(String key){
        return getPropertOrSystemEnvOrDefault(key, "");
    }

    public static String getPropertOrSystemEnvOrDefault(String key, String defaultValue){
        String s = System.getProperty(key);
        if(s != null){
            return s;
        }

        s = System.getenv(key);
        if(s != null){
            return s;
        }

        return defaultValue;
    }

    public static String shorten(String s, int maxLength){
        return s == null ? "" : s.substring(0, maxLength);
    }


}
