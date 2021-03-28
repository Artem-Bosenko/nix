package ua.com.hometask;

import org.apache.log4j.Logger;
import ua.com.hometask.console.ConsoleApplication;

public class Main {

    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Start project");
        ConsoleApplication.start();
        log.info("Project ends successfully");
    }
}
