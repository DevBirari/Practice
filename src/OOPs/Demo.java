package OOPs;

public class Demo  {
public static void main(String[] args) {
	Demo obj=new Demo();
	obj.usingsuper();

	
}
public void C() {
	System.out.println("Thursday");
}
public void D() {
	System.out.println("Wednesday");
}
public void A() {
System.out.println("new Monday");

}
public void B() {
	System.out.println("new Tuesday");
}
public void usingsuper() {
	
	this.A();
	this.B();
	this.C();
	this.D();
	
}
}
