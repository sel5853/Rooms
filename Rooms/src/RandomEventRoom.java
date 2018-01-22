import java.util.Scanner;

//Stanley Liang TBA Project

public class RandomEventRoom extends Room
{

	private boolean warp = false;
	private int a = ((int)Math.random() * 9) + 1;
	
	public RandomEventRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		warp = true;
		
		System.out.println("You enter the room.");
		System.out.println("");
		System.out.println("You notice that there is a chest in the middle of the room.");
		System.out.println("It was actually pretty easy to open despite what you believed.");
		System.out.println("You expected something more, but only got a mirror.");
		System.out.println("As you peer into the mirror examining yourself, you realize that you surroundings have been changed.");
		System.out.println("The mirror has warped you to another room!");
		
		if(a >= 5)
		{
			//Takes the player to room 5x5
			x.setxLoc(5);
			x.setyLoc(5);
			warp = false;
		}
		else if(a < 5)
		{
			//Takes the player to room 3x3
			x.setxLoc(3);
			x.setyLoc(3);
			warp = false;
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
				System.out.print("[W]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}