import org.aspectj.lang.JoinPoint;

public class MyAspect {

    public void before(JoinPoint joinpoint) {
        System.out.println("adasdasdas")

}
}



--------------------------------

<aop:aspectj-autoproxy />

<bean id="MyAspect" class="aop002.MyAsepect" />
<bean id="boy" class="aop002.Boy" />
<bean id="girl" class="aop002.Girl" />

    
<aop:config>
    <aop:aspect ref="myAspect">    
        <aop:before method="before" pointcut="execution(* runSomething())" />
    </aop:aspect>
</aop:config>