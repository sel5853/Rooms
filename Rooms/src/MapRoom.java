
public class MapRoom extends Room 
{
	private boolean visited = false;
	
	public MapRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println("You find a worn out piece of paper on the ground. It turns out to be a map of the area.");
		System.out.println();
		System.out.println("The map will now be displayed everytime you move.");
		occupant = x;
		visited = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		Runner.mapOn();
	}
}