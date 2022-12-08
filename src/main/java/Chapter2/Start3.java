package Chapter2;

public class Start3 {
    public static void main(String[] args) {
        int i = 10;
        int k = 20;

        if(i ==10) {
            int m = k+5;
            k=m;
        }else {
            int p = k + 10;
            k=p;
            System.out.println(p);
            //	System.out.println(m);
            System.out.println(k);
            System.out.println(i);
        }
        //k = m+p;
    }
}
