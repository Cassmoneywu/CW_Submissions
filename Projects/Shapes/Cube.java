/**
 * This class is a blueprint that allows us to make sphere objects and defines the behaviors of a cube. 
 */
public class Cube {
	double side;

	//constructor 
	public Cube (double s)
	{
	side=s;
	}
	
	//functionality
	/**
	 * Gives you the side of a cube
	 * @return side
	 */
	public double getSide()
	{
	return side;
	}
	
	//surface Area
	/**
	 * Gives you the surface area of a cube
	 * @return surface area
	 */
	public double getSurfaceArea()
	{
	return 6*(side*side);
	}
	
	//perimiter
	/**
	 * Gives you the perimiter of a cube
	 * @return perimiter
	 */
	public double getPerimiter()
	{
	return 12*side;
	}
	
	//volume
	/**
	 * Gives you the volume of a cube
	 * @return volume
	 */
	public double getVolume()
	{
	return side*side*side;
	}
	
	/**
	 * Gives you the title of the section 
	 * @return "cube"
	 */
	public static String getShape()
	{
		return "Cube";
	}
}
