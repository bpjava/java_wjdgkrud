package ch7;

public class InstanceofTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is a Object");
		}
		
		System.out.println(fe.getClass().getName());

	}

}
