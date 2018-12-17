package ch8;

import java.io.File;

public class ExceptionEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = createFile2(args[0]);
			System.out.println(f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		}catch(Exception e) {
			System.out.println(e.getMessage()+"�ٽ� �Է����ֽñ� �ٶ��ϴ�.");
		}

	}
	
	static File createFile2(String fileName) throws Exception{
		if(fileName==null || fileName.equals("")) {
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		}
		File f = new File(fileName);
		f.createNewFile();
		return f;
	}

}
