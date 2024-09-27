/**
 * This class is a blueprint that allows us to make sphere objects and defines the behaviors of a square which is a type of rectangle . 
 */
public class Square {


double side;

	//constructor 
	public Square (double s)
	{
	side=s;
	}
	//functionality
	/**
	 * Gives you the side of a square
	 * @return side
	 */
	public double getSide()
	{
	return side;
	}
	
	//area
	/**
	 * Gives you the area of a square
	 * @return area
	 */
	public double getArea()
	{
	return side*side;
	}
	
	//perimiter
	/**
	 * Gives you the perimiter of a square
	 * @return perimiter
	 */
	public double getPerimiter()
	{
	return 4*side;
	
	//volume
	/**
	 * Gives you the volume of a square
	 * @return volume
	 */
	}
	public double getVolume()
	{
	return side*side*side;
	}
	
	/**
	 * Gives you the name of the title for this section
	 * @return "square"
	 */
	public static String getShape()
	{
		return "Square";
	}
	
	public void setSide(double side) 
	{
		this.side = side;
	}
}
