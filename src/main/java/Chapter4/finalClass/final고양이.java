package Chapter4.finalClass;

public class final고양이 {
    final static int 정적상수1 =1 ;
    final static int  정적상수2;

    final int 객체상수 =3;
    final int 객체상수2;

    static {
        정적상수2 = 2;
        //상수는 한번 설정하면 초기화 불가능함
    }
    final고양이 () {
        객체상수2 = 4;
        //상수는 한번 설정하면 초기화 불가능함

        final int 지역상수 = 1;
        final int 지역상수2;

        지역상수2 =2;

        //ex 4-23
    }
}
