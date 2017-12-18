
public class Board {
	
	private Room[][] rooms;
	
	public Board(Room[][] rooms)
	{
		this.rooms = rooms;
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
