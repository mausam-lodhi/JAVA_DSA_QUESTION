class mausam {
	int a, b, c ;
	mausam() {
		System.out.println(" default constructor");
		System.out.println(" a = 1");
	}
	mausam(int a) {
		this.a = a;
		this.b = a;
		System.out.println(" single parameterized");
		System.out.println("a = " + a + "\n b = " + b);
	}
	mausam(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(" double parameterized");
		System.out.println("a = " + a + "\n b = " + b);
	}
	mausam(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c ;
		System.out.println(" triple parameterized ");
		System.out.println("a = " + a + "\n b = " + b + "\n c = " + c);
	}
	mausam(mausam m3) {
		this.a = m3.a;
		this.b = m3.b;
		this.c = m3.c;
		System.out.println(" object parameterized ");
		System.out.println("a = " + a + "\n b = " + b + "\n c = " + c);
	}
} public class Constructor{
	public static void main(String[] args) {
		mausam m = new mausam();
		mausam m1 = new mausam(1);
		mausam m2 = new mausam(1, 2);
		mausam m3 = new mausam(1, 2, 3);
		mausam m4 = new mausam(m3);
			}
}
