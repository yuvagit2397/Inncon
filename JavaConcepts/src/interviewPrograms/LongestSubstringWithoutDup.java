package interviewPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstringWithoutDup {
public static void main(String[] args) {
	String s="longestsubstringwithoutdup";
	List<String> li=new ArrayList<String>();
	List<Integer> length=new ArrayList<>();
	
	for (int i = 0; i < s.length(); i++) {
		String subString="";
		char c = s.charAt(i);
		subString=subString+c;
		for(int j=i+1;j<s.length();j++) {
			char c1 = s.charAt(j);
			if (subString.contains(""+c1+"")==false) {
				subString=subString+c1;
			}
			else {
				break;
			}
		}
		li.add(subString);
	}
	
	for (String sub : li) {
		length.add(sub.length());
	}
	
	Integer max = Collections.max(length);
	int index = length.indexOf(max);
	String text = li.get(index);
	System.out.println(text);
	
}
}
