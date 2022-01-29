package OOPs;

public class Overriding3 extends Overriding2{
public void A() {
	System.out.println("NO argument");
}
public static void main(String[] args) {
	Overriding3 obj=new Overriding3();
	obj.A();
	obj.A(9);
}
}
