/***************************
Project: Creates Pet objects
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTUsePet.Java
Description: Creates and prints all 3 pet objects
****************************/

package Pets;


public class MTUsePet 

{

	public static void main(String[] args) 
	
	{
	
		// object one
		MTDog  dog =new MTDog("Ginger","Poodle",14,12,"Colour blind & see movement and light much better than people",
				"White", 15.76,'M', "Bones","Higher metabolism than people","Brown");
		
		// object two
		MTCat cat =new MTCat ("Lola","Has an exceptional sense of balance", 14.0,"Sociable and friendly", " To Mark it's territory",
				"Gastrointestinal tract including stomach, small intestine, and large intestine (colon)",
				5,'F',"Cats lose heat through external radiation ", "Relatively little in size", "Ball of yarn", 
				"Pregnancy lasts b/w 56 & 71 days, with average pregnancy taking 68 days","Rapid metabolism", "Soft", "Geen");
		
		// object three 
		MTBunny bunny =new MTBunny ("Maxy"," Sharp to chew  on hard things", "Short term memory span",5,"Carrots", "Grasslands",13, 
				'M',"Spinning Weel", "Fuzzy","Blue");
		
		// prints info about each pet
		System.out.println("Here's some interseting info about each Pet!");
		System.out.println();
		System.out.println("Cat:");
		System.out.println(cat);
		System.out.println("Bunny:");
		System.out.println(bunny);
		System.out.println("Dog:");
		System.out.println(dog);

		
		
	}

}

