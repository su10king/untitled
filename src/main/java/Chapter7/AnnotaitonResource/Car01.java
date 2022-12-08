package Chapter7.AnnotaitonResource;

import Chapter7.Tire;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
public class  Car01 {
    @Resource
    Tire tire;

    public String getTireBoard() {
        return "장착된 타이어: " +
                tire.getBrand();
    }
    // 리소스 어노테이션으로 타이어브랜드 overload해서 가져오기
}
