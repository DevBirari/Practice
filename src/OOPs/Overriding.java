package OOPs;

public class Overriding {

	public void A() {
		System.out.println("zero argument");
		}
		public void A(int a) {
			System.out.println("Int 'a' Argument/PArameters");
		}
	public void A(char a,int c) {
		System.out.println("char and int argument");
	}
	public void A(float z, char x, int y) {
		System.out.println("float, car, int argument");
	}
	public static void main(String [] args) {
		PolyMorphism obj= new PolyMorphism();
		obj.A();
		obj.A(6);
		obj.A(1.54f,'a',8);
		obj.A('z',88);
	}
	}

