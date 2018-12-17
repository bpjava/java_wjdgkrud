package ch7;

public class InnerEx6 {

	Object iv = new Object() {void method(){}};
	static Object cv = new Object() {void method(){}};
	
	void mymethod() {
		Object iv = new Object() {void method(){}};
	}

}
