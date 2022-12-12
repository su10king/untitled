package Chapter5;

abstract class AbstractDog {
    abstract void Pee();
}

class MaleDog extends Dog {
    @Override
    void Pee() {
        super.Pee();
    }
}

class FeMaleDog extends Dog {
    @Override
    void Pee() {
        super.Pee();
    }
}

//ex 5-3 단일 원칙 적용한 메서드