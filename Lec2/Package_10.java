package Lec2;
import java.util.*;
public class Package_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=2*n-1;
        int space=0;
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
      	  star-=2;
      	  space++;
      	  row++;
      	  System.out.println();
        }

	}

}
