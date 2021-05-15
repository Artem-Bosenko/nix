package ua.com.module;

public final class Controller {
    public static CustomDate newDate(String input, TypeInputString type){
        String[] massive;

        switch (type){
            case DAY_MONTH_YEAR:{
                massive = input.split("/");
                return new CustomDate(Integer.parseInt(massive[0]), Integer.parseInt(massive[1]), Integer.parseInt(massive[2]));
            }
            case MONTH_DAY_YEAR: {
                massive = input.split("-");
                return new CustomDate(Integer.parseInt(massive[1]), Integer.parseInt(massive[0]), Integer.parseInt(massive[2]));
            }
            case YEAR_MONTH_DAY:{
                massive = input.split("/");
                return new CustomDate(Integer.parseInt(massive[2]), Integer.parseInt(massive[1]), Integer.parseInt(massive[0]));
            }
            default: throw new RuntimeException("Invalid input date format");
        }
    }
}
