import java.util.Random;
import java.util.Scanner;

public class Board {
	
	private Room[][] rooms;
	Person occupant;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board()
	{	
		//At least 6 by 6
		int x = (int)(Math.random() * 4) + 6;
		int y = (int)(Math.random() * 4) + 6;
		this.rooms = new Room[x][y];
	}
	
	public void printBoard()
	{
		if(Runner.mapOn = true)
		{
			for(Room[] x : rooms)
			{
				for(Room y : x)
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
				}
				System.out.println();
			}
		}
	}
	
	public Room[][] getMap()
	{
		return rooms;
	}
	
	public void setMap(Room[][] rooms)
	{
		this.rooms = rooms;
	}
}
