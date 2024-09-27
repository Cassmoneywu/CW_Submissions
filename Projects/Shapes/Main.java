/**
 * This class is used to print my 6 shapes with their main attributes
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//starts to move onto the first shape which is a circle
		String shape= Circle.getShape();
		System.out.println(shape);
		
		//these lines of coding declares the first circle object as well as declares variables such as: radius,diameter,circumference, area. It's also used for spacing
		Circle circOne=new Circle(3.0);
		System.out.println("circle 1:");
		System.out.println("Radius = " + circOne.getRadius()); 
		System.out.println("Diameter= " + circOne.getDiameter());
		System.out.println("circum= " + circOne.getCircum());
		System.out.println("Area= " + circOne.getArea());
		System.out.println();
		
		//these lines of coding declares the second circle object as well as declares variables such as: radius,diameter,circumference, area. It's also used for spacing
		Circle circTwo=new Circle(20.0);
		System.out.println("circle 2:");
		System.out.println("Radius = " + circTwo.getRadius());
		System.out.println("Diameter= " + circTwo.getDiameter());
		System.out.println("circum= " + circTwo.getCircum());
		System.out.println("Area= " + circTwo.getArea());
		System.out.println();
		
		//these lines of coding declares the third circle object as well as declares variables such as: radius,diameter,circumference, area. It's also used for spacing
		Circle circThree=new Circle(-4.0);
		System.out.println("circle 3:");
		System.out.println("Radius = " + circThree.getRadius());
		System.out.println("Diameter= " + circThree.getDiameter());
		System.out.println("circum= " + circThree.getCircum());
		System.out.println("Area= " + circThree.getArea());
		System.out.println();
		
		//starts to move onto the third shape which is a sphere 
		String shapeTwo= Sphere.getShape();
		System.out.println(shapeTwo);	
		
		//these lines of coding declares the first sphere object as well as declares variables such as: radius,diameter, area, and volume. It's also used for spacing
		Sphere sphereOne=new Sphere(5.0);
		System.out.println("Sphere 1:");
		System.out.println("Radius = " + sphereOne.getSphereRadius());
		System.out.println("Diameter= " + sphereOne.getSphereDiameter());
		System.out.println("Area=" + sphereOne.getSphereArea());
		System.out.println("volume= " + sphereOne.getSphereVolume());
		System.out.println();
		
		//these lines of coding declares the second sphere object as well as declares variables such as: radius,diameter,area, and volume. It's also used for spacing
		Sphere sphereTwo=new Sphere(23.0);
		System.out.println("Sphere 2:");
		System.out.println("Radius = " + sphereTwo.getSphereRadius());
		System.out.println("Diameter= " + sphereTwo.getSphereDiameter());
		System.out.println("Area= " + sphereTwo.getSphereArea());
		System.out.println("volume= " + sphereTwo.getSphereVolume());
		System.out.println();
		
		//these lines of coding declares the third sphere object as well as declares variables such as: radius,diameter, area, and volume. It's also used for spacing
		Sphere sphereThree=new Sphere(23.0);
		System.out.println("Sphere 3:");
		System.out.println("Radius = " + sphereThree.getSphereRadius());
		System.out.println("Diameter= " + sphereThree.getSphereDiameter());
		System.out.println("Area= " + sphereThree.getSphereArea());
		System.out.println("volume= " + sphereThree.getSphereVolume());
		System.out.println();
	
		
		//starts to move onto the third object which is a rectangle  
		String shapeThree= Rectangle.getShape();
		System.out.println(shapeThree);
		
		//these lines of coding declares the first rectangle object as well as declares length, width, area, and perimiter. As well as used for spacing
		Rectangle recOne=new Rectangle(16.0, 7.0);
		System.out.println("Rectangle 1:");
		System.out.println("length = " + recOne.getLength());
		System.out.println("width= " + recOne.getWidth());
		System.out.println("Area= " + recOne.getArea());
		System.out.println("perimiter= " + recOne.getPerimiter());
		System.out.println();
		
		//these lines of coding declares the second rectangle object as well as declares length, width, area, and perimiter. As well as used for spacing
		Rectangle recTwo=new Rectangle(-14.0, 17.0);
		System.out.println("Rectangle 2:");
		System.out.println("length = " + recTwo.getLength());
		System.out.println("width= " + recTwo.getWidth());
		System.out.println("Area= " + recTwo.getArea());
		System.out.println("primiter= " + recTwo.getPerimiter());
		System.out.println();
		
		//these lines of coding declares the third rectangle object as well as declares length, width, area, and perimiter. As well as used for spacing
		Rectangle recThree=new Rectangle(-10.0, -20.0);
		System.out.println("Rectangle 3:");
		System.out.println("length = " + recThree.getLength());
		System.out.println("width= " + recThree.getWidth());
		System.out.println("Area= " + recThree.getArea());
		System.out.println("primiter= " + recThree.getPerimiter());
		System.out.println();
		
		//starts to move onto the fourth shape which is a square
		String shapeFour= Square.getShape();
		System.out.println(shapeFour);
		
		//these lines of coding declares the first square object as well as side, area, perimiter, and volume. As well as used for spacing 
		Square squareOne=new Square(14.7);
		System.out.println("Square 1:");
		System.out.println("side = " + squareOne.getSide());
		System.out.println("Area= " + squareOne.getArea());
		System.out.println("perimiter= " + squareOne.getPerimiter());
		System.out.println("volume= " + squareOne.getVolume());
		System.out.println();
		
		//these lines of coding declares the second square object as well as side, area, perimiter, and volume. As well as used for spacing 
		Square squareTwo=new Square(-30.9);
		System.out.println("Square 2:");
		System.out.println("side = " + squareTwo.getSide());
		System.out.println("Area= " + squareTwo.getArea());
		System.out.println("perimiter= " + squareTwo.getPerimiter());
		System.out.println("volume= " + squareTwo.getVolume());
		System.out.println();
		
		//these lines of coding declares the Third square object as well as side, area, perimiter, and volume. As well as used for spacing 
		Square squareThree=new Square(75.8);
		System.out.println("Square 3:");
		System.out.println("side = " + squareThree.getSide());
		System.out.println("Area= " + squareThree.getArea());
		System.out.println("perimiter= " + squareThree.getPerimiter());
		System.out.println("volume= " + squareThree.getVolume());
		System.out.println();
		
		//starts to move onto the fifth shape which is a Cube
		String shapeFive= Cube.getShape();
		System.out.println(shapeFive);
		
		//these lines of coding declares the first cube object as well as side, surface area, perimiter, and volume. As well as used for spacing 
		Cube cubeOne=new Cube(60.2);
		System.out.println("cube 1:");
		System.out.println("side = " + cubeOne.getSide());
		System.out.println("Surface Area= " + cubeOne.getSurfaceArea());
		System.out.println("perimiter= " + cubeOne.getPerimiter());
		System.out.println("volume= " + cubeOne.getVolume());
		System.out.println();
		
		//these lines of coding declares the second cube object as well as side, surface area, perimiter, and volume. As well as used for spacing 
		Cube cubeTwo=new Cube(25.5);
		System.out.println("cube 2:");
		System.out.println("side = " + cubeTwo.getSide());
		System.out.println("Surface Area= " + cubeTwo.getSurfaceArea());
		System.out.println("perimiter= " + cubeTwo.getPerimiter());
		System.out.println("volume= " + cubeTwo.getVolume());
		System.out.println();
		
		//these lines of coding declares the third cube object as well as side, surface area, perimiter, and volume. As well as used for spacing 
		Cube cubeThree=new Cube(50.0);
		System.out.println("cube 3:");
		System.out.println("side = " + cubeThree.getSide());
		System.out.println("Surface Area= " + cubeThree.getSurfaceArea());
		System.out.println("perimiter= " + cubeThree.getPerimiter());
		System.out.println("volume= " + cubeThree.getVolume());
		System.out.println();

		//starts to move onto the sixth shape which is a semi circle
		String shapeSix= SemiCircle.getShape();
		System.out.println(shapeSix);
		
		//these lines of coding declares the first semi circle object as well as radius, area, perimiter, and volume. As well as used for spacing  
		SemiCircle semiCircleOne=new SemiCircle(21.8);
		System.out.println("SemiCirlce 1:");
		System.out.println("radius = " + semiCircleOne.getRadius());
		System.out.println("Area= " + semiCircleOne.getArea());
		System.out.println("perimiter= " + semiCircleOne.getPerimiter());
		System.out.println("volume= " + semiCircleOne.getVolume());
		System.out.println();
		
		//these lines of coding declares the second semi circle object as well as radius, area, perimiter, and volume. As well as used for spacing  
		SemiCircle semiCircleTwo=new SemiCircle(16.7);
		System.out.println("SemiCirlce 1:");
		System.out.println("radius = " + semiCircleTwo.getRadius());
		System.out.println("Area= " + semiCircleTwo.getArea());
		System.out.println("perimiter= " + semiCircleTwo.getPerimiter());
		System.out.println("volume= " + semiCircleTwo.getVolume());
		System.out.println();
		
		//these lines of coding declares the third semi circle object as well as radius, area, perimiter, and volume. As well as used for spacing  
		SemiCircle semiCircleThree=new SemiCircle(17.9);
		System.out.println("SemiCirlce 3:");
		System.out.println("radius = " + semiCircleThree.getRadius());
		System.out.println("Area= " + semiCircleThree.getArea());
		System.out.println("perimiter= " + semiCircleThree.getPerimiter());
		System.out.println("volume= " + semiCircleThree.getVolume());
		System.out.println();
		
		
		System.out.println(circOne.toString());	
		System.out.println(circTwo.toString());	
		System.out.println(circThree.toString());	
		}

}
