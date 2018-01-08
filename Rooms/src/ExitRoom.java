import java.util.Scanner;

//Stanley Liang TBA Project

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
		
		if(x.getScore() == 1000)
		{
			System.out.println("Congratulations, you have aquired 1000 points.");
			System.out.println("With these points you are now eligible to leave this facility.");
			System.out.println("The door led you to a staircase that strangely only took you down one flight.");
			System.out.println("Looks like it isn't going to be as easy as you thought to find your way out.");
			System.out.println();
			System.out.println("GAME END");
			Runner.gameOff();
		}
		else if(x.getScore() != 1000) 
		{
			System.out.println("You do not meet all the requirements to exit the level!");
		}
	}
	
	public void print()
	{
		if(Runner.mapOn = true)
		{
			if(Room.visited == false && occupant == null)
			{
				System.out.print("[ ]");
			}
			else if(Room.visited == true && occupant ==  null)
			{
				System.out.print("[E]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}