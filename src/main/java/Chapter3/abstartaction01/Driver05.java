package Chapter3.abstartaction01;


public class Driver05 {
    public static void main (String[] args) {
        날수있는 날라리1 = (날수있는) new 박쥐();
        날라리1.fly();

        날수있는 날라리2 = (날수있는) new 참새();
        날라리2.fly();

        헤엄칠수있는[] 맥주병들 = new 헤엄칠수있는[2];
        맥주병들[0] = new 고래();
        맥주병들[1] = (헤엄칠수있는) new 펭귄();

        for(헤엄칠수있는 맥주병 : 맥주병들) {
            맥주병.swim();

            //ex3-25
        }
    }
}
