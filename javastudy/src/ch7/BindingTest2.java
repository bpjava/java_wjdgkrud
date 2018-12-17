package ch7;

public class BindingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentb2 b = new Childb2();
		Childb2 c = new Childb2();
		
		System.out.println("b.x = "+ b.x);
		b.method();
		
		System.out.println("c.x = "+c.x);
		c.method();

	}

}

class Parentb2{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Childb2 extends Parentb2{}