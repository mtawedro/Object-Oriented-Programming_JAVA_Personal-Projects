/***************************
Project: Dog Class Modification
Programmer: Martina Tawedrous
Date: April 14 2016
Program Name: MTGetDogs.Java
Description: Creating 2 dog objects with examining their behaviors
****************************/

package MTGetDogs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MTGetDogs 

{//start of class
	
	public static void main(String[] args) throws NumberFormatException, IOException 

	{// Start of main

		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		String breed;
		String name;
		String breed2;
		String name2;
		String userChoice = null;
		String userChoice2 = null;
		int userAgress = 0;
		int userAgress2 = 0;

		// user input
		System.out.println("Enter the name of your doggie:");
		name=myinput.readLine();

		System.out.println("Enter the breed of your doggie:");
		breed=myinput.readLine();

		MTDog dog1=new MTDog( name, breed,1);// object one

		System.out.println("Enter the name of your second doggie:");
		name2=myinput.readLine();

		System.out.println("Enter the breed of your second doggie:");
		breed2=myinput.readLine();



		MTDog dog2 =new MTDog( name2, breed2);// object two


		// prints info about each dog
		System.out.println("Here's your Doggie info!");
		System.out.println();
		System.out.println(dog1);
		System.out.println();
		System.out.println(dog2);

		agressionDog1(dog1, dog2, userAgress, userChoice);
		agressionDog2( dog1, dog2, userAgress2, userChoice2);
		dogMeet( dog1, dog2);
		
	
	}// end of method

	
			public static void agressionDog1(MTDog dog1, MTDog dog2, int userAgress, String userChoice) throws IOException// offers an alternate advice depending on the aggression factor for dog1
			
			{// start of method
				
				BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
				
				if(dog1.getAggression()>=6)// Aggression factor is high 
			
			{// start of if
	
				System.out.println(dog1.getName()+"'s"+" "+" aggression's factor is" +" "+ dog1.getAggression());
	
				System.out.println("Press Enter for some advice!");
	
				myinput.readLine();
	
				System.out.println("Gee..." +" "+dog1.getName()+ " "+ " seems intense! Do you wish to change the aggression factor? Enter Yes/No");
				userChoice= myinput.readLine();
	
				
					if(userChoice.equalsIgnoreCase("Yes"))
	
					{// start of if
					
						System.out.println("To what aggression?");
						userAgress= Integer.parseInt(myinput.readLine()); // obtains input from user
	
						dog1.setAggression(userAgress);// sets the new aggression factor that user inputed
				
						}
	
				
					else if (userChoice.equalsIgnoreCase("No"))
	
						{
					
						dog2.getAggression(); // does not change aggression factor and instead receives the original factor
	
						}
			
			
				}// end of if

				
				else if (dog1.getAggression()<6)// aggression factor is low

					{// start of else if
			
						System.out.println(dog1.getName()+"'s"+" "+" aggression's factor is" +" "+ dog1.getAggression());
			
						System.out.println("Press enter for some advice!");
			
						myinput.readLine();
			
						System.out.println("No No..." +" "+dog1.getName()+ " "+" seems to relaxed! Do you want to 'spice' things up a bit? Enter Yes/No");
						userChoice= myinput.readLine();

					
					if(userChoice.equalsIgnoreCase("Yes"))

					{
						System.out.println(" To what aggression?");
						userAgress= Integer.parseInt(myinput.readLine());// // obtains input from user

						dog1.setAggression(userAgress); // sets the new aggression factor that user inputed
					}

					else if (userChoice.equalsIgnoreCase("No"))

			
					{

						dog2.getAggression();//does not change aggression factor and instead receives the original factor
			
					}

				
				} // end of else if
		
	
		}// end of method
		
		

			// offers an alternate advice depending on the aggression factor for dog2
			public static void agressionDog2(MTDog dog1, MTDog dog2, int userAgress2, String userChoice2) throws IOException
		
			{
			
				BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
			
			
				if(dog2.getAggression()>=6) // Aggression factor is high 
		
					{// start of if
			
			
					System.out.println(dog2.getName()+"'s"+" "+" aggression's factor is" +" "+ dog2.getAggression());
			
				
					System.out.println("Press Enter for some advice!");
			
				
					myinput.readLine();
			
				
					System.out.println("Gee..." +" "+dog2.getName()+ " "+" seems intense! Do you wish to change the aggression factor? Enter Yes/No");
					userChoice2= myinput.readLine(); // obtains input from user

				
					if(userChoice2.equalsIgnoreCase("Yes"))

			
						{
				
							System.out.println("To what aggression?");
							userAgress2= Integer.parseInt(myinput.readLine());
				
							dog2.setAggression(userAgress2); // sets the new aggression factor that user inputed
			
						}

			
						else if (userChoice2.equalsIgnoreCase("No"))

			
						{
				
							dog2.getAggression(); //does not change aggression factor and instead receives the original factor
			
						}
		
				}// end of if

			
						else if (dog2.getAggression()<6)

		
						{// start of else if
			
							System.out.println(dog2.getName()+"'s "+" "+" aggression's factor is" +" "+ dog2.getAggression());
			
			
							System.out.println("Press Enter for some advice!");
			
			
							myinput.readLine();
			
			
							System.out.println("No No..." +" "+dog2.getName()+ " "+" seems to relaxed! Do you want to 'spice' things up a bit? Enter Yes/No");
							userChoice2= myinput.readLine(); // obtains input from user

			
								if(userChoice2.equalsIgnoreCase("Yes"))

								{
					
									System.out.println("To what aggression?");
									userAgress2= Integer.parseInt(myinput.readLine());

									dog2.setAggression(userAgress2); // sets the new aggression factor that user inputed
								}

				
								else if (userChoice2.equalsIgnoreCase("No"))

				
								{

									dog2.getAggression(); //does not change aggression factor and instead receives the original factor
				
								}

	
						}// end of else if
		
		
			}// end of method

				public static void dogMeet(MTDog dog1, MTDog dog2) throws IOException// another method compares aggression and hunger factor from dog1 and dog2
							
							{// start of method
								
								BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
							
								System.out.println();
								System.out.println(dog1.getName()+" "+"and "+dog2.getName()+" "+ "are at a meeting...");
								System.out.println("Press Enter to see what happens between the two dogs!!");
								myinput.readLine();
					
							//dog1 and dog2 are mad at each other b/c both their aggression and hunger factor are high
							if(dog1.getAggression()>=5 && dog1. getHunger()>=5 && dog2.getAggression() >=5&& dog2.getHunger()>=5)
					
							{
					
						          
								System.out.println(dog1.getName() +" : "+"GRR! RRRFFF!");
								System.out.println(dog2.getName() +" : "+"RRRRR!");
								System.out.println("Uh Oh "+" " +dog1.getName()+" "+"and "+dog2.getName()+" "+" are both hungry and angry! Seems that there not getting along!");
					
							}
					
							//dog1 and dog2 are calm with each other b/c both their aggression and hunger factors are low
							else if(dog1.getAggression() <=5 && dog1.getHunger()<=5 && dog2.getAggression()<=5 && dog2.getHunger()<=5)
					
							{
					
								System.out.println(dog1.getName() +" : "+"arf! arf! arf!");
								System.out.println(dog2.getName() +" : "+"arrrrffffff");
								System.out.println("awwwww, both "+" " +dog1.getName()+" "+"and "+dog2.getName()+" "+" just ate and seems to be liking each other alot!");
					
							}
					
							//dog1's hunger factor is high which leaves he/she angry, while dog2's hunger factor is low leaving he/she hungry and angry 
							else if(((dog1.getAggression()>=5) && (dog1.getHunger()>=5)) && ((dog2.getAggression()<5) && (dog2.getHunger()<5)))
					
					
							{
					
								System.out.println(dog1.getName() +" : "+"GRRRRRR!");
								System.out.println(dog2.getName() +" : "+"eek!");
								
								System.out.println("OH NO!"+" "+ dog2.getName()+" "+"is eating "+" "+dog1.getName()+ "s "+" "+" food because all the doggie food is finished!");
								
								System.out.println("Press Enter to see what happens!");
								myinput.readLine();
								
								System.out.println("Sweet Fiddle Sticks!"+" "+ dog1.getName()+" "+"is now angry at "+" "+dog2.getName()+ " "+" because 'some dog' ate all of the doggie food!");
					
							}
					
							//dog2's hunger factor is high which leaves he/she angry, while dog1's hunger factor is low leaving he/she hungry and angry 
							else if(dog1.getAggression()<5 && dog1. getHunger()<5 && (dog2.getAggression()>=5) && (dog2.getHunger()>=5))
					
					
							{
					
								System.out.println(dog1.getName() +" : "+"arfy arf!");
								System.out.println(dog2.getName() +" : "+"GRR! RFFFF!");
								
								System.out.println("OH NO!"+" "+ dog1.getName()+" "+"is eating "+" "+dog2.getName()+ "s "+" "+" food because all the doggie food is finished!");
								
								System.out.println("Press Enter to see what happens!");
								myinput.readLine();
								
								System.out.println("Yup..."+" "+ dog2.getName()+" "+"is now angry at "+" "+dog1.getName()+ " "+" because 'some dog'  ate all of the doggie food!");
								
								
							}
					
							// by default, if none of the above conditions are true, both dogs are still getting to know each other
							else 
					
							{
								System.out.println(dog1.getName() +" : "+"Roof Roof?");
								System.out.println(dog2.getName() +" : "+"arfy arf? ");
								System.out.println("Gee..."+" "+ dog1.getName()+" "+"and "+" "+dog2.getName()+ " "+" are starting to like eack other!");
					
							}
					
			
					
						}// end of method

}// end of class
					
