import java.io.*;
import java.util.Scanner;
 /*
  * This class serves as the manipulating file for the board.
  * It records particular spots that are taken and removed from
  * 
  */
public class printboard {
	
	//creates the parking lot area
	public static board1 firstfloor = new board1();
	
	//prints the parking area for the user to choose spots from
	public static void printboard1(){
		
		//prints X if the spot is taken and specific area number if vacant
		for (int x=0; x<9; x++) {
			for (int y=0; y<10; y++) {
				
				//if taken
				if(firstfloor.frontend[x][y]!=0 && firstfloor.frontend[x][y]==99){
					
					System.out.print(" |");
					System.out.print(" X ");
					System.out.print("|");
				} else if (firstfloor.frontend[x][y]!=0 && firstfloor.frontend[x][y]!=99){ //if taken
					System.out.print(" |");
					System.out.print(" " + firstfloor.frontend[x][y] + " ");
					System.out.print("|");
				}
				//if part of the road
				if(firstfloor.frontend[x][y] ==0){
					
					System.out.print(" " + firstfloor.frontend[x][y] );
				}
				
			}
			
			System.out.println();
			System.out.println();
		}
		
		System.out.println(" 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0");
		System.out.println();
	}
	/*
	 * This method marks the chosen spot as taken
	 * @param area: is the chosen spot
	 */
	public static boolean markBoardEn(int area){
		//keeps track if the spot is found or not
		boolean found = false;
		//finds the spot
		for (int x=0; x<9; x++) {
			for (int y=0; y<10; y++) {
				//if spot is found and it is vacant
				if(firstfloor.frontend[x][y]==area && firstfloor.backend[x][y]==66){
					firstfloor.frontend[x][y]=99;
					firstfloor.backend[x][y]=area;
					found = true;
					return true;
				} 
				
			}
		}
		
		//if spot is not found because it is taken, it prints that it is taken
		if (found == false)
				System.out.println("This spot is taken. Please choose another spot.");
				
		return false;
		
	}
	
	/*
	 * This method marks the board again if another car parked exits the system
	 * @param area: is the specific spot that a driver has parked in
	 */
	public static boolean markBoardEx(int area){
		//keeps track if the spot is found or not
		boolean found = false;
			for (int x=0; x<9; x++) {
				for (int y=0; y<10; y++) {
					//if the spot is found, it vacates it again
					if(firstfloor.backend[x][y]==area && firstfloor.frontend[x][y]==99){
						firstfloor.frontend[x][y]=area;
						firstfloor.backend[x][y]=66;
						found = true;
						return true;
					} 
						
				}
			}
			// if spot is vacant, it prints an error
			if (found==false)
				System.out.println("Error, this spot is still vacant. Please input right spot.");
			
		return false;
	}
}
 
 
 
 