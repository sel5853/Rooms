import java.util.Scanner;

//Stanley Liang TBA Project

public class Room {
	Person occupant;
	int xLoc,yLoc;
	boolean winningRoom = false;
	public static boolean visited = false;
	
	private int a = ((int)Math.random() * 9) + 1;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public void enterRoom(Person x)
	{
		if(a <= 3)
		{
			System.out.println("You enter damp and decaying bedroom. It reeks of distilled water.");
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
		}
		else if(a >= 4 && (a <= 7))
		{
			System.out.println("You enter a hallway. The lights are flickering at the end of the hall.");
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
		}
		else if(a >7)
		{
			System.out.println("You enter a plain old room. It's empty.");
			occupant = x;
			x.setxLoc(this.xLoc);
			x.setyLoc(this.yLoc);
		}
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
	public static void visited()
	{
		visited = true;
	}
	
	public void isWinningRoom() {
		winningRoom = true;
	}
	
	//The print method for the standard room
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
				System.out.print("[X]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
		
}