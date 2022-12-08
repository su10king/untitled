package Chapter8;

import java.util.function.Supplier;

public class B016 {
    public static void main(String[] args) {
        B016 b016 = new B016();

        //Error
        //The targe type of this expression must be a functional interface
        //B016 bo16_2 = bo16::new;

        Supplier<B016> factory =B016::new;

        B016 b016_3 = factory.get();
        B016 b016_4 = factory.get();

        System.out.println(b016.hashCode());
        System.out.println(b016_3.hashCode());
        System.out.println(b016_4.hashCode());

        //메서드를 통해서 참조형 인스턴스를 만든 것은 해쉬코드위치가 다름
        //해쉬코드 위치 그냥 뭐... 물리주소, 개별값 생성 ㅇ, 원본 복사 X
    }
}
