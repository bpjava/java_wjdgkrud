package ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("고의로 발생시킴");
			throw e;
			//= throw new Exception("고의로 발생시킴");
		}catch(Exception e) {
			System.out.println("에러메세지: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");

	}

}
