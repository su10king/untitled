package Chapter5;

public class Dog {
    final static Boolean male = true;
    final static Boolean female = false;
    Boolean Sex;

    void Pee () {
        if(this.Sex == male ) {
            System.out.println("한쪽 다리 들고 쉬본다");
        }else {
            System.out.println("두다리로 쉬본다");
        }
    }
}

//ex 5-2 메서드 단일원칙을 지키지 않은 예제