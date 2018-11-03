package ch6;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(Stirng[] args)이 시작되었습니다.");
		firstMethod();//static함수안에서는 static함수만을 부를 수 있음.
		System.out.println("main(String[] args)가 끝났습니다.");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()이 시작");
		secondMethod();
		System.out.println("firstMethod()이 끝");
	}
	
	static void secondMethod() {
		System.out.println("secondeMethod()이 시작");
		System.out.println("secondeMethod()이 끝");
	}

}
