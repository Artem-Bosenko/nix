package car;

import car.mechanics.Mechanic;
import org.apache.commons.lang3.*;

public class Car {
    public void start(){
        Mechanic mechanic = new Mechanic();
        mechanic.run();
        System.out.println(StringUtils.upperCase("And It's a Car class"));
    }
}

