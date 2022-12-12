package Chapter7.AnnotaitonResource;

import Chapter7.Tire;

import javax.annotation.Resource;

public class Car {

    @Resource
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire (Tire tire) {
        this.tire = tire;
    }

    public String getTireBrand() {
        return "장착된 타이어: " +
                tire.getBrand();
    }
}

//ex7-13
//ex7-24
//ex7-26