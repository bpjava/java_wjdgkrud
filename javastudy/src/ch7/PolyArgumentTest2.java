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
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		item[i++]=p;
		System.out.println(p+"�� �����մϴ�.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i=0; i<item.length;i++) {
			if(item[i]==null)break;
			sum+=item[i].price;
			itemList += item[i]+",";
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ���"+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
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
