package Chapter8;

public class B003 {
    public static void main(String[] args) {
        Runnable r = ()-> {
            System.out.println("Lamda333333333333333");
        };

        r.run();
    }
}
