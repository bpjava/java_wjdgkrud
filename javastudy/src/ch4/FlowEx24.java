package ch4;

public class FlowEx24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =11;
		
		System.out.println("자 , 이제 카운트다운을 시작합니다.");
		
		while(i--!=0) {
			System.out.println(i);
			
			for(int j=0; j<2_000_000_000;j++) {
				;//시간 지연
			}
		}
		
		System.out.println("Game over");

	}

}
