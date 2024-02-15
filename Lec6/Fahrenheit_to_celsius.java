package Lec6;
import java.util.*;
public class Fahrenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int maxF=sc.nextInt();
		int minF=sc.nextInt();
		int steps=sc.nextInt();
		
		for(int i=maxF;i<minF;i+=steps) {
			int c=(int) ((5.0/9)*(i-32));
			System.out.println(i+"\t"+c);
		}

	}

}
