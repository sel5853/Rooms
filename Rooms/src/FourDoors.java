import java.util.Scanner;

//Stanley Liang TBA Project

public class FourDoors extends Room
{
	
	private boolean doors = false;
	public FourDoors(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		doors = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);

		System.out.println("The doors close behind you as you enter");
		System.out.println("A voice reads:");
		System.out.println("In front of you are four doors. One has a gem and the rest have a surprise.");
		System.out.println("Your objective is to find the gem. Which door do you choose? (1, 2, 3, 4)");
	
		while(doors == true)
		{
			Scanner read = new Scanner(System.in);
			String statement = read.nextLine();
			do 
			{
				if(findKeyWord(statement, "2", 0) >= 0)
				{
					System.out.println("You open the door and find the gem. +250 Points!");
					System.out.println("The doors open around you.");
					x.setScore(250);
					doors = false;
				}
				else
				{
					System.out.println("You open the door and there is no gem.");
					System.out.println("Instead, there was a portal that warped you back to the beginning!");
					x.setxLoc(0);
					x.setyLoc(0);
					doors = false;
				}
			} 
			while(doors == true);
		}
	
	}
	
	private int findKeyWord(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0))
											
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			psn = phrase.indexOf(goal, psn + 1);

		}

		return -1;
	}
	
	//Prints the room with a 4 to represent the 4 doors guessing game in the room.
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
				System.out.print("[4]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}