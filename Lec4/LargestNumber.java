package Lec4;
import java.util.*;
public class LargestNumber {
	public static int Largest(int arr[],int n) {
		
	     if(n==1) {
	    	 return arr[0];
	     }
	     return Math.max(arr[n-1],Largest(arr,n-1));
	     
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,5,2,1,7,8,9};
		int n=arr.length;
		System.out.println(Largest(arr,n));
		

	}

}
