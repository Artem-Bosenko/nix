package main.java;

public class TimeTable {

    private static int startLesson = 9 * 60, smallRest = 5, bigRest = 15, lesson = 45;

    public static void timeEndLesson(int inputLesson) {

        int findTime = startLesson + inputLesson * lesson;

        findTime += (inputLesson) / 2 * smallRest;
        findTime += (inputLesson - 1) / 2 * bigRest;

        System.out.println(findTime / 60 + " " + findTime % 60);
    }
}
