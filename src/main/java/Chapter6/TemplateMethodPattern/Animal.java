package Chapter6.TemplateMethodPattern;

public abstract class Animal {
    //template method

    public void playWithOwner () {
        System.out.println("귀염둥이 이리온");
        play();
        runSomething();
        System.out.println("잘했어");
    }

//추상 메서드
    abstract void play();

    //hook 메서드
    void runSomething() {
        System.out.println("꼬리꼬리 쌀랑쌀랑");
    }
}


