package Chapter4.instanceOf;

public class Driver {
    public static void main(String[] args) {
        동물 동물객체 = new 동물();
        조류 조류객체 = new 조류();
        펭귄1 펭귄객체 = new 펭귄1();

        System.out.println(동물객체 instanceof 동물);

        System.out.println(조류객체 instanceof 동물);
        System.out.println(조류객체 instanceof 조류);

        System.out.println(펭귄객체 instanceof 동물);
        System.out.println(펭귄객체 instanceof 조류);
        System.out.println(펭귄객체 instanceof 펭귄1);

        System.out.println(펭귄객체 instanceof Object);

        //ex 4-25
    }
}
