package interviewPrograms;

import java.util.Scanner;

public class PrimeNoUptoHundred {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;

		System.out.println("prime nos are");
		for (int i = 2; i <= n; i++) {
			int p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					p++;
					break;
				}
			}

			if (p == 0) {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("count of prime nos "+count);

	}
}
