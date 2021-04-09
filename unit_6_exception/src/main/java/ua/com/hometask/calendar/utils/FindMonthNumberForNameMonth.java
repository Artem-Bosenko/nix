package ua.com.hometask.calendar.utils;

public class FindMonthNumberForNameMonth {
    public static int numberMonth(String nameMonth){

        switch (nameMonth){
            case "Январь": return 1;
            case "Февраль": return 2;
            case "Март": return 3;
            case "Апрель": return 4;
            case "Май": return 5;
            case "Июнь": return 6;
            case "Июль": return 7;
            case "Август": return 8;
            case "Сентябрь": return 9;
            case "Октябрь": return 10;
            case "Ноябрь": return 11;
            case "Декабрь": return 12;
            default: throw new RuntimeException("Invalid name of month");
        }
    }
}
