package Chapter3.abstartaction01;

import static java.lang.System.out;

public class 참새 extends 조류 {
    참새 () {
        myClass = "참새";
    }

    @Override
    public void fly() {
        out.println(myClass + "날고있삼");
    }
}
