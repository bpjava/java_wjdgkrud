package ch6;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(Stirng[] args)�� ���۵Ǿ����ϴ�.");
		firstMethod();//static�Լ��ȿ����� static�Լ����� �θ� �� ����.
		System.out.println("main(String[] args)�� �������ϴ�.");

	}
	
	static void firstMethod() {
		System.out.println("firstMethod()�� ����");
		secondMethod();
		System.out.println("firstMethod()�� ��");
	}
	
	static void secondMethod() {
		System.out.println("secondeMethod()�� ����");
		System.out.println("secondeMethod()�� ��");
	}

}
