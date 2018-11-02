package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int sum=0;
		boolean flag = true;
		
		System.out.println("합계를 구할 숫자를 입력하세요>");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num!=0) {
				sum +=num;
			}else {
				flag = false;
			}
		}
		
		System.out.println("합계:"+sum);

	}

}
