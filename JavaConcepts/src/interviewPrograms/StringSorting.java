package interviewPrograms;

public class StringSorting {
public static void main(String[] args) {
	String a[]= {"yuvasri","sri","senthil","jothi"};
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i].compareTo(a[j])>0) {
				String temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
