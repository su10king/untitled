package Chapter8;

import java.util.Arrays;
import java.util.function.BiFunction;

public class B015 {
    public static void main(String[] args) {
        Double[] nums ={1.0, 4.0, 9.0, 16.0, 25.0};

        System.out.println("========lamda=======");
        Arrays.stream(nums)
                .map(num -> Math.sqrt(num))
                .forEach(sqrtNum -> System.out.println(sqrtNum));

        System.out.println("----------- Method Reference");
        Arrays.stream(nums)
                .map(Math::sqrt)
                .forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> bip_lamda = (a, b)-> a.compareTo(b);
        BiFunction<Integer, Integer, Integer> bip_method_reference = Integer::compareTo;

        System.out.println(bip_lamda.apply(10, 12));
        System.out.println(bip_lamda.apply(10, 10));
        System.out.println(bip_lamda.apply(10, 2));
        System.out.println(bip_method_reference.apply(10, 12));
        System.out.println(bip_method_reference.apply(10, 10));
        System.out.println(bip_method_reference.apply(10, 2));

        //collection stream 메서드 사용
        //메서드의 인스턴스 저장위치, 수명주기같은 것을 확인, BO16에서는 생성자 레퍼런스임
    }
}
