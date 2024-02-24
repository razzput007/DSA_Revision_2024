package Lec10;
import java.util.*;
public class Reverse_Array {
	public static void reverseArray(int arr[],int n) {
		  int i=0;
		  int j=n-1;
		  while(i<j) {
			  int temp=arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  i++;
			  j--;
		  }
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverseArray(arr,n);
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
