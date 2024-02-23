package Lec9;
import java.util.*;
public class LinearSearch {

	public static int linearSearch(int arr[],int item) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           int arr[]= {2,3,4,5,6,8};
           int item=sc.nextInt();
           System.out.println(linearSearch(arr,item));
           
	}

}
