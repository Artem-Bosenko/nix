package ua.com.module.console.levelsapplication;

import ua.com.module.stringproject.ValidString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LevelTwo {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void start() throws IOException {

        System.out.print("Please, input your string: ");
        String str = reader.readLine();

        boolean result = ValidString.isValidString(str);
        System.out.println("The result of valid your string is " + result);

        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
}
