package Chapter8;

import java.util.function.*;

public class B010 {

    public static void main(String [] args) {
        Runnable run = () -> System.out.println("hello");
        Supplier<Integer> sup = () -> 3*3;
        Consumer<Integer> con = num -> System.out.println("num");
        Function<Integer, String> fun = num -> "input: " + num;
        Predicate<Integer> pre = num -> num > 18;
        UnaryOperator<Integer> uOp = num -> num*num;

        BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str + num);
        BiFunction<Integer, Integer, String> bFun =
                (num1, num2) -> "add result: " + (num1+num2);
        BiPredicate<Integer, Integer> bPre = (num1, num2) -> num1 > num2;
        BinaryOperator<Integer> bOp = (num1, num2) -> num1 - num2;

        //Runnable - void 메서드 사용
        //SUppiler - get 메서드 사용
        //Consumer - void acceopt, 소비인터페이스?
        //Function - R apply T(t) , 입출력 동시에하는 인터페이스
        //Predicate - 참 거짓 boolean 메서드
        //UnaryOperation - 써본적 없는 메서드...단항 메서드?
    }
}
