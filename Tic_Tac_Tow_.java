//Import Scanner class for user input
import java.util.Scanner; 

//Main class for Tic Tac Toe game
public class Tic_Tac_Tow {
	
// Create Scanner object to read user input from the console
static Scanner myReader = new Scanner(System.in);

// A counter to keep track of the number of moves (used to check for tie)
static int tieCheck = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
String[][] grid= 
	{
			
// Create and makes a 3x3 grid with all spots set to "*"
		{ " * ",  " * ", " * " },
		{ " * ",  " * ", " * " },
		{ " * ",  " * ", " * " }
		
	};

// Prints game introduction
	System.out.println("Hello welcome to tic tac Tow, make sure u have 2 players and start the game");
	System.out.println("Player 1 you will be X");
	System.out.println("player 2 you will be O ");

// Displays the empty grid
	fixerUpper(grid);
	
// Starts the game off with Player 1
	xRow(grid);
	
	}
// This method prints the current state of the game
	public static void fixerUpper (String[][] grid)
	{
		// Loops through each row
		for(int i = 0; i<=grid.length-1; i++)
		{
			// Loop through each column
			for(int j=0; j<=grid[0].length-1;j++)
			{
			System.out.print(grid[i][j]);
			 // Print spacing between lines/spots
			System.out.print("  ");
			}
		System.out.println();
		}
		
		System.out.println();
		
	} 
	
	// Asks Player 1 for which row to place an "X"
	public static void xRow(String [][] arr)
	{
		System.out.println("player 1 which row do you want to put X in");
		int row = myReader.nextInt();
		myReader.nextLine();
		if(row>3 || row<1)
		{
			System.out.println("ayo that row doesn't exis try again :(");
			xRow(arr);
		}
		else
		{
			xColumm(arr, row);
		}
	}
	 
	// Asks Player 1 for the column to place an "X"
	public static void xColumm(String[][] arr, int row)
	{
		System.out.println("player 1 which columm do you want to put X in");
		int columm = myReader.nextInt();
		myReader.nextLine();
		if(columm>3 || columm<1)
		{
			System.out.println("ayo that colummm doesn't exis try again :(");
			xRow(arr);
		}
		else if(arr[row-1][columm-1] == " X " || arr[row-1][columm-1] == " O " )
		{
			System.out.println("are u serious that spot is take, try again");
			xRow(arr);
		}
		else
		{
			tieCheck++;
			arr[row-1][columm-1] = " X ";
			fixerUpper(arr);
			
			if(!endGame (arr))
			{
			oRow(arr);
			}
		}
	}
	
	// Asks Player 2 for the row to place an "O"
	public static void oRow(String [][] arr)
	{
		System.out.println("player 2 which row do you want to put ) in");
		int row = myReader.nextInt();
		myReader.nextLine();
		if(row>3 || row<1)
		{
			System.out.println("ayo that row doesn't exis try again :(");
			oRow(arr);
		}
		else
		{
			oColumm(arr, row);
		}
	}
	
	// Asks Player 2 for the column to place an "O"
	public static void oColumm(String[][] arr, int row)
	{
		System.out.println("player 2 which columm do you want to put O in");
		int columm = myReader.nextInt();
		myReader.nextLine();
		if(columm>3 || columm<1)
		{
			System.out.println("ayo that colummm doesn't exis try again :(");
			oRow(arr);
		}
		else if(arr[row-1][columm-1] == " X " || arr[row-1][columm-1] == " O " )
		{
			System.out.println("are u serious that spot is take, try again");
			oRow(arr);
		}
		else
		{
			tieCheck++;
			arr[row-1][columm-1] = " O ";
			fixerUpper(arr);
			
			
			if(!endGame(arr))
			{
				xRow(arr);
			}
		}
	}
	
	// Checks if the game has ended (win or tie)
	public static boolean endGame(String[][] arr)
	{
		// Checks for vertical wins
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[0][i] == " X " && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
			{
				System.out.println("OOP player 1 won hehe");
				return true;

			}
			else if(arr[0][i] == " O " && arr[0][i] == arr[1][i] && arr[1][i] == arr[2][i])
			{
					System.out.println("OOP player 2 won hehe");
					return true;
			}
		}
		// Checks horizontal wins
		for(int i = 0; i<arr.length; i++)
		{
			
			 // Checks for diagonal win (top-left to bottom-right)
			if(arr[i][0] == " X " && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
			{
				System.out.println("OOP player 1 won hehe");
				return true;

			}
			else if(arr[i][0] == " O " && arr[i][0] == arr[i][1] && arr[i][1] == arr[i][2])
			{
					System.out.println("OOP player 2 won hehe");
					return true;
			}
		}
		
		 // Checks for diagonal win (bottom-left to top-right)
		if(arr[2][0] == " X " && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
		{
			System.out.println("OOP player 1 wins");
			return true;
		}
		else if(arr[2][0] == " O " && arr[2][0] == arr[1][1] && arr[1][1] == arr[0][2])
		{
			System.out.println("OOP player 2 wins");
			return true;
		}
		
		else if(arr[0][0] == " X " && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
		{
			System.out.println("OOP player 1 wins");
			return true;
		}
		else if(arr[0][0] == " O " && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2])
		{
			System.out.println("OOP player 2 wins");		
			return true;
		}
		
		// If all cells are filled and no winner, it's a tie
		if(tieCheck == 9)
		{
			System.out.println("erm thats a tie smh");
			return true;
		}
		
		return false;
	}

}
