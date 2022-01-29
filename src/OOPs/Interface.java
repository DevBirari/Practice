package OOPs;

public class Interface implements Implementation,Implementation1{
public void A() {
	System.out.println("hello");
}
public void B() {
	System.out.println("java");
}
public void C() {
	System.out.println("hey");
}
public void D() {
	System.out.println("there");
}
public static void main(String[] args) {
	Interface obj =new Interface();
	obj.A();
	obj.B();
	obj.C();
	obj.D();
	Implementation.C();
}
}
