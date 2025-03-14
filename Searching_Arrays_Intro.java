
public class Searching_Arrays_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Create a method checkFor4() that is passed an int array and returns true if that array has a 4 and false if that array has no 4's. 

//  2. Create a method countFor4() that is passed an int array and returns how many times 4 shows up in the array. 

//3. Create a method checkForFour4() that is passed an int array and return true if the array has exactly four 4's in it. 

//Creating new Arrays with different elements 
		int[] array1 = {4, 65, 98, 1, 0, 120};
		int[] array2 = {4, 10, 7, 2, 247, 100};
		int[] array3 = {6, 56, 9, 230, 4, 4 ,4};
		
		System.out.println(checkFor4(array1));
		System.out.println(countFor4(array2, 4));
		System.out.println(checkForFour4(array3));
	}
	//method that checks to see if there are 4's in the array
	public static boolean checkFor4(int [] arr)
	{
		// Loop through the array to check for the presence of 4
	    for(int i = 0; i < arr.length; i++) {
	        if(arr[i] == 4) {
	    // Return true if there are 4's in there, if no 4's then returns false
	        	return true; 
	        }
	    }
	    return false;  
	}
	
	//method that makes the array start from the last number form the original array 
	public static int countFor4 (int[] arr,  int num)
	{
		//sets the counter to 0
				int counter = 0;
			//Loops through the array to count until it can't 
				for(int i = 0; i < arr.length; i++)
				{
					if(arr[i] == num)
					{
			//adds the to the counter
						counter++;
					}
				}
			//returns the total count of the number of the array
				return counter;
	}
	//methois that chekcs if there are 4 4's in the array
	public static boolean checkForFour4(int[] arr)
{
	// Initialize counter to track the number of 4's in the array
		int counter = 0;  
    
    // Loop through the array to count the number of times 4 are there
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == 4) {
    //counter for each time a 4 is found
        	counter++; 
        }
    }
    
    // Return true if there are four 4's, if not then return false
    if (counter == 4) 
    {
        return true;
    	} 
    {
        return false;
    	}
	}
}
