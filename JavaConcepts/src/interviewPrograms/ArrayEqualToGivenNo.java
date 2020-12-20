package interviewPrograms;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayEqualToGivenNo {
	public static void main(String[] args) {
		Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
		int a[]= {3,3,1,6,9,5,4,8,8,6,3,2,6,9,7};
		int given=12;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==given) {
					mp.put(a[i], a[j]);
				}
			}
		}
		System.out.println(mp);
	}

}
