package main.java;

/*В некоторой школе занятия начинаются в 9:00. Продолжительность урока — 45 минут,
после 1-го, 3-го, 5-го и т.д. уроков перемена 5 минут, а после 2-го, 4-го, 6-го и т.д. — 15 минут.
Определите, когда заканчивается указанный урок.

Входные данные: Дан номер урока (число от 1 до 10).
Выходные данные: Выведите два целых числа: время окончания урока в часах и минутах.

При решении этой задачи нельзя пользоваться циклами и условными инструкциями.

Примеры:

Входные данные: 3
Выходные данные:11 35
*/

public class TimeTable {

    private static int startLesson = 9 * 60, smallRest = 5, bigRest = 15, lesson = 45;

    public static void timeEndLesson(int inputLesson) {

        int findTime = startLesson + inputLesson * lesson;

        findTime += (inputLesson) / 2 * smallRest;
        findTime += (inputLesson - 1) / 2 * bigRest;

        System.out.println(findTime / 60 + " " + findTime % 60);
    }
}
