package Chapter4.instanceOf;

public class 동물 {
    void method() {
        System.out.println("동물");
    }
}

class 조류 extends 동물 {
    @Override
    void method() {
        super.method();
    }
}

class 펭귄1 extends 조류 {
    @Override
    void method() {
        super.method();
    }

    public void test() {
    }
}

//ex4-34