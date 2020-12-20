package interviewPrograms;

public class GreatestNumber {
public static void main(String[] args) {
	int a[]= {2,8,4,6,9,2};
	int max = Integer.MIN_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (max<a[i]) {
			max=a[i];
		}
	}
	System.out.println(max);
}
}
