
public class Algorithms_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// Setting up multiple arrays to be used for the different methods
		int[] array1 = {9, 10, 7, 2, 16, 100, 5 ,5};
		
		int[] array2= { 3, 3 ,3, 6, 9, 0, 40};
		
		int[] array3= {9, 6, 6, 0, 41, 200};
		
		int[] array4= {90, 10, 1, 9, 96, 16, 19, 20};
		
	//Calling the methods and printing the results using array1
		System.out.println(smallNum(array1));
		
		
		System.out.println(smallNumIndex(array1));
		
		
		System.out.println(numAverage(array1));
		
		
		System.out.println(numEven(array1));
		
		
		fixerUpper((consecFive(array1)));
		
		
		System.out.println();
		
	
	//Calling the methods and printing the results using array2
		System.out.println(threeCnsecNums(array2));
		
		
		System.out.println(certainAmount(array2, 3));
		
		
		fixerUpper((backwardsVers(array2)));
		
		
		System.out.println();
		

	//Calling the methods and printing the results using array3
		fixerUpper((shiftRight(array3)));
		
		
		System.out.println();
		
	
	//Calling the methods and printing the results using array4		
		fixerUpper((selectionSort(array4)));
	}
	

	
	public static void fixerUpper (int[] arr)
	{
		for(int i = 0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
			System.out.print(", ");
		}
	}
	
	// Method to find the smallest number in an array
	public static int smallNum(int[] arr)
	{
	//checks the first element and declares it as the smallest 
		int small = arr[0];
	//checks the element to see if it's smaller than the next one 
		for(int i = 0; i<arr.length; i++)
		{
	//once it finds the smallest number that is the newest i
			if(small>arr[i])
			{
				small = arr[i];
			}
		}
	// Return the smallest number
		return small;
	}
	
    // Method to find the index of the smallest number in an array
	public static int smallNumIndex (int [] arr)
	{
	//begins with the smallest number as the first element
		int small = arr[0];
	//begins with the index of the smallest number
		int index = 0;
		for(int i = 0; i<arr.length; i++)
		{
			if(small>arr[i])
			{
	// Update smallest number
				small = arr[i];
	// Update index when a smaller number is found
				index = i;
			}
		}
	// Return the index of the smallest number
		return index;
	}
	
	// Method to calculate the average of the numbers in an array
	public static double numAverage (int [] arr)
	{
	// starts with setting the sum to 0
		double sum = 0;
		for(int i = 0; i< arr.length; i++)
		{
	// Adds each number to the sum
			sum += arr[i];
		}
	// Return the average
		return sum/arr.length;
	}

	// Method to check if all numbers in an array are even
	public static boolean numEven(int [] arr)
	{
	// creates a counter for even numbers
		int counter = 0;
		for(int i = 0; i<arr.length; i++)
		{
	// Check if the number is even by using module
			if(arr[i]%2 == 0)
			{
				counter++;
			}
	// If all numbers are even then if it is then it returns true if not then it returns false
			if(counter == arr.length)
			{
				return true;
			}
		}
		return false;
		
	}
	
	// Method to change consecutive 5's in the array to 0's
	public static int[] consecFive (int[] arr)
	{
	// this loops through the array until it is not true 
		for(int i = 0; i < arr.length; i++)
		{
	// If two consecutive 5's are found
			if(arr[i] == 5 && arr[i +1 ] == 5)
			{
	// Change the current 5 to 0, as well as changes the next number right after that too 0, only if it's a 5
				arr[i] = 0;
				arr[i+1] = 0;
			
			}
		}
	// Return the new and changed array
		return arr;
	}
	
    // Method to check if there are three consecutive equal numbers in an array
	public static boolean threeCnsecNums (int [] arr)
	{
	// this loops through the array, making sure that there are at least 3 elements
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == arr [i +1] &&  arr[i] == arr[i+2])
			{
	// Return true if three consecutive elements are there
				return true;
			}
	//returns false if not	
		}
		return false;
	}
	//Method that is the certain amount
	public static int certainAmount (int [] arr, int num)
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
	//method that makes the array start from the last number form the original array 
	public static int[] backwardsVers (int[] arr)
	{
	//Loops through the first half of the array to reverse it
		for(int i = 0; i < arr.length-(arr.length/2); i++)
		{
	// Swaps the elements  around the center
			int temp = arr[i];
			arr[i] = arr[arr.length -i -1];
			arr[arr.length -i -1] = temp;	
			
		}
	// Returns the new array
		return arr;
	}
	
	//shifts all the elements that's in the array to the right
	public static int[] shiftRight (int[] arr)
	{
	//Creates a copy of the original array
		int[] copyArr = new int [arr.length];
	// Copy's all elements to the new array
		for(int i = 0; i < arr.length; i++)
		{
			copyArr[i] = arr[i];
		}
	//Stores the last element to move it to the front
		int temp = arr[arr.length-1];
	// Shift all elements to the right
		for(int i = 0; i < arr.length-1; i++)
		{
	//Moves each element one position to the right
			arr[i+1] = copyArr[i];
		}
	// Sets the last element to the first position
		arr[0] = temp;
	// Returns the shifted array
		return arr;
		
	}
	//this method takes the smallest element and compares it to the next 
	public static int [] selectionSort(int[] arr)
	{
	//makes a counter and sets it to 0
		int counter = 0;
	//check sif any elements were swapped during a pass
		boolean move = false;
	//Continues looping until no elements are swapped
		while(move == false)
		{
	//no swaps have occurred
			move = true;
			for(int i = counter; i<arr.length; i++)
			{
	// If the current element is smaller than the element at the 'counter' position

				if(arr[counter] >= arr[i])
				{
	// Swap the two elements
					int temp = arr[i];
					arr[i] = arr[counter];
					arr[counter] = temp;
	//// Set it to false, indicating that a swap did in fact occurred
					move = false;
					
				}
				
			}
	//Moves to the next index to continue sorting
			counter++;
		}
	//returns the new array
		return arr;
	}
}
