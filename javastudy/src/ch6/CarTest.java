package ch6;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto",4);
	}
	
	Car(String color){
		this(color,"auto",4);
	}
	
	Car(String c,String g, int d){
		this.color = c;
		this.gearType = g;
		this.door = d;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("white","auto",4);
		
		System.out.println("c1ÀÇ color="+c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2ÀÇ color="+c2.color+", gearType="+c2.gearType+", door="+c2.door);

	}

}
