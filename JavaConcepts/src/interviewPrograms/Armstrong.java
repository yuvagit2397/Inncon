package interviewPrograms;

public class Armstrong {
public static void main(String[] args) {
	long a=153l;
	long i=0;
	long j=0;
	long n=a;
	while (n>0) {
		i=n%10;
		j=j+(i*i*i);
		n=n/10;
	}
	if (a==j) {
		System.out.println("given no is armstrong");
	}
	else {
		System.out.println("not a armstrong");
	}
}
}
