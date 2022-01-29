package ForLoop;

public class revise {
public static void main(String[] args) {
	for(int a=1;a<=7;a++)
	{
		for(int b=7;b>=a;b--)
		{
			System.out.print("*");
		}
		for (int c=2;c<=a;c++)
		{
			System.out.print(" ");
		}
		for(int d=2;d<=a;d++)
		{
			System.out.print(" ");
		}
		for (int e=7;e>=a;e--)
		{
			System.out.print("*");
		}
	System.out.println();
	}
}
}
