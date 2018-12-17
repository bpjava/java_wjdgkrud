package ch7;

class Outer{
	class InstanceInner{
		int iv= 100;
	}
	static class StaticInner{
		int iv=200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=400;
		}
	}
}

public class InnerEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer oc = new Outer();
		Outer.InstanceInner li = oc.new InstanceInner();
		
		System.out.println("li.iv : "+li.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		Outer.StaticInner si =new Outer.StaticInner();
		System.out.println("si.iv : "+si.iv);

	}

}
