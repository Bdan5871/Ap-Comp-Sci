import java.util.*;
public class TestCircle
{
	public static void main(String[] args)
	{
		ArrayList<Circle> circles = new ArrayList<Circle>();
		/*Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle circle3 = new Circle();
		Circle circle4 = new Circle(6);
		circle1.setRadius(2);
		circle2.setRadius(20);
		circle1.computeArea();
		circle2.computeArea();
		circle3.computeArea();
		circle4.computeArea();
		circle1.computeDiameter();
		circle2.computeDiameter();
		circle3.computeDiameter();
		circle4.computeDiameter();
		System.out.println(circle1);
		System.out.println(circle2);
		System.out.println(circle3);
		System.out.println(circle4);*/
		for(int i = 0; i < 5; i++)
		{
			circles.add(new Circle((int)(Math.random()*21)+20));
		}
		for(Circle c : circles)
		{
			c.computeArea();
			c.computeDiameter();
		}
		System.out.println(circles);
	}
}

class Circle
{
	private double radius;
	private double area;
	private double diameter;
	
	public Circle()
	{
		radius = 1;
		area = 0;
		diameter = 0;
	}
	public Circle(double num)
	{
		radius = num;
		area = 0;
		diameter = 0;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void computeDiameter()
	{
		diameter = radius * 2;
	}
	public void computeArea()
	{
		area = Math.pow(radius, 2) * Math.PI;
	}
	public String toString()
	{
		return "The radius is " + radius + "\nThe diameter is " + diameter + "\nThe area is " + area;
	}
}