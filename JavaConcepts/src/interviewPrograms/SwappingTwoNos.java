package interviewPrograms;

public class SwappingTwoNos {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	//using third variable
	int temp=a;
	a=b;
	b=temp;
	
	System.out.println(a);
	System.out.println(b);
	
	//without third variable
	a=30;
	b=50;
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println(a);
	System.out.println(b);
}
}
