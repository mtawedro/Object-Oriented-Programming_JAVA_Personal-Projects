package MTGetShapes;

import MTShapes.MTShapes;

public class MTCircle extends MTShapes

{

	//change variables
	
	 
	double area;
	 
	double circumfrence;

	double radius;
	 
	//constructor
	 
	public MTCircle(  double radius, String colour, double vertices)

	{
	 
	super(colour, vertices );
	
	this.radius=radius;

	}

	 
	
	public void setRadius(double factor)

	{
	 
	this.radius= factor;

	}
	
	
	 
	public void setArea(double factor)

	{
	 
	this.area= factor;

	}
	 
	public void setCircumfrence(double factor)

	{
	 
	this.circumfrence= factor;

	}
	 
	
	public double getArea()

	{
	 
	return this.area;

	}
	
	public double getCircumfrence()

	{
	 
	return this.circumfrence;

	}
	
	public double getRadius()

	{
	 
	return this.radius;

	}
	
	
	
	public double circumfrence( double radius, double circumfrence)
	
	{
		circumfrence= Math.PI* radius*2;
	
		return circumfrence;
	
	}
	
	public double area( double radius, double area)
	
	{
		area=Math.PI* (radius*radius);
	
		return area;
	
	}
	
	// method to display info 
			public String toString()

			{

				String circleData1= "Area:"+ this.area+"\n"+"Circumferance:"+ this.circumfrence +"\n";
				String circleData= circleData1+ "\n";

				return circleData;

			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
