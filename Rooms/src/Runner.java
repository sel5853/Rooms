import java.util.Scanner;
import java.util.Random;

//Stanley Liang TBA Project

public class Runner {
	
	public static boolean mapOn = false;
	private static boolean gameOn = true;
	
	private static Room[][] rooms;
	
	
	public static void main(String[] args)
	{		
		
		System.out.println("You wake up in a building.");
		System.out.println("A note on wall reads: To escape, you must solve four puzzles located in four different rooms.");
		System.out.println("Each puzzle solved will grant 250 points. You need 750 points in order to be able to escape.");
		System.out.println("There are 1000 available points to be obtained but you only require 750.");
		System.out.println("Be careful! Some rooms may be empty, others may have traps or warps.");		
		System.out.println();
		
		Board r1 = new Board();
		
		Room[][] building = r1.getMap();
		

		
		//Fill the building with normal rooms - Placed before everything else or it will override other rooms
		for (int x = 0; x<building.length; x++)
		{
			for (int y = 0; y < building[x].length; y++)
			{
				building[x][y] = new Room(x,y);
			}
		}
		
		//Creates a MathRoom
		int x = (int)(Math.random()* building.length);
		int y = (int)(Math.random()* building[0].length);
		building[x][y] = new MathRoom(x, y);
		
		//Creates a RiddleRoom
		int x1 = (int)(Math.random()* building.length);
		int y1 = (int)(Math.random()* building[0].length);
		building[x1][y1] = new RiddleRoom(x1, y1);
		
		//Creates a GuessingRoom
		int x2 = (int)(Math.random()* building.length);
		int y2 = (int)(Math.random()* building[0].length);
		building[x2][y2] = new GuessingRoom(x2, y2);
		
		//Creates a FourDoors room
		int x3 = (int)(Math.random()* building.length);
		int y3 = (int)(Math.random()* building[0].length);
		building[x3][y3] = new FourDoors(x3, y3);
		
		//Creates random event rooms
		int x4 = (int)(Math.random()* building.length);
		int y4 = (int)(Math.random()* building[0].length);
		building[x4][y4] = new RandomEventRoom(x4, y4);
		
		//Creates a TrapRoom
		int x7 = (int)(Math.random()*building.length);
		int y7 = (int)(Math.random()*building[0].length);
		building[x7][y7] = new TrapRoom(x7, y7);
		
		//Depending on this, the winning room is either on the bottom or right. Determines location of the room.
		if((int)Math.random() * 2 <= 1)
		{
			int x5 = building.length * (int)Math.random();		
			int y5 = building[0].length - 1;						//Right Side
			building[x5][y5] = new ExitRoom(x5, y5);
		}
		else
		{
			int x5 = building.length - 1;							//Bottom
			int y5 = (int)Math.random();
			building[x5][y5] = new ExitRoom(x5, y5);
		}
		
		//Puts the map room close to the player's starting location
		int x6 = 2;
		int y6 = 2;
		building[x6][y6] = new MapRoom(x6, y6);
	
		//Setup player 1 and the input scanner
		Person player1 = new Person("FirstName", "FamilyName", 0, 0, 0);
		building[0][0].enterRoom(player1);
		Scanner in = new Scanner(System.in);
		while(gameOn)
		{
			System.out.println("Where would you like to move? (Choose N, S, E, W) ");
			String move = in.nextLine();
			if(validMove(move, player1, building))
			{
				if(mapOn == false)
				{
					System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
					System.out.println("Score: " + player1.getScore());
				}
				else if(mapOn == true)
				{
					System.out.println("Your coordinates: row = " + player1.getxLoc() + " col = " + player1.getyLoc());
					r1.printBoard();
					System.out.println("Score: " + player1.getScore());
				}
			}
			
			else {
				System.out.println("Please choose a valid move.");
			}			
			
		}
		in.close();
	}
	
	public static boolean validMove(String move, Person p, Room[][] map)
	{
		move = move.toLowerCase().trim();
		switch (move) {
			case "n":
				if (p.getxLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()-1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			case "e":
				if (p.getyLoc()< map[p.getyLoc()].length -1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc() + 1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "s":
				if (p.getxLoc() < map.length - 1)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()+1][p.getyLoc()].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}

			case "w":
				if (p.getyLoc() > 0)
				{
					map[p.getxLoc()][p.getyLoc()].leaveRoom(p);
					map[p.getxLoc()][p.getyLoc()-1].enterRoom(p);
					return true;
				}
				else
				{
					return false;
				}
			default:
				break;
					
		}
		return true;
	}
	
	public static void gameOff()
	{
		gameOn = false;
	}
	
	public static void mapOn()
	{
		mapOn = true;
	}
}