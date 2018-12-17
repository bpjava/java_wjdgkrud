package ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutaCard[] cards = new SutaCard[CARD_NUM];
	boolean iskwang;
	
	SutdaDeck() {
		
		for(int i=0; i<CARD_NUM; i++) {
			
			if(i==0 || i==2 || i==7) {
				iskwang=true;
			}else {
				iskwang=false;
			}
			
			cards[i]=new SutaCard(i+1,iskwang);
		}
	}
}

class SutaCard{
	int num;
	boolean isKwang;
	
	SutaCard(){
		this(1,true);
	}
	
	SutaCard(int num, boolean isKwang){
		this.num=num;
		this.isKwang=isKwang;
	}
	
	public String toString() {
		return num+(isKwang ? "k":"");
	}
}

public class Ch7test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i]+",");
		}
	}

}
