import java.util.ArrayList;

public class Coverting_array_algs_to_Array_list_algs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Create a method checkFor4() that is passed an ArrayList and returns the index of the first 4 if that array has a 4 and -1 if that array has no 4's. 
		//2. Create a method ridAllFives() that is passed an ArrayList nums and altars that ArrayList without returning anything. The ArrayList will have any 5’s deleted from nums.
		//Ex: 
		//subtract5FromAll4( {5, 5, 0, 8, 5, 20}  )   -------turns nums into----->     {0, 8, 20}
		//3. Create a method bubbleSort() that is passed an ArrayList and sorts it using bubblesort.
		
		//Creates new ArrayLists
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
	//sets elements in the first arrayList
		arrayList1.add(0);
		arrayList1.add(7);
		arrayList1.add(0);
		arrayList1.add(4);
		arrayList1.add(67);
		arrayList1.add(80);
//sets elements in the second arrayList
		arrayList2.add(67);
		arrayList2.add(90);
		arrayList2.add(3);
		arrayList2.add(98);
		arrayList2.add(5);
		arrayList2.add(2);

  //sets elements in the third arrayList
		arrayList3.add(61);
		arrayList3.add(62);
		arrayList3.add(17);
		arrayList3.add(98);
		arrayList3.add(45);
		arrayList3.add(1);
		
		System.out.println(checkFor4(arrayList1));
		ridAllFives(arrayList2);
		System.out.println(arrayList2);
		bubbleSort(arrayList3);
		System.out.print(arrayList3);
	}
//this method checks for 4's
 public static int checkFor4(ArrayList <Integer>arr)
 { 
	//loops until it doesn't have any more elements to check
	for(int i = 0; i<arr.size(); i++)
	{
		//This is to check If there is a 4 then it is true
		if(i==4)
		{
			//returns where the 4 is located in the index
			return arr.indexOf(i);
		}
	}
	//returns a negative because there is not a 4 in the arrayList.
	return -1;
 }
 
 //This method get rid of the 5's completely  from the array 
 public static void ridAllFives(ArrayList <Integer>arr)
 {
	 for(int i = 0; i<arr.size(); i++)
	 {
		 //checks if 5 is in the arrayList
		 if(arr.get(i)== 5)
		 {
	//finds it gets rid of it
			 arr.remove(i);
			 i--;
		 }
	 }
 }
 
 //Method to turn bubblesort into arrayList
 public static void bubbleSort(ArrayList <Integer>arr)
	{
	
	//Initializes the counter to 3
		int counter = 3;
		
	//This is what loops the code until no swaps are no longer needed, then it is completely sorted the right way
		while(counter !=0)
		{
			
	// this resets the counter to 0 
			counter = 0;
			for(int i = 0; i<arr.size()-1; i++)
			{
	// If the current element is greater than the next element, then you swap them
				if(arr.get(i) > arr.get(i+1))
				{
	// Swap the numbers using a temporary variable
					int temp = arr.get(i);
					arr.set(i,  arr.get(i+1));
					arr.set(i+1, temp);
	
	// counter that keeps count
					counter++;
				}
			}
		}
	
	}
 

}
