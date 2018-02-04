package softcits.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component(value="dog")
@Component
public class Dog {
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
