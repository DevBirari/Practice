package ForLoop;

public class Design2 {//two right angled triangle

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for (int a=1;a<=5;a++)
	{
		for (int b=4;b>=a;b--)
		{
			System.out.print("*");
		}
		for (int c=2;c<=a;c++)
		{
			System.out.print(" ");
		}
		for (int d=2;d<=a;d++)
		{
			System.out.print(" ");
		}
		for (int e=4;e>=a;e--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	}
	
	}