import java.util.Scanner;

//Stanley Liang TBA Project

public class MapRoom extends Room 
{
	
	public MapRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println("You find a worn out piece of paper on the ground. It turns out to be a map of the area.");
		System.out.println();
		System.out.println("The map will now be displayed everytime you move.");
		occupant = x;
		visited = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		//Will turn the map on after the player enters the room
		Runner.mapOn();
	}
	
	//Room will be displayed with the @ symbol
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
				System.out.print("[@]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}