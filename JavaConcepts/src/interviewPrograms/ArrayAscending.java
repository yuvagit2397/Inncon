package interviewPrograms;

public class ArrayAscending {
public static void main(String[] args) {
	int arr[]= {4,9,7,2,1,6,3};
	for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		}
	for (int j = 0; j < arr.length; j++) {
		System.out.println(arr[j]);
	}
	}
}

