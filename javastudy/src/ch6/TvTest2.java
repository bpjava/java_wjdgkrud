package ch6;

class Tvs{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;};
	void channelUp() {++channel;};
	void channelDown() {--channel;}
}

public class TvTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tvs t1 = new Tvs();
		Tvs t2 = new Tvs();
		System.out.println("t1의 channel값은 "+t1.channel);
		System.out.println("t2의 channel값은 "+t2.channel);
		
		t1.channel = 7;
		System.out.println("t1의 channel값은 "+t1.channel);
		System.out.println("t2의 channel값은 "+t2.channel);

	}

}
