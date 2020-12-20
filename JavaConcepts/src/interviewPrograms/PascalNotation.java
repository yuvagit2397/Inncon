package interviewPrograms;

public class PascalNotation {
public static void main(String[] args) {
	String s="pascal notation";
	String[] split = s.split(" ");
	String pas="";
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		char c=Character.toUpperCase(word.charAt(0));
		String substring = word.substring(1);
		pas=pas+c+substring;
	}
	System.out.println(pas);
}
}
