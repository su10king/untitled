package Chapter6.ProxyPattern;

public class Proxy implements IService {
    IService service1;

    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어, 반환결과를 그대로 전달");

    service1 = new Service();
    return service1.runSomething();
    }
}

//ex 6-11