package ch3;

public class OpertatorEx31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dec = 1234;
		int hex = 0xABCE;
		int mask = 0xF;
		
		System.out.printf("hex = %X%n", hex);
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >>4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >>4;
		System.out.printf("%X%n",  hex & mask);
		
		hex = hex >>4;
		System.out.printf("%X%n", hex & mask);
	}

}
