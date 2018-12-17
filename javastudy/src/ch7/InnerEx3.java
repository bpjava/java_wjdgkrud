package ch7;

public class InnerEx3 {
	private int outerIv = 0;
	static int outerCv = 0;

	class InstanceInner{
		int ilv = outerIv;
		int ilv2 = outerCv;
	}
	
	static class StaticInner{
		//int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int iv = 0;
		final int LV =0;
		
		class LocalInner{
			int ilv = outerIv;
			int ilv2 = outerCv;
			int ilv3 = iv;
			int ilv4 = LV;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
