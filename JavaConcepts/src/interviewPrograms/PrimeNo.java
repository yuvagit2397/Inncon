package interviewPrograms;

public class PrimeNo {
public static void main(String[] args) {
	int n=0;
	int p=0;
	
	
	for (int i = 2; i<n; i++) {
		if (n%i==0) {
			p++;
		}
	}
	if (p==0 && n>1) {
		System.out.println("the given no "+n+" is a prime no");
	}
	else if (n<2) {
		System.out.println("give a valid no above 1");
		
	}
	else {
		System.out.println("the given no "+n+" is not a prime no");
	}
}
}
