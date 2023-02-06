package src.is.hi.dto2.hbv202g.ass3.frontend;
import src.is.hi.dto2.hbv202g.ass3.backend.*;
public class Main {

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.setEnglish();
		System.out.println(greeter.greet());
		greeter.setGerman();
		System.out.println(greeter.greet());
	}

}