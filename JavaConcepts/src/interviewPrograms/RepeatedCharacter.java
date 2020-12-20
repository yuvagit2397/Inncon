package interviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedCharacter {
	public static void usingMap() {
		String s="GreensTechnologies";
		/*String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			char lc = Character.toLowerCase(ch);
			s1=s1+lc;
		}*/
		s=s.toLowerCase();
		HashMap<Character, Integer> mp=new HashMap<>();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (mp.containsKey(c)) {
				Integer it = mp.get(c);
				mp.put(c,it+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		
		Set<Entry<Character, Integer>> entry = mp.entrySet();
		for (Entry<Character, Integer> en : entry) {
			if (en.getValue()>1) {
				System.out.println(en);
			}
		}
	}
	
	public static void usingList() {
		String s="GreensTechnologies";
		s=s.toLowerCase();
		List<Character> li=new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			int count=1;
			char c = s.charAt(i);
			for (int j = i+1; j <s.length(); j++) {
				char c1 = s.charAt(j);
				if (c==c1) {
					count++;
				}
			}
			if (li.contains(c)==false && count>1) {
				System.out.println(c+"="+count);
				li.add(c);
			}
		}
			
		
		
	}
	public static void main(String[] args) {
		//usingMap();
		usingList();
	}
}
