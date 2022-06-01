
public class Task01 {

	public static void main(String[] args) {
		Circle C = new Circle(2);
		Rectangle R = new Rectangle(4,10);
		Triangle T = new Triangle(10,5);
		Square S = new Square(2);
		R.genereatearea();
		T.genereatearea();
		C.genereatearea();
		S.genereatearea();
	}

}


abstract class Shape{
	abstract void genereatearea();
}

class Circle extends Shape{
	private double radius,area;
	
	Circle(){}
	Circle(double x)
	{
		radius = x;
	}
	void genereatearea(){
		area = 3.142 * (radius * radius);
		System.out.println("Area of Circle: " + area);
	}
}

class Triangle extends Shape{
	 double height, base,area;
	 Triangle(){}
	 Triangle(double x, double y)
	 {
		 height = x;
		 base = y;
	 }
	void genereatearea(){
			area = (base*height)/2;
			System.out.println("Area of Triangle: " + area);
	}	
}

class Rectangle extends Shape{
	protected double width, length,area;
	Rectangle(){}
	Rectangle(double x, double y)
	{
		width = x;
		length = y;
	}
	void genereatearea(){
			area = width * length;
			System.out.println("Area of Rectangle: " + area);
	}
	void genereatearea1(){
		area = width * length;
		System.out.println("Area of Square: " + area);
}
}

class Square extends Rectangle{
	Square(double x)
	{
		super(x,x); 
	}
	void CheckSides()
	{
		if(width==length)
		{
			area = width * length;
		}
	}
	void genereatearea(){
		CheckSides();
		System.out.println("Area of Square: " + area);
	}
	
}
	