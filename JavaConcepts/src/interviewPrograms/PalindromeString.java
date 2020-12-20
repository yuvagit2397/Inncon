package interviewPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PalindromeString {
public static void main(String[] args) {
	String s="paanachi";
	String s1="";
	
	//checking palindrome with normal iteration
	/*Character[] arr=new Character[s.length()];
	int a=arr.length-1;
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		arr[a]=c;
		a--;
	}
	
	for (int i = 0; i < arr.length; i++) {
		s1=s1+arr[i];
	}
	System.out.println(s1);*/
	
	//checking palindrome with reverse iteration
	
	for (int i = s.length()-1; i >=0; i--) {
		char charAt = s.charAt(i);
		s1=s1+charAt;
	}
	if (s==s1) {
		System.out.println("given string is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
}
}
