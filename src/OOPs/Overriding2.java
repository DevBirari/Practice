package OOPs;

public class Overriding2 extends Overriding{
public void A() {
System.out.println("Zero Argument xyz");	
}
public static void main(String[] args) {
	Overriding2 obj= new Overriding2();
	obj.A();
	obj.A(9);
} 
}
