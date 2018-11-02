package ch5;

public class ArrayEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "SOSHELP";
		String[] mores = {".-","-...","-.-.","-..","."
						  ,"..-.","--.","....","..",".---"
						  ,"-.-",".-.","--","-.","---"
						  ,".--","--.-",".-.","...","-"
						  ,"..-","...-",".--","-..-","-.--"
						  ,"--.."};
		
		String result ="";
		
		for(int i=0; i<source.length(); i++) {
			result+=mores[source.charAt(i)-'A'];
		}
		System.out.println("source:"+source);
		System.out.println("morse:"+result);

	}

}
