
public class Gane_Tile {
	
	private boolean hasPlayer;
	private boolean isRevealed;
	private boolean isWall;

public Gane_Tile(boolean hP, boolean iR, boolean iW)
{
	hasPlayer= hP;
	isRevealed = iR;
	isWall = iW;
	
	}



public boolean isHasPlayer() {
	return hasPlayer;
}



public void setHasPlayer(boolean hasPlayer) {
	this.hasPlayer = hasPlayer;
}



public boolean isRevealed() {
	return isRevealed;
}



public void setRevealed(boolean isRevealed) {
	this.isRevealed = isRevealed;
}



public boolean isWall() {
	return isWall;
}



public void setWall(boolean isWall) {
	this.isWall = isWall;
}



public String toString()
{
	if(hasPlayer == true)
	{
		return " P ";
	}
	if(isRevealed == false)
	{
		return " F ";
	}
	else if(isRevealed == true)
	{
		if(isWall == true)
		{
			return " W ";
		}
		else if(isWall == false)
		{
			return " O ";
		}
	}
	
	return null;
	
}
}


