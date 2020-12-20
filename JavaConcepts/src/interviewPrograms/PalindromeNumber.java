package interviewPrograms;

public class PalindromeNumber {
public static void main(String[] args) {
	int a=13431;
	int i,j=0;
	int n=a;
	
	while (n>0) {
		i=n%10;
		j=(j*10)+i;
		n=n/10;
	}
	if (j==a) {
		System.out.println("given no is palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
