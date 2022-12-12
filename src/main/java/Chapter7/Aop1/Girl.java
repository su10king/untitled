package Chapter7.Aop1;

public class Girl {
    public void runSomething() {
        System.out.println("열쇠ㅏ로 문을 열고 집에 드렁간다");

        try {
            System.out.println("요리를 한다111111111111");
        }catch (Exception exception) {
            if (exception.getMessage().equals("집에 불남")) {
                System.out.println("119에 신고한다.");
            }
        }finally {
            System.out.println("소등하고 잔다.");
        }

        System.out.println("자물쇠를 잠그고 집을 나선다.");
    }

}

//ex 7-39