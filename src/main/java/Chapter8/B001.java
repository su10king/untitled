package Chapter8;

public class B001 {
    public static void main (String[] args) {
        MyTest mt = new MyTest();

        Runnable r =mt;

        r.run();
    }
}

class MyTest implements Runnable {
    public void run() {
        System.out.println("시작입니다. 람다 Lamdadadada");
    }
}
