package Chapter6.TemplateCallBackPattern;


public class Client {
    public static void main (String[] args) {
        Solider rambo = new Solider();

        System.out.println();

        rambo.runContext("총총총");

        System.out.println();


        rambo.runContext("칼칼칼");

        System.out.println();


        rambo.runContext("활활활");
    }
}
