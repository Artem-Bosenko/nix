package ua.com.module.console.leveloneconsole;

import ua.com.module.console.ConsoleApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLevelApplication {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String str;

    public static void run() {
        try {
            System.out.println("Please press enter");

            while (true) {
                if (!((str = reader.readLine()) != null)) break;

                startWindow();
                str = reader.readLine();
                switch (str) {
                    case "0": {
                        ConsoleApplication.run();
                        break;
                    }
                    case "1": {
                        startWindow();
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void startWindow() throws IOException {

        System.out.println("Please, choose task for checking ");
        System.out.println("1. Task 1: Number unique elements 1\n2. Task 2: Move of Horse\n3. Task 3: Square of triangle");

        String choose;
        do {
            System.out.print("Your choose -> ");
            choose = reader.readLine();
        } while (Integer.parseInt(choose) > 3 || Integer.parseInt(choose) < 1);
        chooseTask(choose);

    }
    private static void chooseTask(String s) {

        switch (s) {
            case "1":
                ChooseTask.taskOne();
                break;
            case "2":
                try {
                    ChooseTask.taskTwo();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "3":
                try {
                    ChooseTask.taskThree();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}
