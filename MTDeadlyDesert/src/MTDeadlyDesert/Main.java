/***************************
Project: Deadly Desert Project
Programmer: Martina Tawedrous
Date: April 2 2016
Program Name: Main.Java
Description: Locates Hot Spots of danger through a snake infested desert.
****************************/

package MTDeadlyDesert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main 

{// start of class

	public static void main(String[] args) 

	{//start of main
		
		String [ ] [ ] grid = new String[7][8]; // **** 6 rows by 8 columns

		int [ ] [ ] grid2 = new int[7][8]; // **** 6 rows by 8 columns

		int TotalGridValue=0;

		randomNum(grid, grid2);
		System.out.println( "Original map:");
		ass( );
		System.out.println( );
		printMatrix(grid, grid2);
		System.out.println( );
		Location(grid, grid2, TotalGridValue );
		System.out.println( "Deadly Desert Map:");
		ass( );
		System.out.println( );
		printMatrix(grid, grid2);// Prints same String Type Matrix containing Hot Spots

	}// end of main 

	public static void  randomNum(String[][] grid, int[][] grid2)
	
	{// start of randomNum method

		for(int x=0; x<grid.length-1;x++)

		{
			for(int y=0; y<grid[x].length-1;y++) 

			{
				int name=(int)(0 + Math.random( ) * (6 - 0 + 1));

				grid[x][y]=  Integer.toString(name); // fills string matrix(1) with random number and then converts int matrix to an String type 

				grid2[x][y] =name;// fills int matrix(2) with random numbers

				
			}


		}

		
	}// end of method

	public static void  printMatrix(String[][] grid, int[][] grid2)

	 
	{// start of printMatrix method

		for(int c=0; c<grid.length-1;c++)

		{
			System.out.print(grid[c][0]);

			for(int r=0; r<grid[c].length-1;r++) // prints random numbers in String type matrix.

			{
				System.out.print((grid[c][r]));
			}

			System.out.println( );
		}


		
	}// end of method



	public static void  Location(String[][] grid, int[][] grid2, int TotalGridValue)

	{// start of Location method

		for(int r=1; r<=4;r++)// counts 4 rows down without including edges

		{


			for(int c=1; c<=5;c++) // counts 5 columns to the right without including edges

			{//start of for

				TotalGridValue= grid2[r][c] + (grid2[r][c+1] + grid2[r][c-1]) + (grid2[r-1][c] + grid2[r+1][c]); // uses  int Matrix to add values above, below, left, and  right from current position(cross form)

				if(TotalGridValue>15)	

				{

					grid[r][c]= "D" ; // takes value in same position as grid2(int) in the string matrix  and replaces that value in string matrix with the letter D. 

					grid[r][c+1]=" ";
					grid[r][c-1]=" ";
					grid[r-1][c]= " ";   //takes value in same position as grid2 in the string matrix and erases values ONLY above, below, right, and left from the Hot Spot(**purpose is for easily spotting hot spots (letters)).
					grid[r+1][c]=" ";

				}


			}//end of for

		}


	}// end of method


	public static void ass()// Displays asterisks.

	{// start of method ass.

		for (int x = 0; x <= 18; x++)

		{// start of for.

			{

				System.out.print("*");

			}

		}// end of for.

	}// end of method ass.

}// end of class

