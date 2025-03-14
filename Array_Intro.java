
public class Array_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//question 1
	// Creates an empty array that is meant to represent double
		int[] numArr; {};
		boolean[] booleanArr;{};
		String [] stringArr;{};
		//circle[]  circleArr;{};
		
	// question 2
	//Create an array of ints with the following represented values: 7, -12, 88, -88, 0, 5, 2000.
		int[] numArr2={ 7, -12, 88, -88, 0, 5, 2000};
		System.out.println(numArr2[0]);
		System.out.println(numArr2[numArr2.length-1]);
	
		
	//Question 3
	//Creates an array that represents 5 String objects w/ default values.
		String [] fruitsArr = new String[5];
		
	//question 4
	//Changes the 2nd element in fruitsArr to "Bapple" 
	fruitsArr[1]= "Bapple";
	
	//question 5
	//Changes the last element in fruitsArr to "Zanana" .
	fruitsArr[fruitsArr.length-1 ] = "Zanana";
	
	
	//question 6
	//this is to check if I did the code right
	System.out.println(fruitsArr[1]);
	
	//Question 7
	
	System.out.println();
	for(int i = 0; i<fruitsArr.length; i++)
	{
		System.out.println(fruitsArr[i]);
	}
	
	}
}
