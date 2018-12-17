package ch7;

class Outers{
	int value = 10;
	
	class Inner{
		int value=20;
		void method1() {
			int value=30;
			System.out.println("              value: "+value);
			System.out.println("    this.value: "+this.value);
			System.out.println("Outer.this.value: "+Outers.this.value);
		}
	}
}

public class InnerEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outers outer = new Outers();
		Outers.Inner inner = outer.new Inner();
		inner.method1();

	}

}
