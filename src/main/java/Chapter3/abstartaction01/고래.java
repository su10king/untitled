package Chapter3.abstartaction01;
import Chapter3.inheritance02.헤엄칠수있는;
public class 고래 extends 포유류 implements 헤엄칠수있는 {

    고래 () {
        myClass = "고래";
    }
    @Override
    public void swim() {
        System.out.println(myClass + " 수영중 ");
    }
    //
}
