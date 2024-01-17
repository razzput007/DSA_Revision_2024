package Lec4;
import java.util.*;
public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			n=n/10;
			sum+=rem;
		}
		System.out.println(sum);

	}

}
