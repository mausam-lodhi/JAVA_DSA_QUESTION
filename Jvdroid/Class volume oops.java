import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Box b1 = new Box();
		System.out.println("Enter length , width , height (for b1): ");
		b1.length = input.nextFloat();
		b1.width = input.nextFloat();
		b1.height = input.nextFloat();
		System.out.print("Volume for b1 :");
		b1.volume();
		Box b2 = new Box();
		System.out.println("Enter length , width , height (for b2): ");
		b2.length = input.nextFloat();
		b2.width = input.nextFloat();
		b2.height = input.nextFloat();
		System.out.print("Volume for b2 :");
		b2.volume();
	}
}
class Box {
	static float length, width, height ;
	void volume() {
		System.out.println(length * width * height);
	}
}