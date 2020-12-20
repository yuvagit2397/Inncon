package interviewPrograms;

public class RepeatedWord {
public static void main(String[] args) {
	String s="pannai is a very very good girl";
	String[] split = s.split(" ");
	String rev="";
	for (int i = split.length-1; i>=0; i--) {
		String word=split[i];
		System.out.print(word+" ");
			for (int j = word.length()-1; j>=0; j--) {
				char c = word.charAt(j);
				rev=rev+c;
			}
			rev=rev+" ";
		}
	System.out.println(rev);
	}
}

