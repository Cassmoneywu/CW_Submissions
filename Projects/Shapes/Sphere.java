/**
 * This class is a blueprint that allows us to make sphere objects and defines the behaviors of a sphere which is a type of circle . 
 */
public class Sphere {
	private final double pi=3.14;
	private double radius;
		
	// constructor	
	public Sphere (double r)
	{
		radius=r;
	}
	//functionality
	/**
	 * Gives you the radius of a sphere
	 * @return radius
	 */
	public double getSphereRadius()
	{
		return radius;
	}
	//diameter 
	/**
	 * Gives you the diameter of a sphere
	 * @return diameter
	 */
	public double getSphereDiameter()
	{
	return 2*radius;
	}
		
	//Area
	/**
	 * Gives you the area of a sphere
	 * @return area
	 */
	public double getSphereArea()
	{
			
	return 4*pi*radius*radius;

	}
	//volume
	/**
	 * Gives you the volume of a sphere
	 * @return volume
	 */
	public double getSphereVolume()
	{
				
	return (4/3)*pi*radius*radius*radius;
			
	}
	/**
	 * Gives you the title of the section
	 * @return "sphere"
	 */
	public static String getShape() 
	{
		return "Spheres";
	}
	

}
