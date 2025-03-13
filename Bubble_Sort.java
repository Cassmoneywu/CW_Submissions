
public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// gives the array values that are unsorted 
	int [] array1= {20, 19, 9, 89, 70, 10, 100};
	
	bubbleSort(array1);
	
	//This prints the array with the bubblesort method
	for(int i = 0; i<array1.length; i++)
	{
		System.out.println(array1[i]);
	}
		
}
	//This is the method that is created to make bubble sort work
	public static int [] bubbleSort(int [] nums)
	{
	
	//Initializes the counter to 3
		int counter = 3;
		
	//This is what loops the code until no swaps are no longer needed, then it is completely sorted the right way
		while(counter !=0)
		{
			
	// this resets the counter to 0 
			counter = 0;
			for(int i = 0; i<nums.length-1; i++)
			{
	// If the current element is greater than the next element, then you swap them
				if(nums[i] > nums[i+1])
				{
	// Swap the numbers using a temporary variable
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
	
	// counter that keeps count
					counter++;
				}
			}
		}
	// returns the array that is sorted correctly
		return nums;
	
	}
}
