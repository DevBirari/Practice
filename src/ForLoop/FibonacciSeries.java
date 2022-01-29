package ForLoop;

public class FibonacciSeries {
public static void main(String args []) {
	int a=0;
	int b=1;
	int c;
	System.out.print(a+" "+b);
	for (int d=1;d<=20;d++)
	{    c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	
	}
	
}
}
