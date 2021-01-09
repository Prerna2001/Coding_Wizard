package week9;

import java.util.Scanner;

public class prog3 {
static String a[] = {"","I","II","III","IV","V","VI","VII","VIII","XI"};
static String b[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
static String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

public static void roman(int n) {
	String str="";
	str = str+c[n/100];
	n=n%100;
	str+=b[n/10];
	n=n%10;
	str+=a[n];
	System.out.println("\""+str+"\"");
}

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
int n = in.nextInt();
roman(n);
	}

}
