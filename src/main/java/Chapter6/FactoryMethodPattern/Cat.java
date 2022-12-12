package Chapter6.FactoryMethodPattern;

public class Cat extends Animal{
    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}

//ex 6-29
