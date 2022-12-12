package Chapter6.StrategyPattern;

public class StrategyBow implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("슝슝슝 활 지나간다");
    }
}

//ex6-35