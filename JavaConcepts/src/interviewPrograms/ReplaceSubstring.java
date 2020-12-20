package interviewPrograms;

public class ReplaceSubstring {
public static void main(String[] args) {
	String s="java is a language. java used to write a programs in a java code";
	String[] split = s.split("java");
	String replace="python";
	String empty="";
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		if (word.length()==0) {
			continue;
		}
		empty=empty+replace+word;
	}
	System.out.println(empty);
}
}
