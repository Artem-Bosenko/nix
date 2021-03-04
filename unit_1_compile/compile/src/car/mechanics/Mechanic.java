package car.mechanics;

import org.apache.commons.text.*;

public class Mechanic {
    public void run(){
        System.out.println("It's a Mechnics class" );
        System.out.println(StringEscapeUtils.escapeJava("It's a Mechnics class"));
    }
}
