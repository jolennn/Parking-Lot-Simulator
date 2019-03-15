import java.util.*;
import java.io.*;
/* This is the manipulation part of the program
 * imp.java makes the user fill out the necessary information of each driver 
 *
 */
public class imp {
	
	//keeps track of how many cars are inside the system
	public static int ctr = 0;
	//creates a linked list implementation to keep track of the plate numbers whenever drivers need to exit
	public static LinkedList<String> list = new LinkedList<String>();
	
	/* This method is where the user inputs their information and the system
	 * then writes the information into a separate text file 
	 * to be recorded
	 * 
	 */
	public static void fillOut() throws IOException {
		
		
		Scanner in = new Scanner(System.in);
		//This is created in order to enable writing into separate text files
		PrintWriter write = new PrintWriter(new File("driver"+ctr+".txt"));
		//ctr increments, taking note that a new driver has entered the system
		ctr++;
		// creates a new object containing the new information
		information driver = new information();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Please fill out the following: ");
		
		//inputs the plate number, records into the linked list system, and writes into separate text file
		System.out.print("Plate number: ");
		String dName = new String(in.nextLine());
		driver.plate = dName;
		list.add(dName);
		write.println("Plate number: "+driver.plate);
		
		//writes the driver name into text file
		System.out.print("Driver name: ");
		driver.name = in.nextLine();
		write.println("Driver name: "+driver.name);
		
		//writes the car brand into text file
		System.out.print("Car brand: ");
		driver.brand = in.nextLine();
		write.println("Car brand: "+driver.brand);
		
		//writes the car color into text file
		System.out.print("Car color: ");
		driver.color = in.nextLine();
		write.println("Car color: "+driver.color);
		
		//inputs the time parked into text file
		System.out.print("Time parked: ");
		driver.time = in.nextLine();
		write.println("Time parked: "+driver.time);
		
		//closes the printwriter
		write.close();
	}
	
	/*
	 * This method is called every time a parked car exits the system
	 * It detects whether the said plate number is present within the system
	 * and then removes it from the linked list
	 */
	public static void exit(String name){
		
		//finds if the plate number is found in list and then removes it
		if(list.remove(name)==true){
			System.out.println(name+ " successfully removed from system.");
			System.out.println("Thank you for trusting us with your car!");
			ctr--;
		} else //prints when plate number is not found
			System.out.println(name + " not found in system.");
		
		
	}
	
}