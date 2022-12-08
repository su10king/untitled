package Chapter7;
import static org.junit.Assert.*;
import org.junit.Test;

public class CarTest {
    @Test
    public void Car_Tire_BrandTest () {
        Tire tire1 = new KoreaTire();
        Car car1 = new Car(tire1);

        assertEquals("장착된 타이어 : 코리아 타이어", car1.getTireBrand());
    }

    @Test
    public void Car_Tire_BrandTest1 () {
        Tire tire2 = new AmericanTire();
        Car car2 = new Car(tire2);

        assertEquals("장착된 타이어 : 아메리카 타이어", car2.getTireBrand());
    }
}
