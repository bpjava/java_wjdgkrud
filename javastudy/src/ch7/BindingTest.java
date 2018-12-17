package ch7;

public class BindingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentb p = new Childb();
		Childb c = new Childb();
//		Childb c2 = (Childb)new Parentb();
		
		System.out.println("p.x = "+p.x);
		p.method();//child method가 오버로딩
		
		System.out.println("c.x = "+c.x);
		c.method();
		
//		System.out.println("c2.x = "+c2.x);
//		c2.method();

	}

}

class Parentb{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Childb extends Parentb{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}