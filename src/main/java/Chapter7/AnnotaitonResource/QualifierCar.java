package Chapter7.AnnotaitonResource;

import Chapter7.Tire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class QualifierCar {
    @Autowired
    @Qualifier("tire1")
    Tire tire;

    public String getTireBrand() {
        return "장착된 타이어: " +
                tire.getBrand();
    }
}

//ex 7-35