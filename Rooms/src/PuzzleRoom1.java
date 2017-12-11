
public class PuzzleRoom1 extends Room {
	Person occupant;
	int xLoc,yLoc;
	
	public PuzzleRoom1(int x, int y)
	{
		super(x, y);
		xLoc = x;
		yLoc = y;
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter the room. All doors close upon your arrival.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	
}