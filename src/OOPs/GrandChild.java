package OOPs;

public class GrandChild extends ChildClass{
	public static void D(){
		System.out.println("Hello");
	}
public static void main(String[] args) {
	GrandChild obj=new GrandChild();
GrandChild.D();
obj.A();
obj.B();
obj.C();
System.out.println(ParentClass.z);


}
}
