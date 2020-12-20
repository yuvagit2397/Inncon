package interviewPrograms;

public class ExtractNoFromString {
public static void main(String[] args) {
	String s="yuvasri12345";
	String sub="";
	for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		if (c>='0' && c<='9') {
			sub=sub+c;
		}
	}
	System.out.println(sub);
}
}
