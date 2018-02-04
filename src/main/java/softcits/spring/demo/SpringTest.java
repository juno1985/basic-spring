package softcits.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@EnableAspectJAutoProxy
public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
				
		Person p = ctx.getBean("person", Person.class);
		p.eat();
		
		Dog d = ctx.getBean("dog", Dog.class);
		d.eat();
	}

}
