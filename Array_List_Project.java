import java.util.ArrayList;
public class Array_List_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
	ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
	ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
	
	arrayList1.add(5);
	arrayList1.add(5);
	arrayList1.add(10);
	arrayList1.add(96);
	arrayList1.add(67);
	arrayList1.add(15);

	arrayList2.add(67);
	arrayList2.add(90);
	arrayList2.add(3);
	arrayList2.add(98);
	arrayList2.add(5);
	arrayList2.add(2);
	
	arrayList3.add(61);
	arrayList3.add(62);
	arrayList3.add(17);
	arrayList3.add(98);
	arrayList3.add(45);
	arrayList3.add(1);
	
	//Calling the methods and printing the results using arrayList1
	System.out.println(smallNum(arrayList1));
	
	
	System.out.println(smallNumIndex(arrayList1));
	
	
	System.out.println(numAverage(arrayList1));
	
	
	System.out.println(numEven(arrayList1));
	
	
	fixerUpper((consecFive(arrayList1)));
	
	
	System.out.println();
	

//Calling the methods and printing the results using arrayList2
	System.out.println(threeCnsecNums(arrayList2));
	
	
	System.out.println(certainAmount(arrayList2, 2));
	
	
	fixerUpper((backwardsVers(arrayList2)));
	
	
	System.out.println();
	

//Calling the methods and printing the results using arrayList3
	fixerUpper((shiftRight(arrayList3)));
	
	
	System.out.println();
	
	
	fixerUpper((selectionSort(arrayList3)));
	

	}
	public static void fixerUpper (ArrayList <Integer>arr)
	{
		for(int i = 0; i<arr.size(); i++)
		{
			System.out.print(arr.get(i));
			System.out.print(", ");
				
		}
	}
	// Method to find the smallest number in an array
	public static int smallNum(ArrayList <Integer>arr)
	{
	//checks the first element and declares it as the smallest 
		int small = arr.get(0);
	//checks the element to see if it's smaller than the next one 
		for(int i = 0; i<arr.size(); i++)
		{
	//once it finds the smallest number that is the newest i
			if(small>arr.get(i))
			{
				small = arr.get(i);
			}
		}
	// Return the smallest number
		return small;
	}
	
    // Method to find the index of the smallest number in an array
	public static int smallNumIndex (ArrayList <Integer> arr)
	{
	//begins with the smallest number as the first element
		int small = arr.get(0);
	//begins with the index of the smallest number
		int index = 0;
		for(int i = 0; i<arr.size(); i++)
		{
			if(small>arr.get(1))
			{
	// Update smallest number
				small = arr.get(1);
	// Update index when a smaller number is found
				index = i;
			}
		}
	// Return the index of the smallest number
		return index;
	}
	
	// Method to calculate the average of the numbers in an array
	public static double numAverage (ArrayList <Integer> arr)
	{
	// starts with setting the sum to 0
		double sum = 0;
		for(int i = 0; i< arr.size(); i++)
		{
	// Adds each number to the sum
			sum += arr.get(i);
		}
	// Return the average
		return sum/arr.size();
	}

	// Method to check if all numbers in an array are even
	public static boolean numEven(ArrayList <Integer> arr)
	{
	// creates a counter for even numbers
		int counter = 0;
		for(int i = 0; i<arr.size(); i++)
		{
	// Check if the number is even by using module
			if(arr.get(i)%2 == 0)
			{
				counter++;
			}
	// If all numbers are even then if it is then it returns true if not then it returns false
			if(counter == arr.size())
			{
				return true;
			}
		}
		return false;
		
	}
	
	// Method to change consecutive 5's in the array to 0's
	public static ArrayList <Integer> consecFive (ArrayList <Integer> arr)
	{
	// this loops through the array until it is not true 
		for(int i = 0; i < arr.size(); i++)
		{
	// If two consecutive 5's are found
			if(arr.get(i) == 5 && arr.get(i +1 ) == 5)
			{
	// Change the current 5 to 0, as well as changes the next number right after that too 0, only if it's a 5
				arr.set(i, 0);
				arr.set(i + 1, 0);
			
			}
		}
	// Return the new and changed array
		return arr;
	}
	
    // Method to check if there are three consecutive equal numbers in an array
	public static boolean threeCnsecNums (ArrayList <Integer> arr)
	{
	// this loops through the array, making sure that there are at least 3 elements
		for(int i = 0; i < arr.size()-2; i++)
		{
			if(arr.get(i) == arr.get(i +1) &&  arr.get(i) == arr.get(i+2))
			{
	// Return true if three consecutive elements are there
				return true;
			}
					
		}
	//returns false if not 
		return false;
	}
	
	//Method that is the certain amount
	public static int certainAmount (ArrayList <Integer> arr, int num)
	{	
		//sets the counter to 0
		int counter = 0;
		//Loops through the array to count until it can't 
		for(int i = 0; i < arr.size(); i++)
		{
			if(arr.get(i) == num)
			{
				//adds the to the counter
				counter++;
			}
		}
		//returns the total count of the number of the array
		return counter;
	}
	
	//method that makes the array start from the last number form the original array 
	public static ArrayList<Integer> backwardsVers (ArrayList<Integer> arr)
	{
		//Loops through the first half of the array to reverse it
		for(int i = 0; i < arr.size()-(arr.size()/2); i++)
		{
			// Swaps the elements  around the center
			int temp = arr.get(i);
			arr.set(i, arr.get(arr.size()-i-1));
			arr.set(arr.size()-i-1, temp);
		}
		
		// Returns the new array
		return arr;
	}
	
	//shifts all the elements that's in the array to the right
	public static ArrayList<Integer> shiftRight (ArrayList<Integer> arr)
	{
	//Shifts everything to the right by just moving the last element to the first element index
		arr.add(0, arr.remove(arr.size()-1));
		return arr;
		
	}
	
	//this method takes the smallest element and compares it to the next 
	public static ArrayList<Integer> selectionSort(ArrayList<Integer>arr)
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
			for(int i = counter; i<arr.size(); i++)
			{
	// If the current element is smaller than the element at the 'counter' position
				if(arr.get(counter) >= arr.get(i))
				{
	// Swap the two elements
					int temp = arr.get(i);
					arr.set(i, arr.get(counter));
					arr.set(counter, temp);
	// Set it to false, indicating that a swap did in fact occurred
			move = false;
				}
				
			}
			counter++;
		}
		return arr;
	}
}

