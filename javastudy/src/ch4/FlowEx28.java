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
			System.out.print("1과 100사이의 점수를 입력");
			String tmp = scanner.nextLine();
			input = Integer.parseInt(tmp);
			
			if(input>answer) {
				System.out.println("더 작은 수로 다시 입력하세요");
			}else if(input<answer) {
				System.out.println("더 큰 수로 다시 입력하세요");
			}
		}while(input!=answer);
		
		System.out.println("정답입니다.");

	}

}
