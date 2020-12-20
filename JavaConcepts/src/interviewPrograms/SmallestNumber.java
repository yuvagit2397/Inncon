package interviewPrograms;

public class SmallestNumber {
public static void main(String[] args) {
	int a[]= {2,8,5,1,4,3};
	int min = Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (min>a[i]) {
			min=a[i];
		}
	}
	System.out.println(min);
}
}
