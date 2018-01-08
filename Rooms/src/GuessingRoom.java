import java.util.Scanner;

//Stanley Liang TBA Project

public class GuessingRoom extends Room
{

	private boolean guess = false;
	public GuessingRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		guess = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);

		System.out.println("The doors close behind you as you enter");
		System.out.println("There is writing on the wall that reads as follows:");
		System.out.println("From 1 to 10, what is the number that I am currently thinking of?");
		System.out.println("You have an infinite amount of retries for this one.");
	
		int a = ((int)Math.random() * 9) + 1;
		
		while(guess == true)
		{
			Scanner read = new Scanner(System.in);
			String statement = read.nextLine();
			do 
			{
				if(findKeyWord(statement, "", a) >= 0)
				{
					System.out.println("Nice one! +250 Points!");
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
			while(guess == false);
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
				System.out.print("[?]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
	
}