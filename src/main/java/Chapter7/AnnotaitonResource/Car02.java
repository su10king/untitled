package Chapter7.AnnotaitonResource;

import Chapter7.Tire;

import javax.annotation.Resource;

public class Car02 {
    @Resource(name = "tire1")
    Tire tire;

    public String getTireBoard() {
        return "장착된 타이어: " +
                tire.getBrand();
    }
    // 리소스 어노테이션으로 타이어브랜드 overload해서 가져오기
    //ex 7-34
    //ex 7-37 xml 파일에서 빈 id설정을 바꾸라는 내용
}
