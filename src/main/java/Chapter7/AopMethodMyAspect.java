package Chapter7;

import org.aspectj.lang.JoinPoint;

public class AopMethodMyAspect {
    public void before(JoinPoint joinPoint) {
        System.out.println("문을 개방합니다1");

    }

    public void lockDoor(JoinPoint joinPoint) {
        System.out.println("문을 잠그자2");
    }

}

//ex 7-53
