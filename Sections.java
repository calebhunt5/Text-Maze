/*
 * @author chunter1
 * Semester Project
 * 1-19-20
 */

public class Sections {
	
	//creation of four sections of map
	char[] sectionOne ={'a', 'e', 'i', 'j'};
	char[] sectionTwo = {'b', 'f', 'g', 'h', 'l'};
	char[] sectionThree = {'c', 'd'};
	char[] sectionFour = {'k'};
	
	/*
	 * method that increments forward within single section
	 * every section has a loop, so we know what section the player is in.
	 */
	public char forwardSection(char currentRoom)
	{
		for(int i =0;i<sectionOne.length;i++)
		{
			if(sectionOne[i] == currentRoom)
			{
				return sectionOne[i+1];
			}
		}//end of sectionOne loop
		
		for(int i =0;i<sectionTwo.length;i++)
		{
			if(sectionTwo[i] == currentRoom)
			{
				return sectionTwo[i+1];
			}
		}//end of sectionOne loop
		
		for(int i =0;i<sectionThree.length;i++)
		{
			if(sectionThree[i] == currentRoom)
			{
				return sectionThree[i+1];
			}
		}//end of sectionThree loop
		
		return 'Z';
	}//end of forwardSection()
	
	/*
	 * method that decrements within a single section
	 * every section has a loop so we know what section the player is in.
	 */
	public char backwardSection(char room)
	{
		for(int i =0;i<sectionOne.length;i++)
		{
			if(sectionOne[i] == room)
			{
				return sectionOne[i-1];
			}
		}
		
		for(int i =0;i<sectionTwo.length;i++)
		{
			if(sectionTwo[i] == room)
			{
				return sectionTwo[i-1];
			}
		}
		
		for(int i =0;i<sectionThree.length;i++)
		{
			if(sectionThree[i] == room)
			{
				return sectionThree[i-1];
			}
		}
		
		return 'X';
	}//end of backwardSection()
	
	/*
	 * method that switches current room between sections
	 * only works for this specific shape of maze
	 */
	public char switchSection(char room, char dir)
	{
		if(room == 'a' && dir == 'e')
		{
			return sectionTwo[0];
		}
		
		else if(room == 'b' && dir == 'w')
		{
			return sectionOne[0];
		}
		
		else if(room == 'g' && dir == 'n')
		{
			return sectionThree[0];
		}
		
		else if(room == 'g' && dir == 's')
		{
			return sectionFour[0];
		}
		
		else if(room == 'c' && dir == 's')
		{
			return sectionTwo[2];
		}
		
		else if(room =='k' && dir == 'n')
		{
			return sectionTwo[2];
		}
		
		else
		{
			return 'Y';
		}
	}//end of switchSection()
	
	/*
	 * method that outputs to the user their possible next directions
	 */
	public void possibleDirections(char room)
	{
		if(room == 'a')
		{
			System.out.println("You can go east or south.");
		}
		
		else if(room == 'b')
		{
			System.out.println("You can go west or south.");
		}
		
		else if(room == 'c')
		{
			System.out.println("You can go east or south.");
		}
		
		else if(room == 'd')
		{
			System.out.println("You can go west.");
		}
		
		else if(room == 'e')
		{
			System.out.println("You can go north or south.");
		}
		
		else if(room == 'f')
		{
			System.out.println("You can go north or east.");
		}
		
		else if(room == 'g')
		{
			System.out.println("You can go north or east or south or west.");
		}
		
		else if(room == 'h')
		{
			System.out.println("You can go south or west.");
		}
		
		else if(room == 'i')
		{
			System.out.println("You can go north or east.");
		}
		
		else if(room == 'j')
		{
			System.out.println("You can go west.");
		}
		
		else if(room == 'k')
		{
			System.out.println("You can go north");
		}
		
		else
		{
			System.out.println("ERROR CODE "+room);
		}
	}//end of possibleDirections
	
	/*
	 * method that returns start point 
	 * start point is room 'a'
	 */
	public char startPoint()
	{
		return 'a';
	}
	
	/*
	 * method that checks to see if user is at finish line 
	 * returns room 'l'
	 */
	public char ifEndPoint(char room)
	{
		if(room == 'l')
		{
			System.out.println("Hey! You found the door out! Congratulations. You won!");
		}
		
		return 'l';
	}

}
