
public class Gane_Tile {
	
	// Indicates whether the player is on this tile.
	private boolean hasPlayer;
	// Indicates whether the tile is revealed to the player.
	private boolean isRevealed;
	// Indicates whether the tile is a wall.
	private boolean isWall;

public Gane_Tile(boolean hP, boolean iR, boolean iW)
{
	hasPlayer= hP;
	isRevealed = iR;
	isWall = iW;
	
	}



public boolean isHasPlayer() {
	// Returns whether the tile has a player.
	return hasPlayer;
}



public void setHasPlayer(boolean hasPlayer) {
	// Returns whether the tile has a player.
	this.hasPlayer = hasPlayer;
}



public boolean isRevealed() {
	// Returns whether the tile is revealed.
	return isRevealed;
}



public void setRevealed(boolean isRevealed) {
	// Sets the 'isRevealed' flag.
	this.isRevealed = isRevealed;
}



public boolean isWall() {
	// Returns whether the tile is a wall.
	return isWall;
}



public void setWall(boolean isWall) {
	// Sets the 'isWall'
	this.isWall = isWall;
}



public String toString()
{
	if(hasPlayer == true)
	{

	// Returns " P " if the player is on this tile.
		return " P ";
	}
	if(isRevealed == false)
	{
		// Returns " F " for a tile that is yet to be revealed
		return " F ";
	}
	else if(isRevealed == true)
	{
		if(isWall == true)
		{
			//returns "w" if the tile is a wall
			return " W ";
		}
		else if(isWall == false)
		{
			//returns "o" if the tile is a open tile
			return " O ";
		}
	}
	
	return null;
	
	}
}




