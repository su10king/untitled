package Chapter6.StrategyPattern;

public class StrategySword implements Strategy {
    @Override
    public void runStrategy() {
        System.out.println("죽검은 공격력이 40,100이다");
    }
}

//ex6-34