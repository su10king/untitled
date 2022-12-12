package Chapter3.abstartaction01;

public class MouseDriver {
    public static void main(String [] args) {
        Mouse mickey = new Mouse ();
                        mickey.name = "미키";
                        mickey.age = 85;
                        mickey.CountofTail = 1;

                        mickey.sing();

                        mickey = null;

                        Mouse Jerry = new Mouse();
                        Jerry.name = "제리";
                        Jerry.age = 73;
                        Jerry.CountofTail = 1;

                        Jerry.sing();

                        //ex3-3
    }
}
