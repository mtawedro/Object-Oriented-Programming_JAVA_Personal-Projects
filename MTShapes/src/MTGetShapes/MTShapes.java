package MTGetShapes;

public class MTShapes 
{

	
	//change variables
	
			String colour;
			 
			double vertices;
			
			
			//constructor
			 
			public MTShapes(String colour, double vertices)

			{
			 
			//super MTShapes(colour, size);
			
			
			 
			this.vertices=vertices;
			 
			this.colour=colour;
			
			
			}

			
			public void setVertices(double factor)

			{
			 
			this.vertices= factor;

			}
			 
			
			public void setColour(String factor)

			{
			 
			this.colour= factor;

			}

			 
			public double getVertices()

			{
			 
			return this.vertices;

			}
			
			public String getColour()

			{
			 
			return this.colour;

			}
			
			
			
}
