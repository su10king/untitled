package Chapter4.Interface;

public interface Speakable {
    double PI = 3.14159;
    double absoluteZeroPoint = -275.15;

    void sayYes();
    //ex4-29
    //ex4-31 final 추가
}
    class Specker implements Speakable {
    public void sayYes() {
        System.out.println("I say NO!!!");
    }
}

