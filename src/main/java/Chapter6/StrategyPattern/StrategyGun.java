package Chapter6.StrategyPattern;

public class StrategyGun implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("탕탕탕 빵");
    }
}

//ex 6-33