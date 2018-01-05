
public class GuessingRoom extends Room
{


	public GuessingRoom(int x, int y)
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
		System.out.println("There is writing on the wall that reads as follows:");
		System.out.println("From 1 to 10, what is the number that I am currently thinking of?");
		System.out.println("You will be warped back to the start if you fail more than 5 times.");
	}
	
	
}