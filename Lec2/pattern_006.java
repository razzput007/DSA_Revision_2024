package Lec2;
import java.util.*;
public class pattern_006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int space=2*n-2;
       int star=1;
       int row=1;
       while(row<=n) {
    	   int i=1;
    	   while(i<=space) {
    		   System.out.print("  ");
    		   i++;
    	   }
    	   int j=1;
    	   while(j<=star) {
    		   System.out.print("* ");
    		   j++;
    	   }
    	   space-=2;
    	   star++;
    	   row++;
    	   System.out.println();
    	   
       }
	}

}
