package Chapter6.TemplateMethodPattern;

public class Dog extends Animal {

    @Override
    void play() {
        System.out.println("뭉뭉");
    }

    @Override
    void runSomething() {
        System.out.println("멍멍꼬리 살랑살랑");
    }
    public void playWithOwner () {
        System.out.println("1");
        System.out.println("1");System.out.println("왈왈");
        System.out.println("멍멍");
        System.out.println("1");
        System.out.println("개개");



    }
}

//ex6-19
//ex 6-22