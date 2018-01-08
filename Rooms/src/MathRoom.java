import java.util.Scanner;

//Stanley Liang TBA Project

public class MathRoom extends Room
{

	private boolean math = false;
	Scanner read = new Scanner(System.in);
	
	public MathRoom(int x, int y)
	{
		super(x, y);
	}
	public void enterRoom(Person x)
	{
		System.out.println();
		occupant = x;
		visited = true;
		math = true;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		System.out.println("The doors close around you as you enter");
		System.out.println("There are numbers on the wall reading 4, 7, 2, 9.");
		System.out.println("Under it reads: What is the product of all 4 numbers?");
		System.out.println("On the other side there are numbers reading 22, 24, 502, 504. (Choose one)");
		
		while(math == true)
		{
			Scanner read = new Scanner(System.in);
			String statement = read.nextLine();
			do 
			{
				if(findKeyWord(statement, "504", 0) >= 0)
				{
					System.out.println("You have solved the problem! +250 Points!");
					System.out.println("The doors open around you.");
					x.setScore(x.xScore + 250);
					math = false;
				}
				else
				{
					System.out.println("I'm sorry, that is incorrect. Better luck next time!");
					x.setxLoc(3);
					x.setyLoc(3);
					math = false;
				}
			} 
			while(math == true);
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
				System.out.print("[#]");
			}				
			else if(occupant != null)
			{
				System.out.print("[0]");
			}
			System.out.println();
		}
	}
}