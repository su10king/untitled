package Chapter7;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.junit.Before;
import org.junit.After;

@Aspect
public class AnnotationMyAspect {
    @Before("excution(*runSomething())")
    public void befor(JoinPoint joinPoint) {
        System.out.println("얼굴 인식 문을 엽니다");
    }

    @After("excution(*runSomething())")
    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("문을 닫습니다.");
    }
}
//7-55