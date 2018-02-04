package proxy;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class BreadProxy {

	/*@Before("execution(* softcits.spring.demo.Bread.eaten())")
	public void inforBefore(){
		System.out.println("Bread starts being eaten ----> " + new Date());
	}
	
	@After("execution(* softcits.spring.demo.Bread.eaten())")
	public void inforAfter(){
		System.out.println("Bread eaten completed  ----> " + new Date());
	}*/
	
	@Around("execution(* softcits.spring.demo.Bread.eaten())")
	public void inforAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("Bread starts being eaten ----> " + new Date());
		//要执行被代理的方法
		pjp.proceed();
		
		System.out.println("被代理的类: "+pjp.getTarget().getClass().getName());
		
		System.out.println("被代理的方法: "+pjp.getSignature().getName());
		
		System.out.println("Bread eaten completed  ----> " + new Date());
	}
	
}
