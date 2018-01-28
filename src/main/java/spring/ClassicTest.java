package spring;

public class ClassicTest {

	public static void main(String[] args) {

		Bread bread = new Bread();
		Person person = new Person();
		person.setBread(bread);
		person.eatBread();
	}

}
