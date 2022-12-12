package Chapter6.DecorationPattern;

import Chapter6.ProxyPattern.IService;

public class Service implements IService {
    public String runSomething() {
        return "서비스 짱!!!";
    }
}

//ex6-14