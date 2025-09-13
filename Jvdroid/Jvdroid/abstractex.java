abstract class c1 {
	abstract void f1();
	abstract void f2();
}
abstract class c2 extends c1 {
	void f1() {
		System.out.println("F1 defined in c2");
	}
	abstract void f2();
}

public class c3 extends c2 {

	void f2() {
		System.out.println("f2 defined in c3 ");
	}
	void f1() {
		System.out.println("overrideen in c3");
	}
	void f3() {
		System.out.println("f3 special in c3");
	}
}
class abst {
	public static void main(String [] args) {
		System.out.println("with respect to c3 ");
		c3 o3 = new c3();
		o3.f1();
		o3.f2();
		o3.f3();
		System.out.println("with respect to c2 ");
		c3 o2 = new c3();
		o2.f1();
		o2.f2();
		System.out.println("with respect to c1 ");
		c3 o1 = new c3();
		o1.f1();
		o1.f2();
	}
}
