
//Stanley Liang TBA Project

public class TrapRoom extends Room 
{
	
	//Set up an random integer value so it can be later used to randomly choose an event to fire.
	private int a = ((int)Math.random() * 9) + 1;
	private boolean trap = false;
	
	public TrapRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		occupant = x;
		visited = true;
		trap = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		//One of two things will happen if you stumble into the trap room.
		if(a >= 5)
		{
			//You either are unlucky and the game ends.
			System.out.println("You walk into the room and stumbled into a trap.");
			System.out.println("Unfortunately, you fell into a neverending sinkhole.");
			System.out.println();
			System.out.println("GAME OVER");
			Runner.gameOff();
		}
		else if(a < 5)
		{
			//Or you are lucky enough to evade the trap.
			System.out.println("You walk into the room and trip over a a rock.");
			System.out.println("You fell just right past the trap door so that you did not fall through.");
			System.out.println("Luckily for you, you get back up unscathed.");
			System.out.println("If it had not be for the rock, you would not have noticed the trap door right besides you.");
			trap = false;
		}
	}
	
	//Prints the room labeled with a T if explored.
	public void print()
	{
		if(Runner.mapOn = true)
		{
			if(Room.visited == false && occupant == null)
			{
				System.out.print("[ ]");
			}
			else if(Room.visited == true && occupant ==  null)
			{
				System.out.print("[T]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}