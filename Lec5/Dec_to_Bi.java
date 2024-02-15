package Lec5;
import java.util.*;
public class Dec_to_Bi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int mul=1;
    while(n>0) {
    	int rem=n%2;
    	sum+=rem*mul;
    	mul*=10;
    	n/=2;
    }
    System.out.println(sum);
	}

}
