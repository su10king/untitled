package Chapter7;

public class Driver {
    public static void main (String[] args) {
        Tire tire1 = new KoreaTire();
        Tire tire2 = new AmericanTire();

        Car car = new Car(tire2);
        System.out.println(car.getTireBrand());
    }
}
