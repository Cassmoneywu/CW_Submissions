import java.util.Scanner;

/**
 * This class runs a simple invisible maze game.
 * The player moves through a 5x5 grid, avoiding walls and trying to reach the goal at (4,4).
 */
public class Invisable_Maze {
	
 // Scanner that allows the user input from the console
static Scanner myReader = new Scanner (System.in);

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This creates the maze using 2D array by having a (5x5 grid)
		Gane_Tile[][] maze = new Gane_Tile[5][5];
		
		// row 1
		//Creates the first row of the 5x5 grid
		maze[0][0] = new Gane_Tile(true,  true, false);
		maze[0][1] = new Gane_Tile(false, false, true);
		maze[0][2] = new Gane_Tile(false, false, true);
		maze[0][3] = new Gane_Tile(false, false, true);
		maze[0][4] = new Gane_Tile(false, false, true);
		
		
		//row 2
		//Creates the second row of the 5x5 grid
		maze[1][0] = new Gane_Tile(false, false, false);
		maze[1][1] = new Gane_Tile(false, false, true);
		maze[1][2] = new Gane_Tile(false, false, false);
		maze[1][3] = new Gane_Tile(false, false, false);
		maze[1][4] = new Gane_Tile(false, false, false);
		
		
		//row 3
		//Creates the third row of the 5x5 grid
		maze[2][0] = new Gane_Tile(false, false, false);
		maze[2][1] = new Gane_Tile(false, false, true);
		maze[2][2] = new Gane_Tile(false, false, false);
		maze[2][3] = new Gane_Tile(false, false, true);
		maze[2][4] = new Gane_Tile(false, false, false);
		
	
		// row 4 
		//Creates the fourth row of the 5x5 grid
		maze[3][0] = new Gane_Tile(false, false, false);
		maze[3][1] = new Gane_Tile(false, false, true);
		maze[3][2] = new Gane_Tile(false, false, false);
		maze[3][3] = new Gane_Tile(false, false, true);
		maze[3][4] = new Gane_Tile(false, false, false);
		
		
		//row 5
		//Creates the fifth row of the 5x5 grid
		maze[4][0] = new Gane_Tile(false, false, false);
		maze[4][1] = new Gane_Tile(false, false, false);
		maze[4][2] = new Gane_Tile(false, false, false);
		maze[4][3] = new Gane_Tile(false, false, true);
		maze[4][4] = new Gane_Tile(false, false, false);
		
		//These 4 SOP(System.out.print) introduces the game and what the instructions are 
		System.out.println("Hello there welcome to the invible maze");
		System.out.println("The ' P ' will represent you the plyer");
		System.out.println("The ' O ' will represent if there are any open spaces");
		System.out.println("The ' W ' will represent if there is a wall in your way");
		
		// Creates a new player instance
		Player player = new Player();
		
		fixerUpper(maze);
		
		playerMove(maze, player);
	} 
	
	 /**
     * This method allows the actual grid to get displayed with the current state of the maze.
     * It shows the tiles on the grid, whether they are walls, open spaces, or the player's position.
     */
	public static void fixerUpper (Gane_Tile[][] grid)
	{
		for(int i = 0; i<=grid.length-1; i++)
		{
			for(int j=0; j<=grid[0].length-1;j++)
			{
			System.out.print(grid[i][j]);
			System.out.print("  ");
			}
		System.out.println();
		}
		
		System.out.println();
	}
	
	/**
     * This method allows the player to move through the maze by stating whether you want to go up, down, left, right 
     * It checks for boundaries, walls, as well updates the player's current position.
     */
	public static void playerMove(Gane_Tile[][] arr, Player player)
	{
		String move = myReader.next();
		if(move.equals("up"))
		{
	 // Checks if the players move is within boundary and is not into a wall	
			if(player.getX() <= 0)
			{
				System.out.println("bruh why you go so far out of bounds");
			}
			
			else
			{
				if(arr[player.getX()-1][player.getY()].isWall() == true)
				{
					arr[player.getX()-1][player.getY()].setRevealed(true);
					System.out.println("yeaa that spot is a wall womp womp you're still on the exact same space");
				}
				else
				{
	// this updates the player's current position
					arr[player.getX()-1][player.getY()].setRevealed(true);
					arr[player.getX()][player.getY()].setHasPlayer(false);
					arr[player.getX()-1][player.getY()].setHasPlayer(true);
					player.setX(player.getX()-1);
					System.out.println("WOWWWWW you moved finally");
				}
			}
		}
		
		//moves down
		else if(move.equals("down"))
		{
			if(player.getX() >= 4)
			{
				System.out.println("bruh why you go so far out of bounds");
			}
			
			else
			{
				if(arr[player.getX()+1][player.getY()].isWall() == true)
				{
					arr[player.getX()+1][player.getY()].setRevealed(true);
					System.out.println("yeaa that spot is a wall womp womp you're still on the exact same space");
				}
				else
				{
					arr[player.getX()+1][player.getY()].setRevealed(true);
					arr[player.getX()][player.getY()].setHasPlayer(false);
					arr[player.getX()+1][player.getY()].setHasPlayer(true);
					player.setX(player.getX()+1);
					System.out.println(player.getX());
					System.out.println("WOWWWWW you moved finally");
				}
			}
		}
		
	//moves left
		else if(move.equals("left"))
		{
			if(player.getY() <= 0)
			{ 
				System.out.println(player.getY() + " " + player.getX());
				System.out.println("bruh why you go so far out of bounds");
			}
			
			else
			{
				if(arr[player.getX()][player.getY()-1].isWall() == true)
				{
					arr[player.getX()][player.getY()-1].setRevealed(true);
					System.out.println("yeaa that spot is a wall womp womp you're still on the exact same space");
				}
				else
				{
					arr[player.getX()][player.getY()-1].setRevealed(true);
					arr[player.getX()][player.getY()].setHasPlayer(false);
					arr[player.getX()][player.getY()-1].setHasPlayer(true);
					player.setY(player.getY()-1);
					System.out.println("WOWWWWW you moved finally");
				}
			}
		}
		
		//moves right 
		else if(move.equals("right"))
		{
			if(player.getY() >= 4)
			{
				System.out.println("bruh why you go so far out of bounds");
			}
			
			else
			{
				if(arr[player.getX()][player.getY()+1].isWall() == true)
				{
					arr[player.getX()][player.getY()+1].setRevealed(true);
					System.out.println("yeaa that spot is a wall womp womp you're still on the exact same space");
				}
				else
				{
					arr[player.getX()][player.getY()+1].setRevealed(true);
					arr[player.getX()][player.getY()].setHasPlayer(false);
					arr[player.getX()][player.getY()+1].setHasPlayer(true);
					player.setY(player.getY()+1);
					System.out.println("WOWWWWW you moved finally");
				}
			}
		}
		
		else
		{
			System.out.println("bruh you serious try again that direction doesn't exist");
		}
		
		fixerUpper(arr);
		if(player.getX()== 4 && player.getY() == 4)
		{
			System.out.println("OHH? you won? congrats");
		}
		else
		{
	//shows the most up to date position and the most up to date maze 
			playerMove(arr, player);
		}
	}
}

