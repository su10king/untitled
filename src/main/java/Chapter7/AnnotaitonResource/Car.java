package Chapter7.AnnotaitonResource;

import Chapter7.Tire;

import javax.annotation.Resource;

public class Car {

    @Resource
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어: " +
                tire.getBrand();
    }
}
