package ch8;

public class ExceptionEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exception e = new Exception("���Ƿ� �߻���Ŵ");
			throw e;
			//= throw new Exception("���Ƿ� �߻���Ŵ");
		}catch(Exception e) {
			System.out.println("�����޼���: "+e.getMessage());
			e.printStackTrace();
		}
		System.out.println("���α׷� ���� ����");

	}

}
