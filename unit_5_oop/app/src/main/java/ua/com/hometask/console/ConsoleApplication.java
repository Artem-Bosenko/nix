package ua.com.hometask.console;

import ua.com.hometask.choosecrud.AuthorConsole;
import ua.com.hometask.choosecrud.BookConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleApplication {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean flag = false;

    public static void start() {

        String answer;

        try {
            System.out.println("Please, press Enter!");

            while ((answer = reader.readLine()) != null) {

                startWindow();
                answer = reader.readLine();
                switch (answer) {
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
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void startWindow() throws IOException {

        String answer;
        if (!flag) {
            flag = true;
            System.out.println("Choose operation:\n1. Create book with authors\n2. Create Author with books");

            do {
                System.out.print("Your answer-> ");
                answer = reader.readLine();
            } while (Integer.parseInt(answer) < 1 && Integer.parseInt(answer) > 2);

        } else {
            System.out.println("Choose operation:\n1. Create book with authors\n2. Create Author with books\n3. Update book\n4. Update author\n5. Read info about book\n6. Read info about author\n7. Delete book\n8. Delete author");

            do {
                System.out.print("Your answer-> ");
                answer = reader.readLine();
            } while (Integer.parseInt(answer) < 1 && Integer.parseInt(answer) > 8);
        }

        chooseCRUD(answer);

    }

    private static void chooseCRUD(String s) throws IOException {

        switch (s) {

            case "1": {
                BookConsole.create();
                break;
            }

            case "2": {
                AuthorConsole.create();
                break;
            }
            case "3": {
                BookConsole.update();
                break;
            }

            case "4": {
                AuthorConsole.update();
                break;

            }
            case "5": {
                BookConsole.read();
                break;
            }

            case "6": {
                AuthorConsole.read();
                break;
            }
            case "7": {
                BookConsole.delete();
                break;
            }

            case "8": {
                AuthorConsole.delete();
                break;
            }
        }
    }
}
