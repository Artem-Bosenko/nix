package main.java.ua.com.hometask.console_impl;

import main.java.ua.com.hometask.ConsoleHelper;
import main.java.ua.com.hometask.factory.ConsoleFactory;

public class ConsoleObj {

    private final ConsoleHelper consoleHelper = ConsoleFactory.getInstance().getConsoleHelper();

}
