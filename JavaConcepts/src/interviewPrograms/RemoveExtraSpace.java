package interviewPrograms;

public class RemoveExtraSpace {
public static void main(String[] args) {
	String s="   Think Big    Dream    big    ";
	String[] split = s.split(" ");
	String empty="";
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		/*if (word.length()!=0) {
			empty=empty+word;
		}*/
		String trim = word.trim();
		empty=empty+trim;
		
	}
	System.out.println(empty);
}
}
