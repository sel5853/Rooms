import java.util.Scanner;

//Stanley Liang TBA Project

public class RandomEventRoom extends Room
{

	private boolean warp = false;
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
		x.setxLoc(5);
		x.setyLoc(5);
		
		System.out.println("You enter the room.");
		System.out.println("");
		System.out.println("You notice that there is a chest in the middle of the room.");
		System.out.println("It was actually pretty easy to open despite what you believed.");
		System.out.println("You expected something more, but only got a mirror.");
		System.out.println("As you peer into the mirror examining yourself, you realize that you surroundings have been changed.");
		System.out.println("The mirror has warped you to another room!");
	
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