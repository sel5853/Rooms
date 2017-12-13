
public class Board {
	
	private Room[][] rooms;
	
	public void printBoard()
	{
		
		this.rooms = rooms;
		
		for(Room[] x : rooms)
		{
			for(Room y : x)
			{
				y.print();
			}
			System.out.println();
		}
	}
}
