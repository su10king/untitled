package Chapter3.polymorphism03;

import Chapter3.inheritance03.Animal;
import Chapter3.inheritance03.Penguin;

public class Driver {
    public static void main(String [] args) {
        Chapter3.inheritance03.Penguin pororo = new Chapter3.inheritance03.Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showHabitat();
        pororo.showName();
        pororo.showName("초보람보");

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        pingu.showName();

        //Penguin happyfeet = new Animal();


        //ex 3-31
    }
}
