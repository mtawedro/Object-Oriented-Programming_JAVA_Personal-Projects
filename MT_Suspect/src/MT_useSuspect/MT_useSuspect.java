/***************************
Project: Modification of FBI Project
Programmer: Martina Tawedrous
Date: May 8 2016
Program Name: MT_useSuspect.Java
Description: uses and refers to the MT_Suspect class to read in data from file and storing it in an array list
 ****************************/

package MT_useSuspect;

import java.io.*;

public class MT_useSuspect {


	public static void main(String[] args) {

		
		String fileName = "H:\\ICS4U\\file3\\FBI Project\\FBI_file.txt"; 
		
		// variables for the x counter value and string array
		String inputLine;
		
		//counter
		int x = 0; 
		
		String[] line;

		// reads through data once and count the number of lines in the file
		try 
		
		{
			
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			inputLine = in.readLine();

			// Loop to count number of lines and store in counter x (continues until the end of file)
			while (inputLine != null) 
			
			{
				
				inputLine = in.readLine();
				
				x++; 
			}
			
			
			in.close();
		
		} 
		
		catch (IOException e) // detects and catches errors
		
		{
			
			System.out.println(" Problem reading " + fileName);
		
		} 

		
		// Initializes suspectList array
		MT_Suspect[] suspectList = new MT_Suspect[x];

		// resets counter to zero
		x = 0;

		// Second run-through of reading data from the file and storing them in arrays
		try {
			
			BufferedReader in = new BufferedReader(new FileReader(fileName));

			inputLine = in.readLine();

			//names new MT_Suspect array
			  while (inputLine != null) 
			  
			  {
				
				line = inputLine.split(" , ");
				
				//stores the data in array
				suspectList[x] = new MT_Suspect(line[0], line[1], line[2], (Integer.parseInt(line[3])), line[4].charAt(0), (Integer.parseInt(line[5])), (Integer.parseInt(line[6])), line[7], (Integer.parseInt(line[8])));

				inputLine = in.readLine();
				
				//prints data in array list
				System.out.println(suspectList[x]);
				
				x++;

			}
			
			in.close();

		} 
		
		catch (IOException e) 
		
		{
			
			System.out.println(" Problem reading " + fileName);
		}

		 //Calling and passing parameters(array list) to method Sort.
		 Sort(suspectList);
		
		 //space.
		 System.out.println(" ");
		
		 //Calling and passing parameters(array list) to method Holmes.
		 Holmes(suspectList);
		
		 //space.
		 System.out.println(" ");
		
		 //Calling and passing parameters(array list) to method Clouseau.
		 Clouseau(suspectList);
		
		 //space
		 System.out.println(" ");
		
		 //Calling and passing parameters to method Simon.
		 Simon(suspectList);
		
		 //space.
		 System.out.println(" ");
		
		 //Calling and passing parameters to method Panther.
		 Panther(suspectList);
	
	}
		 
		
			 public static void Sort(MT_Suspect[] suspectList) 
		 
		 {
				// variables used for the parameters of the array list
				int x;
				int y;
				
				MT_Suspect temp = new MT_Suspect(); // holding Object.
				
				//gives parameters of the array list when sorting in Alphabetical order(ascending sort).
				for (x = 0; x < suspectList.length; x++) 
				
				{

					for (y = 0; y < suspectList.length; y++) 
					
					{

						temp = suspectList[x];
						suspectList[x] = suspectList[y]; // swap elements.
						suspectList[y] = null;
					}
				}
			}

		
		//Searches Suspects and addresses for Inspector Holmes.
		public static void Holmes(MT_Suspect[]suspectList)//  
		 
		 
		{//start of Holmes method.
					
			System.out.println("Case 1 for Inspector Holmes:"); 
				
			System.out.println(" ");
				
			for(int x=0;x<=suspectList.length;x++)
			
			{//start of for.
				 
				if(suspectList[x].getSex()=='M'&& suspectList[x].getAge()>30 &&  suspectList[x].getCar().equalsIgnoreCase("ford")&& suspectList[x].getSal()>20000)
				 
				 {//start of if.
					
					 System.out.println("Suspect "+x+": "+suspectList[x].getName()+"\nAddress: "+suspectList[x].getAdd());
					 
					 System.out.println(" ");
				 
				 }//end of if.
				
			}//end of for.
		
		}//end of Holmes method.
		
	

		//Searches Suspects and addresses for Inspector Clouseau.
		public static void Clouseau(MT_Suspect[] suspectList)
		
		{//start of Clouseau method.
			
			System.out.println("Case 2 for Inspector Clouseau:"); 
			
			System.out.println(" ");
			
			for(int x=0;x<=suspectList.length;x++)
			
			{//start of for.
				
				 if((( suspectList[x].getCar().equalsIgnoreCase("ford")||( suspectList[x].getCar().equalsIgnoreCase("chev")||(suspectList[x].getCar().equalsIgnoreCase("honda"))&& suspectList[x].getSal()>15000 && suspectList[x].getSav()<2000))))
					
				 {//start of if.
					 
					 System.out.println("Suspect "+x+": "+ suspectList[x].getName()+"\nAddress: "+suspectList[x].getAdd());
					 
					 System.out.println(" ");
				 
				 }//end of if.
			 
			}//end of for.
		
		}//end of Clouseau method.
		
		

		//Searches for suspects, cars, and the year for Inspector Simon.
		 public static void Simon(MT_Suspect[]suspectList)
		
		{
			System.out.println("Case 3 for Inspector Simon:"); 
			
			System.out.println(" ");
			
			for(int x=0;x<=suspectList.length;x++)
				
			{//Start of for.
					
				if(suspectList[x].getSex()=='F')
					 
				{//start of if.
						 
					System.out.println("Suspect "+x+": "+suspectList[x].getName() +"\nCar: "+suspectList[x].getCar()+" year "+suspectList[x].getYear());
					
					System.out.println(" ");
				
				}//end of if.
				 
		    }//end of for.
		
		}//end of Simon method.
		
		
		 
		//Searches for a suspect for Inspector Panther.
		 public static void Panther(MT_Suspect[]suspectList)
		
		{//start of Panther method.	 
			
			System.out.println("Case 4 for Inspector Pink Panther (undercover):"); 
			
			System.out.println(" ");
			
			for(int x=0; x<=suspectList.length;x++)
				
			{//start of for.
					 
				if(suspectList[x].getSex()=='M'&& suspectList[x].getAge()<35 && suspectList[x].getCar().equalsIgnoreCase("ford") && suspectList[x].getState().equals("NJ"))
					
					 {//start of if.
						 
					System.out.println("Suspect "+x+": "+suspectList[x].getName()); 
					 
					 }//end of if.
				 
			}//end of for.
					
		}//end of Panther method.
				
		
	}
	// end of main

