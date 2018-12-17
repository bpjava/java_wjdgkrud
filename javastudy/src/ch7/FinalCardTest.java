package ch7;

class CardF{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	CardF(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	CardF(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND+" "+NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CardF c = new CardF("HEART",10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);

	}

}
