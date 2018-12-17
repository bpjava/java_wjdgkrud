package ch9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"bat","baby","bonue","c","cA","ca","co","c.","c0","c#","car","combat","count","date","disc"};
		String[] pattern = {".*","c[a-z]*","c[a-z]","c[a-zA-Z]","c[a-zA-Z0-9]","c.","c.*","c\\.","c\\w","c\\d","c.*t","[b|c].*",".*a.*",".*a.+","[b|c].{2}"};
		
		for(int x=0; x<pattern.length; x++) {
			Pattern p = Pattern.compile(pattern[x]);
			System.out.print("Pattern : "+pattern[x]+" °á°ú: ");
			for(int i=0; i<data.length; i++) {
				Matcher m = p.matcher(data[i]);
				if(m.matches())
					System.out.print(data[i]+",");
			}
			System.out.println();
		}

	}

}
