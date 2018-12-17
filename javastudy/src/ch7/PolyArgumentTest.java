package ch7;

class Productp{
	int price;
	int bonusPoint;
	
	Productp(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Productp(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tvp extends Productp{
	Tvp(){
		super(100);
	}
	
	public String toString() {
		return "TV";
	}
}

class Computerp extends Productp{
	Computerp(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyerp{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Productp p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p+"을 구입합니다.");
	}
}

public class PolyArgumentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyerp b = new Buyerp();
		
		b.buy(new Tvp());
		b.buy(new Computerp());
		
		System.out.println("현재 남은 돈은 "+b.money+"원 입니다");
		System.out.println("현재 보너스점수는 "+b.bonusPoint+"입니다.");

	}

}
