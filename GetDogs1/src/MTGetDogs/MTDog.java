/***************************
Project: Dog Class Modification
Programmer: Martina Tawedrous
Date: April 14 2016
Program Name: MTDogs.Java
Description: initializing properties for the 2 dog objects
****************************/

package MTGetDogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MTDog 

{//start of class
	
	BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
	
		// assigned values by default;
		String dogName= "unassigned";
		String dogBreed= "unassigned"; 
		int aggression= (int) (Math.random()*10+1);
		int hunger=  (int) (Math.random()*10+1);
		int age= (int)(1 + Math.random( ) * (13 - 0 + 1));
	 

		// constructor 1
		public MTDog(String dogName, String dogBreed, int age)

		{
			// assign 3 new characteristics from parameters 
			this. dogName= dogName;
			this. dogBreed= dogBreed;
			this.age=age;
			
			//other characteristics assigned randomly by default 
			this.aggression=aggression;
			this.hunger =hunger ;
		
		}
	
				
		// constructor 2	
		public MTDog(String dogName, String dogBreed) throws IOException

				{
					// assign 2 new characteristics from parameters 
					this. dogName= dogName;
					this. dogBreed= dogBreed;
					
					//other characteristics assigned randomly by default
					this.age=age;
					this.aggression=aggression;
					this.hunger =hunger ;
					
					
				}
				
				
				
				// sets and stores values to specified variables
				public  void setAggression(int userAgress)
				
				{
					this. aggression = userAgress; 
				
				}
				
				// reads in and returns values from specified variables
				public int getAggression ()
				
				{
			
					return this.aggression;
			
				}
				
				
				
				public String getName()
				
				{
			
					return this.dogName;
			
				}

				
				
				
				public int getHunger()
				
				{
			
					return this. hunger;
			
				}
				
				
				
				// method to display info 
				public String toString()

				{

					String dogData1= "Name:"+ this.dogName+"\n"+"Breed:"+ this.dogBreed +"\n";
					String dogData3= "Aggression factor:"+ this.aggression + "\n";
					String dogData8= "Hunger factor:"+ this.hunger+ "\n";
					String dogData9="Age:"+this.age;
					
					String dogData= dogData1+dogData3+ dogData8+ dogData9+ "\n";
						
					return dogData;

				}
	
	
}// end of class
