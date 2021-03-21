package consoleapplication;

import utils.ReversesMethods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeterminateReverse {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void classicReverse(String str){

        str = ReversesMethods.reverse(str);
        System.out.println("Result -> " + str);

        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }

    public static void reverseWithDestination(String str){
        System.out.print("Input destination word -> ");
        String destWord = null;
        try {
            destWord = reader.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }

        str = ReversesMethods.reverse(str, destWord);
        System.out.println("Result -> " + str);

        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }

    public static void reverseBetweenIndex(String str){

        int first = 0, last = 0;
        System.out.print("Input index of start -> ");
        try {
            first = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print("Input index of end -> ");
        try {
            last = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        str = ReversesMethods.reverse(str, first,last);
        System.out.println("Result -> " + str);

        System.out.println("Your variant: if you want exit, please input 0, else, repeat logic");
    }
}
