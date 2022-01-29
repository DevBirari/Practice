package ForLoop;
public class Design{//Pyramid
public static void main(String []args){
for (int a=1;a<=7;a++)
{
for (int b=6;b>=a;b--)
{
System.out.print(" ");
}
for (int c=1;c<=a;c++)
{
System.out.print("*");
}
for (int d=2;d<=a;d++)
{
	System.out.print("*");
}
System.out.println();
}
}
}
