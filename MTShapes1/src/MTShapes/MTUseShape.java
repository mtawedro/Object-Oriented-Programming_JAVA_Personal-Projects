/***************************
Project: Creates Shape objects
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTUseShape.Java
Description: Creates and prints all 3 Shape objects
****************************/

		package MTShapes;

		public class MTUseShape 

		{

			public static void main(String[] args) 
	
			{

				// object one
				MTCircle circle =new MTCircle(5.86, "Purple", 0);
		
				// object two
				MTSquare square =new MTSquare(4,3.5,"Green", 4);
		
				// object three
				MTTriangle triangle =new MTTriangle(2.33,6.98,15.03,1.99, "Pink", 3);
		

				// prints info about each shape
				System.out.println("Here's your info about each shape!");
				System.out.println();
				System.out.println("Circle");
				System.out.println(circle);
				System.out.println("Square");
				System.out.println(square);
				System.out.println("Triangle");
				System.out.println(triangle);
	

			}

} 
