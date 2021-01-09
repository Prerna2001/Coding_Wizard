package week9;

import java.util.Scanner;

public class prog4 {
	
	public static void pattern(int n) {
		int c1 = n / 2, c2 = 1; 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= c1; j++) 
                System.out.print(" "); 
            int count = c2 / 2 + 1; 
            for (int k = 1; k <= c2; k++) { 
                System.out.print(count); 
                if (k <= c2 / 2) 
                    count--; 
                else
                    count++; 
            } 
            System.out.println(); 
            if (i <= n / 2) { 
                c1 = c1 - 1; 
c2 = c2 + 2; 
            } 
  
            else {  
                c1 = c1 + 1; 
                c2 = c2 - 2; 
            } 
        } 
    } 
  
	

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int n = in.nextInt();
		pattern(n);
	}

}
