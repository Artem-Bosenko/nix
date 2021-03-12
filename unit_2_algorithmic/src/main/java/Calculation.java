package main.java;

/*1. реализуйте задачу, которая в случайной строке вычленяет все числа и находит их сумму

Пример:

Входные данные: 1w4tt!7
Выходные данные: 12
*/

public class Calculation {
    String[] strings;

    public int sumOfNumbersInLine(String str) {

        int summary = 0;

        strings = str.split("[a-zA-Z!&*%]");

        for (String s : strings) {

            if (s.matches("[-+]?\\d+")) {

                summary += Integer.parseInt(s);
            }

        }
        return summary;
    }
}
