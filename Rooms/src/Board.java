import java.util.Random;
import java.util.Scanner;

public class Board {
	
	private Room[][] rooms;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board()
	{	
		int x = (int)(Math.random() * 4) + 6;
		int y = (int)(Math.random() * 4) + 6;
		this.rooms = new Room[x][y];
	}
	
	public void printBoard()
	{
		for(Room[] x : rooms)
		{
			for(Room y : x)
			{
				System.out.print("[ ]");
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
	
	public String toString()
	{
		return "[ ]";
	}
}
