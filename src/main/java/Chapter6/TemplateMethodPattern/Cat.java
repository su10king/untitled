package Chapter6.TemplateMethodPattern;

public class Cat extends Animal {

    @Override
    void play() {
        System.out.println("냥냥");
    }

    @Override
    void runSomething() {
        System.out.println("냥냥펀치 꼬리 살랑살랑");
    }
    public void playWithOwner () {
        System.out.println("1");
        System.out.println("야옹");System.out.println("1");
        System.out.println("1");
        System.out.println("냥냥");
        System.out.println("1");



    }
}
//ex6-20
//ex6-23
