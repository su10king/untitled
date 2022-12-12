package Chapter6.FactoryMethodPattern;

public class Driver {
    public static void main(String[] args) {
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        AnimalToy boltBall = new DogToy();
        AnimalToy KittyTower = new CatToy();

        boltBall.identify();
       KittyTower.identify();
    }
}

//ex 6-31