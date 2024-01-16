package Lec20;
import java.util.*;
public class Kartik_Bhaiya_String {
	
	public static int MaxlengthString(String s,char c,int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int flip=0;
		while(ei<s.length()) {
			if(s.charAt(ei)==c) {
				flip++;
			}
			
			while(flip>k && si<=ei) {
				if(s.charAt(si)==c) {
					flip--;
				}
				si++;
			}
			ans=Math.max(ei-si+1, ans);
			ei++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String str=sc.next();
		int a=MaxlengthString(str,'a',k);
		int b=MaxlengthString(str,'b',k);
		System.out.println(Math.max(a, b));

	}

}
