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