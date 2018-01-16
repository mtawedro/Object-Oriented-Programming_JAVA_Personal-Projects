/***************************
Project: Creating a Circle
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTCircle.Java
Description: Creates Circle with its own specific features and characteristics
****************************/

			package MTShapes;

			public class MTCircle extends MTShapes

			{
			
				//Declares additional properties
				int area;
			
				int circumfrence;
			
				double radius;
			
			
			//constructor1
			public MTCircle(  double radius, String colour, int vertices)
		
			{
				//calls and passes in general parameters from superclass
				super(colour, vertices );
		
				// assigns 3 new characteristics from parameters
				this.radius=radius;
		
				circumfrence= CircumfrenceCircle(radius);
				
				area=areaCircle(radius);
		
			}
		
		
			
			// sets and stores values to specified variables
			public void setRadius(double factor)
		
			{
		
				this.radius= factor;
		
			}
		
		
			public void setArea(int factor)
		
			{
		
				this.area= factor;
		
			}
		
			public void setCircumfrence(int factor)
		
			{
		
				this.circumfrence= factor;
		
			}
		
			
			// reads in and returns values from specified variables
			public int getArea()
		
			{
		
				return this.area;
		
			}
		
			public int getCircumfrence()
		
			{
		
				return this.circumfrence;
		
			}
		
			public double getRadius()
		
			{
		
				return this.radius;
		
			}
		
		
		
			//calculates circumference of circle
			public int CircumfrenceCircle( double radius)
		
			{
				circumfrence= (int) ((Math.PI)* (radius*2));
		
				return circumfrence;
		
			}
		
			
			//calculates area of circle
			public int areaCircle( double radius)
		
			{
				area= (int) (Math.PI* (radius*radius)); 
		
				return area;
		
			}
	
	
			
			// method to display info 
			public String toString()

			{
				//properties from superclass
				String circleData1="Colour:"+ this.colour+"\n";
				String circleData2="Vertices:"+ this.vertices+"\n";
				
				String circleData3= "Area:"+ this.area+"\n"+"Circumferance:"+ this.circumfrence +"\n";
				String circleData= circleData1+circleData2+circleData3+ "\n";

				return circleData;

			}
	
	
	
}