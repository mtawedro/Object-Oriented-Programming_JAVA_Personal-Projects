package MTGetShapes;

import MTCircle.MTCircle;
import MTSquare.MTSquare;
import MTTriangle.MTTriangle;



public class MTGetShapes {

	public static void main(String[] args) 
	
	{
		



		MTCircle circle =new MTCircle(5, "Purple", 0);// object one
		MTSquare square =new MTSquare(4,3.5,"Green", 4);// object two
		MTTriangle triangle =new MTTriangle(2.33,6.98,15.03,1.99, "Pink", 3);// object three //**CHANGE CLASS


		// prints info about each dog
		System.out.println("Here's your info about each shape!");
		System.out.println("Circle:");
		System.out.println();
		System.out.println(circle);
		System.out.println();
		System.out.println("Square:");
		System.out.println(square);
		System.out.println();
		System.out.println("Triangle:");
		System.out.println(triangle);

		

	}

}
