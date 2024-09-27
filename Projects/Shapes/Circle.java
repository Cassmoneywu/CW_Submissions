/**
 * This class is a blueprint that allows us to make circle objects and defines the behaviors of a circle. 
 */
public class Circle {
	
	//data attributes
	private final double pi=3.14;
	private double radius;
	
	
	// constructor
	public Circle (double r)
	{
	radius=r;
	}
	
	//functionality
	/**
	 * Gives you the radius of a circle
	 * @return radius
	 */
	public double getRadius()
	{
		return radius;
	}
	
	//diameter 
	/**
	 * Gives you the diameter of a circle
	 * @return diameter
	 */
	public double getDiameter()
	{
		return 2*radius;
	}

	//Circumference 
	/**
	 * Gives you the circumference of a circle
	 * @return circumference
	 */
	public double getCircum()
	{
		return 2*pi*radius;
	
	}
	//Area
	/**
	 * Gives you the area of a circle
	 * @return area
	 */
	public double getArea()
	{
		
		return pi*radius*radius;
	
	}
	/**
	 * gives you the title of the section
	 * @return "circles"
	 */
	public static String getShape() 
	{
		return "circles";
	}

	/**
	 * this turns everything about the circle object into a String
	 */
	public String toString()
	{
		return "this is a circle with radius" + radius + "and an area of "+ getArea() + "and circumference of" + getCircum() + ".";			
		
	}
	public void setRadius(double r)
	{ 
		radius =r;
	}

} 

