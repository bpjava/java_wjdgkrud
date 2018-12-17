package ch9;

final class Cards{
	String kind;
	int num;
	
	Cards(){
		this("SPADE",1);
	}
	
	Cards(String kind, int num){
		this.kind = kind;
		this.num = num;
	}
	
	public String toString() {
		return kind+":"+num;
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Cards c = new Cards("HEAERT",3);
		Cards c2 = Cards.class.newInstance();
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());

	}

}
