/***************************
Project: Creating a Triangle
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTTriangle.Java
Description: Creates Triangle with its own specific features and characteristics
****************************/

		package MTShapes;

		public class MTTriangle extends MTShapes

		{
			// Declare additional properties
			int area;
			 
			int perimeter;
			
			double base;
			
			double height;
			
			double sideLengthA;
			 
			double sideLengthC;
			
			//constructor 1
			public MTTriangle( double base, double height, double sideLengthA, double sideLengthC, String colour, int  verticies)

			{
				//calls and passes in general parameters from superclass
				super(colour, verticies);
			
				// assigns 5 new characteristics from parameters 
				this.base=base;
			
				this.height=height;
			
				this.sideLengthA =sideLengthA;
			
				this.sideLengthC=sideLengthC;
			
				perimeter= perTriangle(base, sideLengthA,sideLengthC);//invoke method perimeter
			
				area= areaTriangle(base, height); //invoke method area
			
			
			}

			// sets and stores values to specified variables
			public void setsideLengthA (double factor)

			{
			 
			this.sideLengthA= factor;

			}
			
			public void setsideLengthB (double factor)

			{
			 
			this.sideLengthC= factor;

			}
			
			
			public void setBase(double factor)

			{
			 
			this.base= factor;

			}
			
			public void setHeight(double factor)

			{
			 
			this.height= factor;

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
			
			
			public double  getBase()

			{
			 
			return this.base;

			}
			public double getHeight()

			{
			 
			return this.height;

			}
			
			public double getsideLengthA ()

			{
			 
			return this.sideLengthA;

			}
			
			public double getsideLengthB ()

			{
			 
			return this.sideLengthC;

			}
			
			
			//calculates perimeter of triangle
			public int perTriangle( double base, double sideLengthA, double sideLengthC)
			
			{
				perimeter=(int) (base+sideLengthA+sideLengthC);
			
				return perimeter;
			
			}
			
			//calculates area of triangle
			public int areaTriangle( double base, double height)
			
			{
				 area=(int) ((base*height)/2);
			
				return area;
			
			}


			//prints info
			public String toString()

			{
				//properties from superclass
				String triangleData1="Colour:"+ this.colour+"\n";
				String triangleData2="Vertices:"+ this.vertices+"\n";
				
				String triangleData3= "Area:"+ this.area+"\n"+"Perimeter:"+ this.perimeter +"\n";
				String triangleData= triangleData1+triangleData2+triangleData3 +"\n";

				return triangleData;

			}
			
			


}
