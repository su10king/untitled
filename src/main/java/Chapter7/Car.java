package Chapter7;

public class Car {
    Tire tire;

    public Car (Tire tire) {
        this.tire = tire;
    }
    
    //public Car () {
    // tire = new KoreaTire();
    // tire - new AmericanTire();
    // }

    public String getTireBrand() {
        return "장착된 타이어 : " + tire.getBrand();
    }

    public void setTire(Tire tire1) {
    }
}

//ex7-4
//ex7-10