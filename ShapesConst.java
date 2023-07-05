public class ShapesConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(7);
		Triangle t1 = new Triangle(4,9);
		Rectangle r1 = new Rectangle(5,12);
		
		System.out.println("Circle area: "+ c1.area());
		System.out.println("Circle circumference: "+ c1.circumference());
		System.out.println("Triangle area: "+ t1.area());
		System.out.println("Rectangle area: "+ r1.area());
		System.out.println("Rectangle parameter: "+ r1.parameter());
		
	}
	
	public static class Circle{
		static double r;
		Circle(double radius){
			r = radius;
		}
		public double area() {
			return 3.14 * r * r;
		}
		public double circumference() {
			return 2 * 3.14 * r;
		}
		
	}
	
	public static class Triangle{
		static double b;
		static double h;
		Triangle(double base, double height){
			b = base;
			h = height;
		}
		
		public double area() {
			return 0.5*b*h;
		}
		public double thirdSides() {
			return Math.pow(b*b + h*h, 0.5);
		}
		public double parameter() {
			return Math.pow(b*b + h*h, 0.5) + b + h;
		}
	}
}

class  Rectangle {
	static double l;
	static double b;
	Rectangle(double length, double breadth){
		l = length;
		b = breadth;
	}
	public double area() {
		return l*b;
	}
	public double parameter() {
		return 2*(l+b); 
	}

}
