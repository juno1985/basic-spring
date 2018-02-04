package proxy;

import java.util.Date;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class BreadProxy {

	@Before("execution(* softcits.spring.demo.Bread.eaten())")
	public void inforBefore(){
		System.out.println("Bread starts being eaten ----> " + new Date());
	}
	
	@After("execution(* softcits.spring.demo.Bread.eaten())")
	public void inforAfter(){
		System.out.println("Bread eaten completed  ----> " + new Date());
	}
}
