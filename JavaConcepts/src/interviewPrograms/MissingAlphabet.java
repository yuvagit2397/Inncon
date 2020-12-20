package interviewPrograms;

public class MissingAlphabet {
public static void main(String[] args) {
	String s="abcdefghijklmnopqrstuvwxyz";
	String s1="acdefghijklmnoprstuvwxyz";
	System.out.println("Missing alphabets are........");
	for (int i = 0; i <s.length(); i++) {
		char ch = s.charAt(i);
		if(s1.contains(""+ch+"")==false) {
			System.out.println(ch);
		}
	}
}
}
