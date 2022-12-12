package Chapter7.AnnotaitonResource;

import Chapter7.KoreaTire;
import Chapter7.Tire;

public class Driver {
    public static void main (String[] args) {
        Tire tire = new KoreaTire();
        Car car = new Car();
        car.setTire(tire);

        System.out.println(car.getTireBrand());
    }

}

//ex7-14
