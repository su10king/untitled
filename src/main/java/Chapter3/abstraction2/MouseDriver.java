package Chapter3.abstraction2;


public class MouseDriver {
    public static void main(String [] args) {
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightMouse = new Mouse();

        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightMouse.countOfTail);

        System.out.println(Mouse.countOfTail);

                        //ex3-5
    }
}
