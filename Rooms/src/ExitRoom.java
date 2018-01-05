
public class ExitRoom extends Room 
{
	
	public ExitRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		occupant = x;
		visited = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Runner.mapOn();
		
		if(x.getscore() == 1000)
		{
			System.out.println("Congratulations, you have beat the game!");
			Runner.gameOff();
		}
		else if(x.getscore() != 1000) 
		{
			System.out.println("You do not meet all the requirements to exit the level!");
		}
	}
}