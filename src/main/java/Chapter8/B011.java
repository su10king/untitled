package Chapter8;

import java.util.Arrays;

public class B011 {
    public static void main (String[] args) {
        Integer[] ages = { 20, 25, 18, 27, 30, 21, 17, 19, 34, 28 };

        for (int i = 0; i< ages.length; i++) {
            if (ages[i] < 20) {
                System.out.format("Age %d!!! Can't eneter\n", ages[i]);
            }
        }
        for (int age : ages) {
            if (age<20) {
                System.out.format("Age %d!!! Can't eneter\n", age);
            }
        }

        Arrays.stream(ages)
                .filter(age -> age<20)
                .sorted()  //예제에는 여러 stream 메서드 활용법이 있었지만, sort를 사용
                .forEach(age -> System.out.format("Age %d!!! Can't eneter\n", age));

    }
}
