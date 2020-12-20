package interviewPrograms;

public class SumOfDigits {
public static void main(String[] args) {
	int n=12345;
	int i,j=0;
	int a=n;
	while (a>0) {
		i=a%10;
		j=j+i;
		a=a/10;
	}
	System.out.println(j);
}
}
