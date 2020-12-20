package interviewPrograms;

public class Anagram {
	public static void main(String[] args) {
		
	
	String s1="paanai";
	String s2="paanai";
	int j=0;
	if (s1.length()==s2.length()) {
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (s2.contains(""+c+"")==false) {
				j++;
			}
		}
	}
	else {
		j++;
	}
	
	if (j==0) {
		System.out.println("given strings are anagram");
	}
	else {
		System.out.println("not a anagram");
	}

}}
