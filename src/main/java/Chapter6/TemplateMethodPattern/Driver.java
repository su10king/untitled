package Chapter6.TemplateMethodPattern;

public class Driver {
    public static void main (String[] args) {
        Animal bolt = new Dog();
        Animal Kitty = new Cat();

        System.out.println();
        System.out.println();

        bolt.playWithOwner();
        Kitty.playWithOwner();
    }
}
