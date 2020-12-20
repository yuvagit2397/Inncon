package interviewPrograms;

public class Pattern {
public static void triangle() {
	int s=10;
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=s; j++) {
			System.out.print(" ");
		}
		for (int d = 1; d <=i; d++) {
			System.out.print(" *");
		}
		s--;
		System.out.println();
	}
}

public static void forward() {
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
public static void backward() {
	for (int i =1; i <=5; i++) {
		for (int j =5; j>=i; j--) {
			System.out.print(" *");
		}
		System.out.println();
	}
}
public static void main(String[] args) {
	triangle();
	System.out.println("-------------");
	forward();
	System.out.println("-------------");
	backward();
}
}
