package interviewPrograms;

public class PerfectNo {
public static void main(String[] args) {
	int n=9;
	int sum=0;
	for (int i = 1; i < n; i++) {
		if (n%i==0) {
			sum=sum+i;
		}
	}
	if (n==sum) {
		System.out.println(n+" ---perfect number");
	}
	else {
		System.out.println(n+"---not a perfect number");
	}
}
}
