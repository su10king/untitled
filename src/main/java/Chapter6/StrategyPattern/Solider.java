package Chapter6.StrategyPattern;

public class Solider {
    void runContext(Strategy strategy) {
        System.out.println("battle start");
        strategy.runStrategy();
        System.out.println("battle finished");
    }
}

//ex6-36