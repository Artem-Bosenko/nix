package ua.com.hometask.calendar.utils;

import ua.com.hometask.calendar.date.DateStorage;

public class DateSequenceUtil {

    public static void execute(int numberFormat, String[] mas, DateStorage dateStorage){

        switch (numberFormat){
            case 1: {
                if (!mas[0].equals("")) {
                dateStorage.setDay(Integer.parseInt(mas[0]));
                } else dateStorage.setDay(1);
                if (!mas[1].equals("")) {
                    dateStorage.setMonth(Integer.parseInt(mas[1]));
                } else dateStorage.setMonth(1);
                help(mas, dateStorage);
            };break;
            case 2: {
                if (!mas[0].equals("")) {
                    dateStorage.setMonth(Integer.parseInt(mas[0]));
                } else dateStorage.setMonth(1);
                if (!mas[1].equals("")) {
                    dateStorage.setDay(Integer.parseInt(mas[1]));
                } else dateStorage.setDay(1);
                help(mas, dateStorage);
            };break;
            case 3: {
                if (!mas[0].equals("")) {

                    if (mas[0].contains("[0-9]"))dateStorage.setMonth(Integer.parseInt(mas[0]));
                    else {
                        int i = FindMonthNumberForNameMonth.numberMonth(mas[0]);
                        dateStorage.setMonth(i);
                    }

                } else dateStorage.setMonth(1);
                if (!mas[1].equals("")) {
                    dateStorage.setDay(Integer.parseInt(mas[1]));
                } else dateStorage.setDay(1);
                help(mas, dateStorage);
            }; break;
            case 4: {
                if (!mas[0].equals("")) {
                    dateStorage.setDay(Integer.parseInt(mas[0]));
                } else dateStorage.setDay(1);
                if (!mas[1].equals("")) {
                    if (mas[1].contains("[0-9]"))dateStorage.setMonth(Integer.parseInt(mas[1]));
                    else {
                        int i = FindMonthNumberForNameMonth.numberMonth(mas[1]);
                        dateStorage.setMonth(i);
                    }
                } else dateStorage.setMonth(1);
                help(mas, dateStorage);

            }; break;
        }
    }
    private static void help(String[] mas, DateStorage dateStorage){
        if (!mas[2].equals("")) {
            dateStorage.setYear(Integer.parseInt(mas[2]));
        } else dateStorage.setYear(2021);
        if (!mas[3].equals("")) {
            dateStorage.setHours(Integer.parseInt(mas[3]));
        } else dateStorage.setHours(0);
        if (!mas[4].equals("")) {
            dateStorage.setMinutes(Integer.parseInt(mas[4]));
        } else dateStorage.setMinutes(0);
        if (!mas[5].equals("")) {
            dateStorage.setSeconds(Integer.parseInt(mas[5]));
        } else dateStorage.setSeconds(0);
        if (!mas[6].equals("")) {
            dateStorage.setMilliseconds(Integer.parseInt(mas[6]));
        } else dateStorage.setMilliseconds(0);
    }
}
