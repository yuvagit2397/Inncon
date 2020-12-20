package com.java.programs;

import java.util.ArrayList;
import java.util.List;

public class CharacterSequence {
	public static void main(String[] args) {
		String s = "GreensTechnologies";
		List<Character> li=new ArrayList<>();
		
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count = count + 1;
				}

			}
			//g=2
			if(li.contains(s.charAt(i))) {
				continue;
			}else {
				li.add(s.charAt(i));
				System.out.print(s.charAt(i) + "=" + count + ",");

			}
		}
System.out.println(" checking for \n new line");
	}
	
	
}
