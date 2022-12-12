package Chapter6.StrategyPattern;

public class Client {
    public static void main (String[] args) {
        Strategy strategy = null;
        Solider rambo = new Solider();

        System.out.println();

        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
//ex6-37
