package ch4;

import java.util.Scanner;

public class FlowEx28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է�");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input>answer) {
				System.out.println("�� ���� ���� �ٽ� �Է��ϼ���");
			}else if(input<answer) {
				System.out.println("�� ū ���� �ٽ� �Է��ϼ���");
			}
		}while(input!=answer);
		
		System.out.println("�����Դϴ�.");

	}

}
