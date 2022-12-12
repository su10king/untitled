package Chapter3.inheritance03;

public class Driver {
    public static void main(String [] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showHabitat();
        pororo.showName();

        Animal pingu = new Penguin();

        pingu.name = "핑구";
        pingu.showName();

        //Penguin happyfeet = new Animal();


        //ex3-28
    }
}
