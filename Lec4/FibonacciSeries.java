package Lec4;
import java.util.*;
public class FibonacciSeries {
	public static int Fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int c=Fibonacci(n-1)+Fibonacci(n-2);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	     int ans=Fibonacci(n);
	     System.out.println(ans);
		

	}

}
