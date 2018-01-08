
//Stanley Liang TBA Project

public class Person {
	String firstName;
	String familyName;
	int xLoc, yLoc, xScore;
	
	public int getScore()
	{
		return xScore;
	}
	
	public void setScore(int xScore)
	{
		this.xScore = xScore;
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

	public Person (String firstName, String familyName, int xLoc, int yLoc, int xScore)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.xScore = xScore;
	}


}