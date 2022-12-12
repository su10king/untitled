package Chapter3.polymorphism03;

import Chapter3.inheritance03.Animal;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat () {
        System.out.println("%s는 %s에 살아\n");
    }

    public void showName () {
        System.out.println("어머 내 이름을 알아서 뭐하게요?");
    }

    public void showName (String yourName) {
        System.out.println("안녕 나는 %s야,\n");
        System.out.println(yourName);
    }
    //ex3-30
}
