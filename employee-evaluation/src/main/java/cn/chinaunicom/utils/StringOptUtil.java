package cn.chinaunicom.utils;

public class StringOptUtil {

    public static String getType(Object test) {
        return test.getClass().getName().toString();
    }
}
