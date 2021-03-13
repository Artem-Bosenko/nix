package main.java.tasks;

/*1. реализуйте задачу, которая в случайной строке вычленяет все цифры и находит их сумму

Пример:

Входные данные: 1w4tt!7
Выходные данные: 12
*/

public class Calculation {

    public int sumOfNumbersInLine(String str) {

        int summary = 0;

        char[] chars = str.toCharArray();

        for (char s : chars) {

            if (s >=48 && s<=57) {

                summary += Integer.parseInt(String.valueOf(s));
            }
        }

        return summary;
    }

    public int sumOfFigureInLine(String str){

        String[] strings = str.split("[a-zA-Z!&*%]");
        int summary = 0;

        for (String s : strings) {

            if (s.matches("[-+]?\\d+")) {

                summary += Integer.parseInt(s);
            }
        }
        return summary;
    }
}
