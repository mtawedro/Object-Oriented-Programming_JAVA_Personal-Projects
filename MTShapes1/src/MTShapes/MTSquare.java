/***************************
Project: Creating a Square
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTSquare.Java
Description: Creates Square with its own specific features and characteristics
****************************/

		package MTShapes;

		public class MTSquare extends MTShapes

 	{
	 	//declares additional properties
		int area;
		 
		int perimeter;

		int totalSides;
		
		double sideLength;
		 
		
		//constructor 1
		public MTSquare( int totalSides, double sideLength, String colour, int verticies)

		{
		
			//calls and passes in general parameters from superclass
			super(colour, verticies); 
		
			// assigns 4 new characteristics from parameters 
			this.totalSides=totalSides;

			this.sideLength=sideLength;
		
			area= areaSquare(sideLength, totalSides); //invoke method area
		
			perimeter= perSquare(sideLength, totalSides);//invoke method perimeter
		
		}

		 
		// sets and stores values to specified variables
		public void setTotalSides (int factor)

		{
		 
		this.totalSides= factor;

		}
		
		public void setSideLength(double factor)

		{
		 
		this.sideLength= factor;

		}
		
		 
		public void setArea(int factor)

		{
		 
		this.area= factor;

		}
		 
		public void setPerimeter(int factor)

		{
		 
		this.perimeter= factor;

		}
		 
		
		// reads in and returns values from specified variables
		public int getArea()

		{
		 
		return this.area;

		}
		
		public int getPerimeter()

		{
		 
		return this.perimeter;

		}
		
		public int getTotalSides()

		{
		 
		return this.totalSides;

		}
		
		public double getSideLength()

		{
		 
		return this.sideLength;

		}
		
		
		//calculates area of square
		public int perSquare( double sideLength, int totalSides)
		
		{
			perimeter=(int) (sideLength*totalSides);
		
			return perimeter;
		
		}
		
		//calculates perimeter of square
		public int areaSquare( double sideLength, int totalSides)
		
		{
			area=(int) (sideLength*sideLength);
		
			return area;
		
		}
		
		
		//prints info
		public String toString()

		{	
			//properties from superclass
			String squareData1="Colour:"+ this.colour+"\n";
			String squareData2="Vertices:"+ this.vertices+"\n";
			
			String squareData3= "Area:"+ this.area+"\n"+"Perimeter:"+ this.perimeter +"\n";
			String squareData= squareData1+squareData2+squareData3+ "\n";

			return squareData;

		}
		
			
		
		

}
