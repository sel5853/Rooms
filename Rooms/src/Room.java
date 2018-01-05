
public class Room {
	Person occupant;
	int xLoc,yLoc;
	boolean winningRoom = false;
	public static boolean visited = false;
	
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public void enterRoom(Person x)
	{
		System.out.println("You enter a plain old room");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
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
}