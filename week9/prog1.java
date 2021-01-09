package week9;
import java.util.*;
public class prog1 {

	public static void calc(int a[], int size, int sum) {
		
		for(int i=0;i<size-2;i++) {
			HashSet <Integer> hs = new HashSet <Integer>();
			int p_sum = sum-a[i];
			for(int j=i+1;j<size;j++) {
			if(hs.contains(p_sum-a[j])) {
				System.out.println(a[i]+"\t"+a[j]+"\t"+(p_sum-a[j]));
			}else
				hs.add(a[j]);
		}}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int a[] = new int[size];
		for(int i=0;i<size;i++)
			a[i]=in.nextInt();
		int n = in.nextInt();
		calc(a,size,n);
	}

}
