package Chapter2;

public class Start7 extends Thread {
     static int share;

     public static void main(String [] args) {
         Start5 t1 = new Start5();
         Start5 t2 = new Start5();

         t1.start();
         t2.start();

     }


     public void run () {
         for(int count = 0; count < 10; count ++) {
             System.out.println(share++);

             try {
                 sleep(1000);   //1000 이상 혹은 10000이하
             }catch (InterruptedException e) {}
         }
     }
     // ex2-7
}
