package week9;

import java.util.Scanner;

public class prog2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		s1=s1.replaceAll(s2, "");
		for(int i=0;i<s2.length();i++){
			s1=s1.replaceAll(Character.toString(s2.charAt(i)), "");
		}
		System.out.println(s1.trim());
	}

}
