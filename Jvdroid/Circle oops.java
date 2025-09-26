import java.awt.Point;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Circle c1 = new Circle();
		c1.setRadius(5);
		c1.setCenter(new Point(1, 2));
		System.out.println("Area of c1 is : " + c1.getArea() + "  \nAnd perimeter is " + c1.getPerimeter());
		Circle c2 = new Circle(new Point(2, 2), 10);
		System.out.println("Area of c2 is : " + c2.getArea() + " \nAnd perimeter is " + c2.getPerimeter());
	}
	public static class  Circle {
		Point center ;
		double radius ;
		Circle() {}
		Circle(Point center, double radius) {
			this.center = center ;
			this.radius = radius ;
		}
		void setRadius(double radius) {
			this.radius = radius ;
		}
		void setCenter(Point center) {
			this.center = center ;
		}
		double getPerimeter() {
			return 2 * Math.PI * this.radius;
		}
		double getArea() {
			return  Math.PI * this.radius * this. radius ;

		}
	}
}
