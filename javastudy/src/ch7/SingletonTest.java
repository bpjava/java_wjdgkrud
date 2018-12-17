package ch7;

final class Singleton{

	private static Singleton s = new Singleton();
	
	private Singleton() {
		//...
	}
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}

}

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s = new Singleton();	-	private
		Singleton s2 = Singleton.getInstance();

	}

}
