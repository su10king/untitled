package Chapter6.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        //private 생성자는 new insatnce를 생성할 수 없다. 나는 이런걸 왜 실제 코드도 없는 예제에서 설명해주는지 이해가 안됨
        //method를 사용하고 싶지 않은 예제에서 알려주면 되잖아?

        //singleton s = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        //s1 == null;
        s1 = null;
        s2 = null;
        s3 = null;
    }
}

//ex 6-18