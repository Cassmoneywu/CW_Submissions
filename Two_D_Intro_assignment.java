import java.util.ArrayList;

public class Two_D_Intro_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// question 1: Instantiate a 2-D array gridNums that consists of 4 rows and 6 columns using the new keyword. 
	int[][]	gridNums = new int[4][6];
	

//Question 2: Instantiate a 2-D array with the following values:
	int[][] newGrid= 
	{
		{4,5,7},
		{2,-1,8},
		{0,1,3},
	};
	
fixerUpper(gridNums);
fixerUpper(newGrid);


//Question 3: For both of those arrays, change the element in the first row, first column to a 17.
newGrid[0][0]=17;
gridNums[0][0]=17;
fixerUpper(gridNums);
fixerUpper(newGrid);


//Question 4: For both of those arrays, change the element in the second row, third column into a 20. 
gridNums[1][2]=20;
newGrid[1][2]=20;
fixerUpper(gridNums);
fixerUpper(newGrid);


//Question 5: For both of those arrays, change the last element in the first row to a -5. Accomplish this using .length
gridNums[0][gridNums[0].length-1]=-5;
newGrid[0][newGrid[0].length-1]=-5;
fixerUpper(gridNums);
fixerUpper(newGrid);

//questio 6: change the first elemt in last row
gridNums[gridNums.length-1][0]= -7;
newGrid[newGrid.length-1][0]= -7;
fixerUpper(gridNums);
fixerUpper(newGrid);


//Question 7: last element in the last row to -30
gridNums[gridNums.length-1][gridNums[0].length-1]= -30;
newGrid[newGrid.length-1][newGrid.length-1]= -30;
fixerUpper(gridNums);
fixerUpper(newGrid);


//Question 8:Method that prints out arrays first row
printFirstRow(gridNums);
System.out.println(" ");
printFirstRow(newGrid);

//question 9
System.out.println(" ");
System.out.println(" ");
printFirstColumm(gridNums);
System.out.println(" ");
printFirstColumm(newGrid);


//question 10 row major order 

System.out.println();
System.out.println();
rowMajorOrder(gridNums) ;
rowMajorOrder(newGrid);


//Question 11 columm major order
System.out.println();
System.out.println();
colummMajorOrder(gridNums);
colummMajorOrder(newGrid);
	
	}

	public static void fixerUpper (int[][] arr)
	{
		for(int i = 0; i<=arr.length-1; i++)
		{
			for(int j=0; j<=arr[0].length-1;j++)
			{
			System.out.print(arr[i][j]);
			System.out.print("  ");
			}
		System.out.println();
		}
		
		System.out.println();
	}
	
	// Method to print only the first row of a 2D array
	public static void printFirstRow(int[][] arr)
	{
	// Loops over columns of first row
		for(int i = 0; i<=arr[0].length-1; i++)
		{
			System.out.print(arr[0][i]);
			System.out.print(" ");
		}
	}
	
	// Method to print only the first column of a 2D array
	public static void printFirstColumm(int[][] arr)
	{
	// Loop over rows
		for(int i = 0; i<=arr.length-1; i++)
		{
			System.out.print(arr[i][0]);
			System.out.print(" ");
		}
	}
	// Method to print the array in row-major order basically using the method "fixerUpper" 
	public static void rowMajorOrder (int[][] arr)
	{
		// Loop over each row
		for(int i = 0; i<=arr.length-1; i++)
		{
			// Loop over each column in row
			for(int j=0; j<=arr[0].length-1;j++)
			{
			System.out.print(arr[i][j]);
			System.out.print("  ");
			}
		System.out.println();
		}
		
		System.out.println();
	}
	
	// Method to print the array in column-major order, basically again using "fixerUpper" I just changed and switched j and i
	public static void colummMajorOrder(int[][] arr)
	{
		// Loop over each column
		for(int i = 0; i<=arr[0].length-1; i++)
		{
			// Loop over each row in column
			for(int j=0; j<=arr.length-1;j++)
			{
			System.out.print(arr[j][i]);
			System.out.print("  ");
			}
		System.out.println();
		}
		
		System.out.println();
	}
	
}
