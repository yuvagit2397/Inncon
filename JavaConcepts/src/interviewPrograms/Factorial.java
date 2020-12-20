package interviewPrograms;

public class Factorial {
	static int fact=1;
	static int n=5;
public static void main(String[] args) {
	for (int i = 1; i <= n; i++) {
		fact=fact*i;
	}
	System.out.println("factorial of 5 is "+fact);
}
}
