package Chapter4.Constructor03;

public class Driver02 {
    public static void main(String[] args) {
        동물 뽀로로 = new 동물 ("뽀로로");
        //동물 무명 = new 동물();
        //무명 코드가 실행되지 않는 이유는 객체 스트링 name 값이 설정되지 않았기 때문임.
        //기본생성자가 자동으로 세팅되기 위한 조건으로는 내부 메서드가 하나도 없어야 함.
        //메서드가 하나라도 있으면 기본생성자 안 만들어줌. 동물 클래스 안에 메서드가 하나 있기 때문에 무명은 네임메서드가 있어서 오류나는거임
    }
}
