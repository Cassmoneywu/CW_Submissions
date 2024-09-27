/**
 * This class is a blueprint that allows us to make sphere objects and defines the behaviors of a rectangle. 
 */
public class Rectangle {
	double length;
	double width;
	
	//constructor
	public Rectangle (double l, double w)
	{
		length=l;
		width=w;
	}
	public Rectangle(double s)
	{
		length=s;
		width=s;
	}
	
	//functionality
	/**
	 * Gives you the length of a rectangle
	 * @return length
	 */
	public double getLength()
	{
		return length;
	
	//width
	/**
	 * Gives you the width of a rectangle
	 * @return width
	 */
	}
	public double getWidth()
	{
		return width;
	}
	
	//Area
	/**
	 * Gives you the area of a rectangle
	 * @return area
	 */
	public double getArea()
	{
		return length*width;
	}
	
	//perimiter
	/**
	 * Gives you the perimiter of a rectangle
	 * @return perimiter
	 */
	public double getPerimiter()
	{
		return 2*(length+width);
	}
	
	/**
	 * Gives you the name of the title for this section
	 * @return "rectangle"
	 */
	public static String getShape()
	{
		return "Rectangle";
	}
}
