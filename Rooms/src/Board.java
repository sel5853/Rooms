import java.util.Random;
import java.util.Scanner;

//Stanley Liang TBA Project

public class Board {
	
	private Room[][] rooms;
	Person occupant;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board()
	{	
		//Board size is at least 6 by 6
		int x = (int)(Math.random() * 4) + 6;
		int y = (int)(Math.random() * 4) + 6;
		this.rooms = new Room[x][y];
	}
	
	public void printBoard()
	{
		for(Room[]x : rooms)
		{
			for(Room y : x)
			{
				y.print();
			}
			System.out.println();
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
