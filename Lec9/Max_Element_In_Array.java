package Lec9;
import java.util.*;
public class Max_Element_In_Array {
	public static int maxElement(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,5,3,77,1,9};
        System.out.println(maxElement(arr));
	}

}
