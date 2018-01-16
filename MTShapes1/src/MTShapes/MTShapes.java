/***************************
Project: Superclass for all shapes
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTShapes.Java
Description: Creates general features and characteristics that all 3 shapes have in common
****************************/

			package MTShapes;

			public class MTShapes 

			{

	
			//Declare general properties
			String colour;
			 
			int vertices;
			
			
			//constructor 1
			public MTShapes(String colour, int vertices)

			{
			 
				this.vertices=vertices;
			 
				this.colour=colour;
			
			
			}
			
			// sets and stores values to specified variables
			public void setVertices(int factor)

			{
			 
			this.vertices= factor;

			}
			 
			
			public void setColour(String factor)

			{
			 
			this.colour= factor;

			}

			
			// reads in and returns values from specified variables
			public int getVertices()

			{
			 
			return this.vertices;

			}
			
			public String getColour()

			{
			 
			return this.colour;

			}
			
						
			
}

