package ForLoop;

public class Practice {//pyramid

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int a=1;a<=5;a++)
{
	for(int b=1;b<=a;b++)
	{
		System.out.print(" ");
	}
	for(int c=5;c>=a;c--)
	{
		System.out.print("*");
	}
	for(int d=4;d>=a;d--)
	{
		System.out.print("*");
	}
	System.out.println();
	}

}
}
