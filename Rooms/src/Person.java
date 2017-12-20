
public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int score = 0;
	
	public void setscore()
	{
		this.score = score;
	}
	
	public int getscore()
	{
		return score;
	}
	
	public int getxLoc() 
	{
		return xLoc;
	}

	public void setxLoc(int xLoc) 
	{
		this.xLoc = xLoc;
	}

	public int getyLoc() 
	{
		return yLoc;
	}

	public void setyLoc(int yLoc) 
	{
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}


}