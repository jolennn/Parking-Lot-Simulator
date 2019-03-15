/* This class serves as the display for the whole parking lot
 * This will be manipulated as a means for the user to choose a particular space
 */
public class board1 {
	
	// This is the front end of the board and serves as the main board to be displayed
	public int[][] frontend = new int[][]{
								   {1, 10, 0, 19, 28, 0, 37, 46, 0, 55},
								   {2, 11, 0, 20, 29, 0, 38, 47, 0, 56},
								   {3, 12, 0, 21, 30, 0, 39, 48, 0, 57},
								   {4, 13, 0, 22, 31, 0, 40, 49, 0, 58},
								   {5, 14, 0, 23, 32, 0, 41, 50, 0, 59},
								   {6, 15, 0, 24, 33, 0, 42, 51, 0, 60},
								   {7, 16, 0, 25, 34, 0, 43, 52, 0, 61},
								   {8, 17, 0, 26, 35, 0, 44, 53, 0, 62},
								   {9, 18, 0, 27, 36, 0, 45, 54, 0, 63}
	};
									
	/* This serves as the backend part of the board where it indicates if 
	 * the particular spot has already been taken or not
	 */
	public int[][] backend = new int[][]{
							       {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66},
								   {66, 66, 0, 66, 66, 0, 66, 66, 0, 66}
	};								   
							  
	

}