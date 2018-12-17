package ch7;

import java.util.Vector;

class Buyerp3{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Productp p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		item.add(p);
		System.out.println(p+"을 구입합니다.");
	}
	
	void refund(Productp p) {
		if(item.remove(p)) {
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을 반품합니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList ="";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품ㅇㅣ 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Productp p = (Productp)item.get(i);
			sum+=p.price;
			itemList += (i==0) ? "" +p : ","+p;
		}
		System.out.println("구입하신 물품의 총금액은"+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyerp3 b = new Buyerp3();
		Tvp tv = new Tvp();
		Computerp vom = new Computerp();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(vom);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(vom);
		b.summary();

	}

}
