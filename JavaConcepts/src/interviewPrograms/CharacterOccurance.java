package interviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {
	public static void main(String[] args) {
		Map<Character, Integer> mp=new HashMap<>();
		String s="character occurance";
		char[]  ca = s.toCharArray();
		for (char c : ca) {
			if (mp.containsKey(c)) {
				Integer it = mp.get(c);
				mp.put(c,it+1);
			}
			else if (c==' ') {
				continue;
			}
			else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}
