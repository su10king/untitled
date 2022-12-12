package Chapter6.ProxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args){
        //프록시 안 씀

        Service service = new Service();
        System.out.println(service.runSomething());
        //ex6-8
    }
}
