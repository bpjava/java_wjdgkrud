package ch7;

import java.util.Vector;

class Buyerp3{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Productp p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		item.add(p);
		System.out.println(p+"�� �����մϴ�.");
	}
	
	void refund(Productp p) {
		if(item.remove(p)) {
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"�� ��ǰ�մϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList ="";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ���� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Productp p = (Productp)item.get(i);
			sum+=p.price;
			itemList += (i==0) ? "" +p : ","+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
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
