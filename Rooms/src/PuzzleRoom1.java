
public class PuzzleRoom1 extends Room 
{
	
	public PuzzleRoom1(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println("You enter the room. All doors close upon your arrival. You must find a way out.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
}