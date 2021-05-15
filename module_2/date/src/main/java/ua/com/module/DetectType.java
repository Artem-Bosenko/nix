package ua.com.module;

public final class DetectType {

    public static TypeInputString getType(String str){
        switch (str){
            case "day": return TypeInputString.DAY_MONTH_YEAR;
            case "month": return TypeInputString.MONTH_DAY_YEAR;
            case "year": return TypeInputString.YEAR_MONTH_DAY;
            default: throw new RuntimeException("Invalid type of date");
        }
    }
}
