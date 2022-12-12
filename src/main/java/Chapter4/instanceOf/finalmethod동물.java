package Chapter4.instanceOf;

public class finalmethod동물 {
    final void 숨쉬다 () {
        System.out.println("호흡하다");
    }
}

class 포유류 extends finalmethod동물 {
//    void 숨쉬다() {
//        System.out.println("호흡하다 메서드를 오버라이딩");
//    }

    //final이라 못 읽음
    //ex4-24
}
