package main.java.ua.com.hometask.util;

public class ValueIsDouble {

    public static boolean isDouble(String str) {

        if (str.matches("[+-]?([0-9]*[.])?[0-9]+")) return true;

        return false;
    }
}
