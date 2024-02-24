package Lec10;
import java.util.*;
public class Rotate_Array {
    public static void reverseArray(int arr[], int i,int k ) {
    	int n=arr.length;
    	while(i<k) {
    		int temp=arr[i];
    		arr[i]=arr[k];
    		arr[k]=temp;
    		i++;
    		k--;
    	}
    }
    
    public static void Rotate_Array(int arr[],int k) {
    	int n=arr.length;
          k=k%n;
          reverseArray(arr,0,n-k-1);
          reverseArray(arr,n-k,n-1);
          reverseArray(arr,0,n-1);
          for(int i=0;i<n;i++) {
        	  System.out.println(arr[i]);
          }
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]= {2,3,4,5,6,7,4,3,1};
		
		Rotate_Array(arr,k);
		
		
	}

}
