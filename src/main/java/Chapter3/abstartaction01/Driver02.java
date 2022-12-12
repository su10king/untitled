package Chapter3.abstartaction01;

public class Driver02 {
    public static void main (String [] args) {
        동물 animals = new 동물();
        동물 mammalia = new 포유류() {
            @Override
            public void swim() {

            }
        };
        동물 bird = new 조류() {
            @Override
            public void fly() {

            }
        };
        동물 whale = new 고래();
        동물 bat = new 박쥐();
        동물 sparrow = new 참새();
        동물 penguin = new 펭귄();


        animals.showMe();
        mammalia.showMe();
        bird.showMe();
        whale.showMe();
        bat.showMe();
        sparrow.showMe();
        penguin.showMe();

        //ex3-14
    }
}
