package ch6;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c5 = new Car();
		Car c6 = new Car(c5);
		
		System.out.println("c5의 color="+c5.color+", gearType="+c5.gearType+", door="+c5.door);
		System.out.println("c6의 color="+c6.color+", gearType="+c6.gearType+", door="+c6.door);
		
		c5.door=100;
		System.out.println("c5.door=100; 수행후");
		System.out.println("c5의 color="+c5.color+", gearType="+c5.gearType+", door="+c5.door);
		System.out.println("c6의 color="+c6.color+", gearType="+c6.gearType+", door="+c6.door);

	}

}
