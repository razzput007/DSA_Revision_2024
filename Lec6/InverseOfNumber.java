package Lec6;
import java.util.*;
public class InverseOfNumber {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int pos=1;
		int ans=0;
		while(n>0) {
			int rem=n%10;
			ans+=pos*Math.pow(10, rem-1);
			pos++;
			n/=10;
		}
		System.out.println(ans);

	}

}
