/***************************
Project: FBI Project
Programmer: Martina Tawedrous
Date: December 15 2014
Program Name: Main.Java
Description: solve cases for various detectives within the FBI unit.
****************************/

	package FBI;

    //Import toolkits.
	import java.io.*;// Required for Input/Output and InputStreamReader.

	public class Main

{//start of class.
	
	public static void main(String[] args) throws IOException // Detects any errors.
	
		{//start of main method.
		
		//Declaring and initializing variables.
		 String[]name={"Bowman","Walker","Christian","Edwards","Cummings","Halpern","Scott","Rhineheart","Haley","Brooks"};
		
		 String[]add={" Canaan","Newark","Hardwick","Montgomery","Trenton","Liverpool","Sheridan","Houston","Westfield","Syosset"};
		 
		 String[]state={"CT","NJ","VT","AL","NJ","NY","WY","TX","NJ","NY"};
		 
		 int[]age={48,39,46,71,31,38,51,62,22,32};
		 
		 char[]sex={'M','F','M','M','M','F','M','F','F','M'};
		 
		 int[]sal={18000,27000,59000,78000,25000,45000,19000,91000,33000,40000};
		 
		 int[]sav={4200,3600,1900,500,7800,12000,400,53200,4700,3900};
		 
		 String[]car={"Saturn","Olds","Chev","Chev","Ford","Chev","Ford","Cad","Honda","Ford"};
		 
		 int[]year={1999,2000,2001,2003,2004,2002,2006,2005,2002,2004};
		 
		 
		 Sort(name,add,state,age,sex,sal,sav,car,year);//Calling and passing parameters to method Sort.
		 ass();//Calling method ass.
		 System.out.println(" ");//space.
		 Holmes(name,add,sex,age,car,sal);//Calling and passing parameters to method Holmes.
		 ass();//Calling method ass.
		 System.out.println(" ");//space.
		 Clouseau(name,add,car,sal,sav);//Calling and passing parameters to method Clouseau.
		 ass();//Calling method ass.
		 System.out.println(" ");//space
		 Simon(sex,name,car,year);//Calling and passing parameters to method Simon.
		 ass();//Calling method ass.
		 System.out.println(" ");//space.
		 Panther(name,sex,age,car,state);//Calling and passing parameters to method Panther.
		 ass();//Calling method ass.
		 
	}//end of main method.

	public static void ass()// Displays asterisks.

	{// start of method ass.

		for (int x = 0; x <= 46; x++)

		{// start of for.

			{

				System.out.print("*");

			}

		}// end of for.

	}// end of method ass.
	
	public static void Sort(String name[],String add[],String state[],int age[],char sex[],int sal[],int sav[],String car[],int year[])//Sorts names in alphabetical order.
	
	{//start of Sort method.
			
		boolean flag = true;// set flag to true to begin first pass.

		while (flag)

		{// start of while

			flag = false;// set flag to false awaiting a possible swap

			for (int i = 0; i < age.length - 1; i++)

			{// start of for.

					if (name[i].compareTo(name[i + 1]) > 0)//Alphabetical order(ascending sort).

				    {// start of if.

					// Swapping names.
					String nameTemp;// holding variable.
					nameTemp = name[i];
					name[i] = name[i + 1]; // swap elements.
					name[i + 1] = nameTemp;

					// Swapping address using the same index of the name.
					String addTemp;
					addTemp = add[i];
					add[i] = add[i + 1];
					add[i + 1] = addTemp;

					// Swapping state using the same index of the name.
					String stateTemp;
					stateTemp = state[i];
					state[i] = state[i + 1];
					state[i + 1] = stateTemp;

					// Swapping age using the same index of the name.
					int ageTemp;
					ageTemp = age[i];
					age[i] = age[i + 1];
					age[i + 1] = ageTemp;

					// Swapping sex using the same index of the name.
					char sexTemp;
					sexTemp = sex[i];
					sex[i] = sex[i + 1];
					sex[i + 1] = sexTemp;

					// Swapping salary using the same index of the name.
					int salTemp;
					salTemp = sal[i];
					sal[i] = sal[i + 1];
					sal[i + 1] = salTemp;

					// Swapping saving using the same index of the name.
					int savTemp;
					savTemp = sav[i];
					sav[i] = sav[i + 1];
					sav[i + 1] = savTemp;

					// Swapping car using the same index of the name.
					String carTemp;
					carTemp = car[i];
					car[i] = car[i + 1];
					car[i + 1] = carTemp;

					// Swapping year using the same index of the name.
					int yearTemp;
					yearTemp = year[i];
					year[i] = year[i + 1];
					year[i + 1] = yearTemp;

					flag = true;// shows a swap occurred.

				}// end of if.

			}// end of for.

		}// end of while.

	}// end of Sort method.

	public static void Holmes(String name[],String add[],char sex[],int age[],String car[],int sal[])//Searches Suspects and addresses for Inspector Holmes.	 
		 
		 
	{//start of Holmes method.
				
		System.out.println("Case 1 for Inspector Holmes:"); 
			
		System.out.println(" ");
			
		for(int x=0;x<=name.length-1;x++)
		
		{//start of for.
			 
			if(sex[x]=='M'&& age[x]>30 && car[x].equalsIgnoreCase("ford")&& sal[x]>20000)
			 
			 {//start of if.
				
				 System.out.println("Suspect "+x+": "+name[x]+"\nAddress: "+add[x]);
				 
				 System.out.println(" ");
			 
			 }//end of if.
			
		}//end of for.
	
	}//end of Holmes method.
	
	public static void Clouseau(String name[],String add[],String car[],int sal[],int sav[])//Searches Suspects and addresses for Inspector Clouseau.
	
	{//start of Clouseau method.
		
		System.out.println("Case 2 for Inspector Clouseau:"); 
		
		System.out.println(" ");
		
		for(int x=0;x<=name.length-1;x++)
		
		{//start of for.
			
			 if((car[x].equalsIgnoreCase("ford")||car[x].equalsIgnoreCase("chev")||car[x].equalsIgnoreCase("honda"))&& sal[x]>15000 && sav[x]<2000)
				
			 {//start of if.
				 
				 System.out.println("Suspect "+x+": "+name[x]+"\nAddress: "+add[x]);
				 
				 System.out.println(" ");
			 
			 }//end of if.
		 
		}//end of for.
	
	}//end of Clouseau method.
	
	public static void Simon(char sex[],String name[],String car[],int year[])//Searches for suspects, cars, and the year for Inspector Simon.
	
	{
		System.out.println("Case 3 for Inspector Simon:"); 
		
		System.out.println(" ");
		
		for(int x=0;x<=name.length-1;x++)
			
		{//Start of for.
				
			if(sex[x]=='F')
				 
			{//start of if.
					 
				System.out.println("Suspect "+x+": "+name[x]+"\nCar: "+car[x]+" year "+year[x]);
				
				System.out.println(" ");
			
			}//end of if.
			 
	    }//end of for.
	
	}//end of Simon method.
	
	public static void Panther(String name[], char sex[],int age[],String car[],String state[])//Searches for a suspect for Inspector Panther.
	
	{//start of Panther method.	 
		
		System.out.println("Case 4 for Inspector Pink Panther (undercover):"); 
		
		System.out.println(" ");
		
		for(int x=0;x<=name.length-1;x++)
			
		{//start of for.
				 
			if(sex[x]=='M'&& age[x]<35 && car[x].equalsIgnoreCase("ford") && state[x].equals("NJ"))
				
				 {//start of if.
					 
				System.out.println("Suspect "+x+": "+name[x]); 
				 
				 }//end of if.
			 
		}//end of for.
				
	}//end of Panther method.
	
}//end of class.
