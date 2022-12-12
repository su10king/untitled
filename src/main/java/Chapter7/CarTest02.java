package Chapter7;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("pom.xml")
public class CarTest02 {

    @Autowired
    Car car;

    @Test
    public void Car_Tire_BrandTest() {
        assertEquals("장착된 타이어 : 코리아 타이어", car.getTireBrand());
    }
}

//ex7-21