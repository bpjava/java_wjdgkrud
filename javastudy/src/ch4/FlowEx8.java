package ch4;

import java.util.Scanner;

public class FlowEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender;
		String regNo = "";
		
		System.out.print("����� �ֹι�ȣ�� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		gender = regNo.charAt(6);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("����� ���ھдϴ�.");
			break;
		case '2':
		case '4':
			System.out.println("����� �����Դϴ�.");
			break;
		default:
				System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
		

	}

}
