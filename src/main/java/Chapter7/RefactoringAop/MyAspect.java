package Chapter7.RefactoringAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import javax.annotation.Resource;

@Resource
@Aspect
public class MyAspect {
   @Pointcut("execution(* runSomething())")
    private void iampc() {
       //의미없음 syso
   }
    @Before("iampc()")
    public void before(JoinPoint joinPoint) {
       System.out.println("문을 개방하라");
    }

    @After("iampc()")
    public void lockDoor (JoinPoint joinPoint) {
       System.out.println("문을 닫으시오");
    }

}
