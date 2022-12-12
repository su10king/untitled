package Chapter7;

import org.springframework.beans.factory.annotation.Autowired;

public class Car02 {
    @Autowired
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어: " + tire.getBrand();
    }
}

//ex 7-23
//ex 7-27
