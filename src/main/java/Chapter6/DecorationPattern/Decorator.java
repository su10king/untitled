package Chapter6.DecorationPattern;

import Chapter6.ProxyPattern.IService;
import Chapter6.ProxyPattern.Service;

public class Decorator implements IService {
    IService service1;

    public String runSomething() {
        System.out.println("호출에 대한 장식, 기본 클라이언트 값 반환에 추가로 장식을 전달");
    service1 = new Service();
    return "정말" + service1.runSomething();

    }
}
