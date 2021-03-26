package ua.com.module.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String str;

    public static void run() {
        try {
            System.out.println("Please press enter");

            while ((str = reader.readLine()) != null) {

                startWindow();
                str = reader.readLine();
                switch (str) {
                    case "0": {
                        System.exit(0);
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

        System.out.println("Please, choose level for checking ");
        System.out.println("1. Level 1\n2. Level 2\n3. Level 3\n4. Exit");

        String choose;
        do {
            System.out.print("Your choose -> ");
            choose = reader.readLine();
        } while (Integer.parseInt(choose) > 4 || Integer.parseInt(choose) < 1);
        chooseLevel(choose);

    }

    private static void chooseLevel(String s) {

        switch (s) {
            case "1":
                ChooseLevel.firstLevel();
                break;
            case "2":
                ChooseLevel.secondLevel();
                break;
            case "3":
                ChooseLevel.thirdLevel();
                break;
            case "4":
                System.exit(0);
                break;
        }
    }
}
