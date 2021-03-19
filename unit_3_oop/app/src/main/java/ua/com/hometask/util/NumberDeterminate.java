package main.java.ua.com.hometask.util;

public class NumberDeterminate {
    public static Number numberType(String inputValue){

        if (ValueIsDouble.isDouble(inputValue)){
            return ConverterStringToBigDecimal.convert(inputValue);
        }
        else if(ValueIsInteger.isInteger(inputValue)){
            return ConverterStringToBigInteger.convert(inputValue);
        }
        else throw new RuntimeException("Not number value");
    }
}
