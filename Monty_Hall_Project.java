import java.util.Scanner;

public class Monty_Hall 
{
	static Scanner myReader = new Scanner(System.in);
	public static void main(String[] args) {
	
	int winDoor = pickRandomDoor();
	int playerDoor = pickPlayerDoor();
	int revealDoor = revealWrongDoor(winDoor , playerDoor);
	System.out.println(playerDoor);
    System.out.println("You picked door: " + playerDoor);
    System.out.println("The host reveals door: " + revealDoor);
    System.out.print("Do you want to switch doors? (yes/no): ");
    //String switchDecision = myReader.next();
    playerSwitch(winDoor, playerDoor);
    myReader.close();
    
      


	}
	
	//this makes the game pick a random door to open
	private static int pickRandomDoor() 
	{
		return((int)(Math.random()*3+1));
	
	}
	
	//this method allows the person to choose their door 
	public static int pickPlayerDoor()
	{
		
		String playerDoor = new String(myReader.next());
		//myReader.close();
		
		if(playerDoor.equals("one") || playerDoor.equals("1"))
		{
			return 1;
		}
		
		if (playerDoor.equals("two") || playerDoor.equals("2"))
		{
			return 2;
		}
		
		if (playerDoor.equals("three") || playerDoor.equals("3"))
		{
			return 3;
		}
	
		else
		{
			System.out.print("Run code again");
			return 0;
		}
	}
	
	//This method reveals the chances of getting the wrong door 
	public static int revealWrongDoor(int playerDoor, int winDoor) 
	{
		int coinFlip = (int)(Math.random() * 2);
		
		if(playerDoor == 1 && winDoor == 2 )
		{
			return 3;
		}
		else if(playerDoor == 1 && winDoor == 1 )
		{
			return((int)(Math.random()*2+2));
		}
		else if(playerDoor == 1 & winDoor == 3 )
		{
			return 2;
		}
		else if(playerDoor == 2 && winDoor == 1)
		{
			return 3;
		}
		else if(playerDoor == 2 && winDoor == 3 )
		{
			return 1;
		}
		else if(playerDoor == 2 && winDoor == 2)
		{	
			if(coinFlip == 0)
			{
				return 3;
			}
			else 
			{
				return 1;
			}
		}
		else if(playerDoor == 3 && winDoor == 1)
		{
			return 2;
		}
		else if(playerDoor == 3 && winDoor == 2)
		{
			return 1;
		}
		else if(playerDoor == 3 && winDoor == 3)
		{
			return((int)(Math.random()*2+1));
		}
		
		return 0;
		
	}
	
	// This method allows the player to switch door if they want to
	public static void playerSwitch(int winDoor, int playerDoor)
	{
		String playerInput = new String(myReader.next());
		if(playerInput.equals("yes") && winDoor == playerDoor)
		{
			System.out.print("YAY HAHAH YOU LOST");
		}
		else if(playerInput.equals("yes") && winDoor != playerDoor)
		{
			System.out.print("SHUCKS YOU WON CONGRATS :( ");
		}
		else if(playerInput.equals("no") && winDoor == playerDoor)
		{
			System.out.print("SHUCKS YOU WON CONGRATS :( ");
		}
		else if(playerInput.equals("no") && winDoor != playerDoor)
		{
			System.out.print("YAY HAHAH YOU LOST");
		}
	}
	
}
