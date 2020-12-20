package interviewPrograms;

public class ParingValueWithDiffOne {
public static void main(String[] args) {
	int arr[]= {1,2,4,5,8};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]-arr[j]==1||arr[j]-arr[i]==1) {
				System.out.println(arr[i]+"="+arr[j]);
			}
		}
	}
}
}
