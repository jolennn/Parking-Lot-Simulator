import java.util.Scanner;
import java.io.*;
/*
 * This is the main heart of the program and is the main manipulator of all other
 * files present in the project
 * The user chooses between 3 choices: Park, Exit, or terminate program
 * 
 */
public class program {
	
	//Is the main method of the program
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		int choice;
		imp process = new imp(); //creates a new implementation to manipulate information
		printboard printt = new printboard(); //creates new parking lot manipulator
		board1 board = new board1(); //creates parking lot
		try{
			do {
				
				System.out.println(" ");
				System.out.println(" ");
				System.out.println(" ");
				System.out.println("Welcome to Car Park Simulator");
				System.out.println("Enter 1 for Park");
				System.out.println("Enter 2 for Exit");
				System.out.println("Enter 3 to terminate program");
				System.out.print("Choice : ");
				choice = input.nextInt();
				
				//serves as the repeating choices for program
				switch(choice){
					case 1:{
						// if the user wants to park
						if(process.ctr!=63){	
							System.out.println(" ");
							System.out.println(" ");
							System.out.println(" ");
							printt.printboard1(); //prints the parking lot
							System.out.println("Legend: ");
							System.out.println("Numbers = Parking Spot Free");
							System.out.println("X = Parking Spot Taken");
							System.out.println("0 = Driveway");
							System.out.print("Please input parking space number: ");
							
							//gets user input parking space number
							int area1 = input.nextInt();
							
							//marks spot taken
							if(printt.markBoardEn(area1)==true){ 
							
							//creates new node containing the necessary information
							process.fillOut();
							
							System.out.println(" ");
							System.out.println(" ");
							System.out.println("Please remember to take note of your parking area number.");
							System.out.println("Your car is safe with us!");
							System.out.println("------------------------------------------");
							}
						} else
							System.out.println("Parking Lot is full! We are very sorry."); // if the parking lot is full
						
						break;
						
					}
					case 2:{
						//if the user wants to exit
						System.out.print("Please input parking area number: "); // gets area that user parked in
						int area2 = input.nextInt();
						if(printt.markBoardEx(area2)==true){ //marks spot vacant again if that is really the spot the user parked in
						
						System.out.print("Please input plate number: ");
						String plate = new String();
						plate = input.nextLine();
						plate = input.nextLine(); 
						process.exit(plate); //removes plate number from linked list system
						
						}
						break;
					}
					case 3:{
						// this terminates the program. This should only be closed after the day ends
						break;
					}
				}
			} while(choice!=3);
		} catch (IOException ex) {
            System.out.println("Error somewhere");
        }
	}
	
}