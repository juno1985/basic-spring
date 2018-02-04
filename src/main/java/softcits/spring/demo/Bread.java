package softcits.spring.demo;

import org.springframework.stereotype.Component;

@Component(value="bbbbbbread")
public class Bread {
	
	public void eaten(){
		System.out.println("Bread is being eaten");
	}

}
