package main.java.ua.com.hometask.util;

public class ValueIsInteger {

    public static boolean isInteger(String str){
        if(str.matches("[-+]?\\d+")) return true;

        return false;
    }
}
