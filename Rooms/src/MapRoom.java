
public class MapRoom extends Room 
{
	
	public MapRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println("You find a worn out piece of paper on the ground. It turns out to be a map of the area.");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Runner.mapOn();
	}
}