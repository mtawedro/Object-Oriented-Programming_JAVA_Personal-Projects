package MTGetShapes;

import MTShapes.MTShapes;
public class MTSquare extends MTShapes

{
	//change variables
	
		 
		double area;
		 
		double perimeter;

		int totalSides;
		
		double sideLength;
		 
		//constructor
		 
		public MTSquare( int totalSides, double sideLength, String colour, double verticies)

		{
		 
		super(colour, verticies);
		
		
		this.totalSides=totalSides;

		this.sideLength=sideLength;
		
		}

		 
		
		public void setTotalSides (int factor)

		{
		 
		this.totalSides= factor;

		}
		public void setSideLength(double factor)

		{
		 
		this.sideLength= factor;

		}
		
		
		 
		 
		public void setArea(double factor)

		{
		 
		this.area= factor;

		}
		 
		public void setPerimeter(double factor)

		{
		 
		this.perimeter= factor;

		}
		 

		public double getArea()

		{
		 
		return this.area;

		}
		
		public double getPerimeter()

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
		
		//Area( sideLength, totalSides);
		
		public double perimeter( double sideLength, int totalSides)
		
		{
			double perSquare=sideLength*totalSides;
		
			return perSquare;
		
		}
		
		public double area( double sideLength, int totalSides)
		
		{
			double areaSquare=sideLength*sideLength;
		
			return areaSquare;
		
		}
		
		
		public String toString()

		{

			String squareData1= "Area:"+ this.area+"\n"+"Perimeter:"+ this.perimeter +"\n";
			String squareData= squareData1+ "\n";

			return squareData;

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
