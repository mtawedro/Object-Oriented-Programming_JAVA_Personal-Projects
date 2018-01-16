/***************************
Project: Modification of Dog Class
Programmer: Martina Tawedrous
Date: April 14 2016
Program Name: MTDogs.Java
Description: modifying the Dog class definition and the GetDogs client program
 ****************************/

package GetDogs;

public class MTDog 

{// start of class

	// assigned values by default;
	String dogName= "unassigned";
	String dogBreed="unassigned"; 
	int aggression= (int) (Math.random()*10+1);
	int hunger=  (int) (Math.random()*10+1);
	int age= (int)(1 + Math.random( ) * (13 - 0 + 1));
	char sex= 'M';
	String behaviour; 

	// constructor 1
	public MTDog(String dogName, String dogBreed, int aggression, int hunger)

	{

		// assign characteristics from parameters 
		this. dogName= dogName;
		this. dogBreed= dogBreed;
		this. aggression = aggression;
		this. hunger=  hunger;
		this.behaviour =behaviour();// invokes method behavior

	}

	// alternate constructor with additional attributes ( constructor 2)
	public MTDog(  int age, char sex, String behaviour)

	{

		// assign 3 new characteristics from parameters 
		this.age= age;
		this.sex= sex;
		this.behaviour =behaviour();// invokes method behavior
		
		//other characteristics assigned randomly by default 
		this. dogName= dogName;
		this. dogBreed= dogBreed;
		this. aggression = aggression;
		this. hunger=  hunger;
		
	}

	// constructor 3
	public MTDog(String dogName, String dogBreed, char sex)

	{

		// set characteristics from parameters
		this. dogName= dogName;
		this. dogBreed=dogBreed;
		this.sex=sex;

		// other characteristics assigned randomly by default 
		this.aggression=aggression;
		this.hunger=hunger;
		this.age=age;
		this.behaviour =behaviour(); 

	}

	//constructor 4
	public MTDog(int aggression, int hunger)

	{

		// set characteristics from parameters
		this.aggression= aggression;
		this.hunger=hunger;

		//other characteristics assigned randomly by default
		this.dogBreed=dogBreed;
		this.dogName=dogName;
		this.sex=sex;
		this.age=age;
		this.behaviour= behaviour();

	}

	//constructor 5
	public MTDog(String dogBreed, int hunger, int age, String dogName)

	{
		// set characteristics from parameters
		this.age=age;
		this.hunger=hunger;
		this.dogBreed= dogBreed;
		this.dogName=dogName;

		//other characteristics assigned randomly by default
		setSex(sex);// sets gender to female because dog name is female (Angelica) 
		this.aggression= aggression;
		this.behaviour =behaviour();

	}



		// method to access characteristics 
	
		public void setAggression(int factor )// sets and stores values to specified variables
	
		{
	
			this. aggression = factor;
		}
	
		public void setHunger(int factor )
	
		{
	
			this. hunger= factor;
		}
	
		public void setAge(int factor )
	
		{
	
			this. age= factor;
		}
	
		public void setSex(char factor )
	
		{
	
			this. sex= 'F';
		}
	
		public void setBehaviour(String factor )
	
		{
	
			this. behaviour=factor ;
		}
	
		public String getBreed()// reads in and returns values from specified variables
	
		{
	
			return this. dogBreed;
	
		}
	
		public String getName()
	
		{
	
			return this. dogName;  
	
		}
	
		public int getAggression ()
	
		{
	
			return this.aggression;
	
		}
	
		public int getHunger()
	
		{
	
			return this. hunger;
	
		}
	
		public int getAge()
	
		{
	
			return this. age;
	
		}
	
		public char getSex()
	
		{
	
			return this. sex;
	
		}
	
		public String getBehaviour()
	
		{
	
			return this. behaviour;
	
		}

	//methods for behavior or interactions
	public String behaviour()// determines statement of aggression depending on the aggression factor

	{// start of method behavior

		String State;

		if(this.getAggression()>7)
		{
			State ="GRR! RRRFFF!"; // high factor means angry dog
		}

		else

		{

			State= "Arf! Arf!"; // low factor means calm dog
		}
		
		return State;

	}// end of method



	// method to display info 
	public String toString()

	{

		String dogData1= "Name:"+ this.dogName+"\n"+"Breed:"+ this.dogBreed +"\n";
		String dogData2= "Aggression factor:"+ this.aggression + "\n";
		String dogData3= "Hunger factor:"+ this.hunger+ "\n";
		String dogData4="Age:"+this.age +"\n"+"Sex:"+ this.sex+ "\n";
		String dogData5=this.behaviour+"\n";
		String dogData= dogData1+dogData2+ dogData3+ dogData4+dogData5  + "\n";

		return dogData;

	}

	
}// end of class

