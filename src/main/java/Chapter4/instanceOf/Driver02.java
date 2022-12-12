package Chapter4.instanceOf;

public class Driver02 {
    public static void main(String[] args) {
        동물 동물객체 = new 동물();
        동물 조류객체 = new 조류();
        동물 펭귄객체 = new 펭귄1();

        System.out.println(동물객체 instanceof 동물);

        System.out.println(조류객체 instanceof 동물);
        System.out.println(조류객체 instanceof 조류);

        System.out.println(펭귄객체 instanceof 동물);
        System.out.println(펭귄객체 instanceof 조류);
        System.out.println(펭귄객체 instanceof 펭귄1);

        System.out.println(펭귄객체 instanceof Object);

        //ex 4-26
        //ex 4-25와 인스턴스 출력값 비교
    }
}
