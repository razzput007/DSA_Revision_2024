package Lec4;
import java.util.*;
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int divisor=Math.min(a, b);
		int divident=Math.max(a,b);
		while(divident%divisor!=0) {
			int rem=divident%divisor;
			
			divident=divisor;
			divisor=rem;
			
		}
		System.out.println(divisor);

	}

}
