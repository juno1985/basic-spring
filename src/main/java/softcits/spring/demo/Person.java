package softcits.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="person")
public class Person {
	//按类型注入而非对象名
	@Autowired
	private Bread bread;

	public Bread getBread() {
		return bread;
	}

	public void setBread(Bread bread) {
		this.bread = bread;
	}
	
	public void eat(){
		bread.eaten();
	}

}
