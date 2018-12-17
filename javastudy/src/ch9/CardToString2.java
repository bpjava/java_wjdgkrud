package ch9;

class Card2{
	String kind;
	int num;
	
	Card2(){
		this("SPADE",1);
	}
	
	Card2(String kind, int num){
		this.kind=kind;
		this.num=num;
	}
	
	public String toString() {
		return "kind: "+kind+", num: "+num;
	}
}

public class CardToString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART",10);
		System.out.println(c1.toString());
		System.out.println(c2.toString());

	}

}
