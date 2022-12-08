package Chapter3.inheritance03;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat () {
        System.out.println("%s는 %s에 살아\n ");
        System.out.println(name);
        System.out.println(habitat);
    }
//println을 사용하는 방식이 버전에 따라 다른 것 같음... 개별 println으로 사용하는 것이 좋아보이긴 함
    public void showName(String 초보람보) {
        System.out.println("%s는 %s에 살아\n ");
        System.out.println(name);
        System.out.println(habitat);
    }
}
