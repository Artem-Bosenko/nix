package main.java.ua.com.hometask.impl;

import main.java.ua.com.hometask.ConsoleHelper;

import java.util.Scanner;

public class DefaultConsoleHelper implements ConsoleHelper {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void startWindow() {
        System.out.println("Hello, it's console helper!\n***Input your two numbers through enter:");
    }

    @Override
    public void showOperations() {
        System.out.print("1. summary(+)\n2. subtraction(-)\n3. devision(/)\n4. multiply(*)\n5. Remainder of division( a (mod b))\nYour choose ->");
    }

    @Override
    public String inputInf() {
        return scanner.nextLine().toString();
    }

    @Override
    public void outputInf(String str) {
        System.out.println(str);
    }

    @Override
    public void getAnswer(int tmp) {
        tmp = Integer.parseInt(scanner.next());
    }
}
