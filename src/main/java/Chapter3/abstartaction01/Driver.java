package Chapter3.abstartaction01;

public class Driver {

    public static void main(String [] args) {
        동물 [] 동물들 = new 동물[5];

        동물들 [0] = new 고래 ();
        동물들 [1] = new 박쥐 ();
        동물들 [2] = new 펭귄 ();
        동물들 [3] = new 참새 ();

        for (int i = 0; i < 동물들.length; i++) {
            동물들 [i].울어보세요();
        }
    }
}
