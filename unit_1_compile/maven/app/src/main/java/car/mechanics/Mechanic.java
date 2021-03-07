package main.java.car.mechanics;

import org.apache.commons.text.TextStringBuilder;


public class Mechanic {
    public void run(){
        int i = 10;
        TextStringBuilder textStringBuilder = new TextStringBuilder("It's a Mechnics class");
        System.out.println(textStringBuilder);

        TextStringBuilder[] textStringBuilders = new TextStringBuilder[textStringBuilder.capacity()];
        textStringBuilder.appendSeparator("&&&&");
        System.out.println(textStringBuilder);
    }
}