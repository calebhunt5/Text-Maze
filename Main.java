/**
 * author chunter1
 * Semester Project
 * 1-19-20
 */

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		//creation of maze and scanner objects
		Sections dan =new Sections();
		Scanner kb =new Scanner(System.in);
		
		//variables to keep track of current room finish line and the next direction that the player wants to go
		char roomIn ='a';
		char end ='l';
		char nextDir ='Q';
		
		//the entire thing is enclosed in a loop that breaks when the player gets to char end/finish line
		while(roomIn != end)
		{
			//output to tell player where they are on the map and where they can go
			System.out.println("You are in room \""+roomIn+"\" of a maze of twisty little passages, all alike.");
			dan.possibleDirections(roomIn);
			nextDir =kb.next().toLowerCase().charAt(0);
			
			//checks to see if next direction would bring player to a different section
			char temp =roomIn;
			roomIn =dan.switchSection(roomIn, nextDir);
			
			//if not moving to different section
			if(roomIn == 'Y')
			{
				roomIn =temp;
				
				//this method will only work for this specific shape of maze
				if(nextDir == 'e' || nextDir == 's')
				{
					roomIn =dan.forwardSection(roomIn);
				}//end of if forward
				
				if(nextDir == 'w' || nextDir == 'n')
				{
					roomIn =dan.backwardSection(roomIn);
				}
			}//end of if no section switch
		}//end of loop
		
		//outputs congratulation to player
		dan.ifEndPoint(roomIn);
		

	}

}
