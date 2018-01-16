package MTGetShapes;
import MTShapes.MTShapes;
public class MTTriangle extends MTShapes
{
	//change variables
	
			 
			double area;
			 
			double perimeter;
			
			double base;
			
			double height;// add side lengths
			
			 double sideLengthA;
			 double sideLengthC;
			
			//constructor
			 
			public MTTriangle( double base, double height, double sideLengthA, double sideLengthC, String colour, double verticies)

			{
			 
				super(colour, verticies);
			
			this.base=base;
			
			this.height=height;
			
			this.sideLengthA =sideLengthA;
			
			this.sideLengthC=sideLengthC;
			
			
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
			
			 
			public void setArea(double factor)

			{
			 
			this.area= factor;

			}
			 
			public void setPerimeter(double factor)

			{
			 
			this.perimeter= factor;

			}
			 
			
			// reads in and returns values from specified variables
			public double getArea()

			{
			 
			return this.area;

			}
			
			public double getPerimeter()

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
			public double perimeter( double base, double sideLengthA, double sideLengthC)
			
			{
				double perTriangle=base+sideLengthA+sideLengthC;
			
				return perTriangle;
			
			}
			
			
			//calculates area of triangle
			public double area( double base, double height)
			
			{
				double areaTriangle=(base*height)/2;
			
				return areaTriangle;
			
			}


			//prints info
			public String toString()

			{

				String triangleData1= "Area:"+ this.area+"\n"+"Perimeter:"+ this.perimeter +"\n";
				String triangleData= triangleData1+ "\n";

				return triangleData;

			}
			
			





















}
