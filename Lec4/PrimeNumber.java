package Lec4;
import java.util.*;
public class PrimeNumber {

	public static void CheckPrime(int n) {
		int count=0;
		if(n==0 || n==1) {
			System.out.println("Not Prime");
		}
		
		for(int i=2;i<=n;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count>2) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("Prime");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		CheckPrime(n);

	}

}
