/**
 * This class is a blueprint that allows us to make sphere objects and defines the behaviors of a semi circle which is a type of circle. 
 */
public class SemiCircle {
	//data attributes
	private final double pi=3.14;
	private double radius;
	
	// constructor
	public SemiCircle (double r)
	{
	radius=r;
	}
		
	//functionality
	/**
	 * Gives you the radius of a Semi circle
	 * @return radius
	 */
	public double getRadius()
	{
	return radius;
	
	//area
	/**
	 * Gives you the area of a Semi circle
	 * @return area
	 */
	}	
	public double getArea()
	{
		return pi*radius*radius/2;	
	}
	
	//perimiter
	/**
	 * Gives you the perimiter of a Semi circle
	 * @return perimiter
	 */
	public double getPerimiter()
	{
		return pi*radius+2*radius;	
	}
	
	//volume
	/**
	 * Gives you the volume of a Semi circle
	 * @return volume
	 */
	public double getVolume()
	{
		return radius*radius*radius;
	}
	
	/**
	 * Gives you the name of the title for this sectiojn
	 * @return "Semi Circle"
	 */
	public static String getShape()
	{
		return "SemiCircle";
	}
}
