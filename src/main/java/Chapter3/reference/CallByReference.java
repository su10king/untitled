package Chapter3.reference;


public class CallByReference {
    public static void main(String[] args) {
        Animal1 ref_a = new Animal1();
        Animal1 ref_b = ref_a;

        ref_a.age = 10;
        ref_b.age = 20;

        System.out.println(ref_a.age);
        System.out.println(ref_b.age);

    }
}

class Animal1 {
    public int age;
}

//ex3-35