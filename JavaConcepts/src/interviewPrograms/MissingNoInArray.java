package interviewPrograms;

public class MissingNoInArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8,9};
		int sum1=0;
		int sum2=0;
		for (int i = 1; i <=9; i++) {
			sum1=sum1+i;
		}
		
		for (int i = 0; i < a.length; i++) {
			sum2=sum2+a[i];
		}
		int sum=sum1-sum2;
		System.out.println("missing number : "+sum);
	}

}
