package ch4;

public class FlowEx33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5) {
					break Loop1;
//					continue Loop1;
//					continue;
//					System.out.println(i+"*"+j+"="+i*j);
				}
				System.out.println();
			}
		}

	}

}
