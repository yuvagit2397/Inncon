package interviewPrograms;

public class AlphabetPosition {
public static void main(String[] args) {
	String c="defz";
	char[] ch = c.toCharArray();
	for (char d : ch) {
		int number=(int)d;
		int value=96;
		int position=number-value;
		System.out.println(position);
	}
}}
