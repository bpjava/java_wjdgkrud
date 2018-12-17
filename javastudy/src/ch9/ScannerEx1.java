package ch9;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			String input = s.nextLine();
			
			input = input.trim();
			argArr = input.split(" +");//하나이상의 공백
			
			String command = argArr[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if(command.equals("q")) {
				System.exit(0);
			}else {
				for(int i=0; i<argArr.length; i++)
					System.out.println(argArr[i]);
			}
		}

	}

}
