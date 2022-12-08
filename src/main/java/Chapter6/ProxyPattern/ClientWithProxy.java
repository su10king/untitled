package Chapter6.ProxyPattern;

public class ClientWithProxy {
    public static void main (String[] args) {
        //프록시 사용
        IService proxy = new Proxy();
        System.out.println(proxy.runSomething());
    }
    //프록시 과정에 있는 메서드인 runSomething을 활용하는 패턴이라고 알려주는 것 같음. 기본제공이 아닌 메서드 활용방식이라는 이야기
}
