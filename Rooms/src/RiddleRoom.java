import java.util.Scanner;

//Stanley Liang TBA Project

public class RiddleRoom extends Room
{
	
	private boolean riddle = false;
	public RiddleRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		riddle = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);

		System.out.println("The doors close behind you as you enter");
		System.out.println("There is some writing on the wall reading:");
		System.out.println("What has 4 legs in the morning, 2 legs at noon, and 3 legs in the evening?");
		System.out.println("(Hint: One word answer)");
	
		while(riddle == true)
		{
			Scanner read = new Scanner(System.in);
			String statement = read.nextLine();
			do 
			{
				if(findKeyWord(statement, "human", 0) >= 0)
				{
					System.out.println("I didn't think that you would get that one! +250 Points!");
					System.out.println("The doors open around you.");
					x.setScore(250);
				}
				else
				{
					System.out.println("I'm sorry, that is incorrect. Try again!");
					x.setxLoc(3);
					x.setyLoc(3);
				}
			} 
			while(riddle == false);
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
				System.out.print("[R]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}