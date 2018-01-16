/***************************
Project: Modification of Dog Class
Programmer: Martina Tawedrous
Date: April 14 2016
Program Name: MTGetDogs.Java
Description: modifying the Dog class definition and the GetDogs client program
 ****************************/

package GetDogs;

public class MTGetDogs 

{//Start of class

	public static void main(String[] args) 

	{// Start of main

		MTDog dog1= new MTDog("Coco","Yorkshire Terrier",3,4);// (Constructor with no additional attributes) name, breed, aggression, hunger-->* behavior(additional)

		MTDog dog2= new MTDog(8,7);// (Constructor with 3 new  additional attributes) age, sex, behavior

		MTDog dog3= new MTDog("Princess"," Havenese", 'F'); // name, breed, sex 

		MTDog dog4= new MTDog(5,6);// Aggression, hunger

		MTDog dog5= new MTDog(" Poodle",9, 2, "Angelica");// breed, hunger, age, name


		// prints objects
		System.out.println("How about some doggie details?");
		System.out.println();
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog4);
		System.out.println(dog5);


	}// end of main

}// end of class

