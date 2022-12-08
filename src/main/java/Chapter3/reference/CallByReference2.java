package Chapter3.reference;

import Chapter3.inheritance03.Animal;

public class CallByReference2 {
    public static void main (String[] args) {
        Animal ref_a = new Animal();
        Animal ref_b = ref_a;

        System.out.println(ref_a);
        System.out.println(ref_b);

        //기본 자료형 변수와 참조변수의 기록 위치에 대해서 물어보는 코드, 포인터 활용시 메모리 사용량을 질문하는 문제
    }
}
