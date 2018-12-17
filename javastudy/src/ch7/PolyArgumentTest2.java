package ch7;

class Audio extends Productp{
	Audio(){super(50);}
	public String toString() {return "Audio";}
}

class Buyerp2{
	int money = 1000;
	int bonusPoint = 0;
	Productp[] item = new Productp[10];
	int i = 0;
	
	void buy(Productp p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		item[i++]=p;
		System.out.println(p+"을 구입합니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length;i++) {
			if(item[i]==null)break;
			sum+=item[i].price;
			itemList += item[i]+",";
		}
		System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyerp2 b = new Buyerp2();
		
		b.buy(new Tvp());
		b.buy(new Computerp());
		b.buy(new Audio());
		b.summary();

	}

}
