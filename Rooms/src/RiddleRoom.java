
public class RiddleRoom extends Room
{
	
	public RiddleRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);

		System.out.println("The doors close behind you as you enter");
		System.out.println("There is some writing on the wall reading:");
		System.out.println("What has 4 legs in the morning, 2 legs at noon, and 3 legs in the evening?");
		System.out.println("(Hint: One word answer)");
	}
	
	
}