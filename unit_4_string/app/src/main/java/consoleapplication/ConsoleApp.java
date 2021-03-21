package consoleapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApp {
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

        System.out.println("Please, input your string and choose type of reverse!");
        System.out.print("Write your line -> ");

        str = reader.readLine();

        System.out.println("Choose type of reverse from the list below:");
        System.out.println("1. Classic reverse\n2. Reverse with destination word\n3. Reverse between two index");
        String choose;
        do {
            System.out.print("Your choose -> ");
            choose = reader.readLine();
        } while (Integer.parseInt(choose) > 3 || Integer.parseInt(choose) < 1);
        chooseOperation(choose);

    }

    private static void chooseOperation(String s) {

        switch (s) {
            case "1":
                DeterminateReverse.classicReverse(str);
                break;
            case "2":
                DeterminateReverse.reverseWithDestination(str);
                break;
            case "3":
                DeterminateReverse.reverseBetweenIndex(str);
                break;
        }
    }
}
