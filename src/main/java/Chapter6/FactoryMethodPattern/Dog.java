package Chapter6.FactoryMethodPattern;

public class Dog extends Animal {

    @Override
    AnimalToy getToy () {
        return new DogToy();
    }
}
//ex 6-27
