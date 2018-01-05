
public class RandomEventRoom extends Room
{

	public RandomEventRoom(int x, int y)
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
		System.out.println("");
		System.out.println("Under it reads: What is the product of all 4 numbers?");
		System.out.println("On the other side there are numbers reading 22, 24, 502, 504. (Choose one)");
	}
	
	
}