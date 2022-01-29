package package1;

public class NestedFor{
	public static void main(String [] args) {//fibonacci series
		int a=0,b=1;                             //a011235
		{System.out.print(a+" "+b);            //b112358
		for (int x=1;x<=10;x++)                  //c1235813
		{ int	c=a+b;
		
			System.out.print(" "+c);
		
		a=b;
		b=c;
		}}

}}




