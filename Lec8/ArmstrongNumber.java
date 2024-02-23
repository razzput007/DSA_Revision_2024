package Lec8;
import java.util.*;
public class ArmstrongNumber {
    
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int count=0;
		while(n>0) {
			int rem=n%10;
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static boolean Armstrong(int n) {
		int a=count(n);
		int sum=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			sum+=Math.pow(rem,a);
			temp=temp/10;
		}
	
		if(sum==n) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Armstrong(n));

	}

}
