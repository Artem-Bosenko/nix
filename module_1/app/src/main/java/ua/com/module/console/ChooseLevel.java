package ua.com.module.console;

import ua.com.module.console.leveloneconsole.FirstLevelApplication;
import ua.com.module.console.levelsapplication.LevelThree;
import ua.com.module.console.levelsapplication.LevelTwo;

import java.io.IOException;


public class ChooseLevel {
    public static void firstLevel(){
        FirstLevelApplication.run();
    }
    public static void secondLevel() {
        try {
            LevelTwo.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void thirdLevel(){
        LevelThree.start();
    }
}
