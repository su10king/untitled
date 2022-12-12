package Chapter3.encapsulation01;

public class ClassA {

    private int pri;
    int def;
    protected int pro;
    public int pub;

    void runSomething() {
        System.out.println(pri = '1');
        System.out.println(def = '1');
        System.out.println(pro = '1');
        System.out.println(pub = '1');
    }
//    static void runStaticThing () {
//        System.out.println(pri = '1');
//        System.out.println(def = '1');
//        System.out.println(pro = '1');
//        System.out.println(pub = '1');
//}
    // 패키지별로 분류됐을 때 서브클래스 참조할 수 있는 권한 및 분류를 확인할 수 있다.
    //ex 3-33
}
