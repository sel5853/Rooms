
public class Board {
	
	private Room[][] rooms;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
	}
	
	public Board(int area)
	{
		int x = 8;
		int y = 8;
		this.rooms = new Room[y][x];
	}
	
	public void printBoard()
	{
		
		for(Room[] x : rooms)
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
	
	public String toString()
	{
		return "[ ]";
	}
}
