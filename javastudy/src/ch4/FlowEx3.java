package ch4;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ�  0�Դϴ�.");
		}else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}

	}

}
