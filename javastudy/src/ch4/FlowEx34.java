package ch4;

import java.util.Scanner;

public class FlowEx34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		outer:
			while(true) {
				System.out.println("(1) square");
				System.out.println("(2) square root");
				System.out.println("(3) log");
				System.out.println("원하는 메뉴를 선택하세요");
				
				String tmp = scanner.nextLine();
				menu = Integer.parseInt(tmp);
				
				if(menu==0) {
					System.out.println("프로그램을 종료합니다");
					break;
				}else if(!(1 <= menu && menu <=3)) {
					System.out.println("메뉴를 잘 못 선택");
					continue;
				}
				
				for(;;) {
					System.out.print("계산할 값을 입력하세요");
					tmp = scanner.nextLine();
					num = Integer.parseInt(tmp);
					
					if(num==0)
						break;	//계산종료
					if(num==99)
						break outer; //전체종료
					
					switch(menu) {
					case 1:
						System.out.println("result="+num*num);
						break;
					case 2:
						System.out.println("result="+Math.sqrt(num));
						break;
					case 3:
						System.out.println("result="+Math.log(num));
						break;
					}
				}
			}

	}

}
