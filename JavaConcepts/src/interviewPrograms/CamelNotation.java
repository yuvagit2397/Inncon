package interviewPrograms;

public class CamelNotation {
public static void main(String[] args) {
	String s="Camel notation";
	String[] split = s.split(" ");
	String cam="";
	for (int i = 0; i < split.length; i++) {
		String word = split[i];
		char c=' ';
		if (i==0) {
		  c=Character.toLowerCase(word.charAt(0));
		}
		else {
			c=Character.toUpperCase(word.charAt(0));
		}
		String substring = word.substring(1);
		cam=cam+c+substring;
		
	}
	System.out.println(cam);
}
}
