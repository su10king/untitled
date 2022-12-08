package Chapter6.DecorationPattern;

import Chapter6.ProxyPattern.IService;

public class ClientWithDecorator {
    public static void main (String[] args) {
        IService decorator = new Decorator();
        System.out.println(decorator.runSomething());
    }
}

