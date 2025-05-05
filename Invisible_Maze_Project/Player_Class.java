// This class represents the player in the invisible maze game
public class Player {

// The player's current position on the X (row) and Y (column) axis of the grid
int xpos;
int ypos;

// Constructor that initializes the player at the starting position
public Player()
{
	xpos= 0;
	ypos=0;
}

// Getter method for the X's position
public int getX()
{
	return xpos;
}

// Getter method for the Y's position
public int getY()
{
	return ypos;
}

// Setter method to update the X's position
public void setX(int newX)
	{
	xpos = newX;
	}

// Setter method to update the Y's position
public void setY(int newY)
{
	ypos = newY;
	}

}

