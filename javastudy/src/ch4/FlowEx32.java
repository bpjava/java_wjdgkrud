package ch4;

import java.util.Scanner;

public class FlowEx32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if(!(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘 못 선택");
				continue;
			}
			
			System.out.println("선택하신 메뉴는 "+menu);
		}

	}

}
