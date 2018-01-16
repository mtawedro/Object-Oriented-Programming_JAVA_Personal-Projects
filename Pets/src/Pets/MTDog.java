package Pets;

/***************************
Project: Creating a Dog
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTDog.Java
Description: Creates Dog with its own specific features and characteristics
****************************/

		public class MTDog extends MTPets

		{

			// Declare additional properties;
			String dogBreed="unassigned"; 
			String behaviour;
			String dogcolourSight;
			int aggressionFactor;
			double  intelligence;
			int  sensitivityLevel;
			String furColour;


			// constructor 1
			public MTDog (String name,String dogBreed, int  sensitivityLevel,int  aggressionFactor, String dogcolourSight, String furColour, double intelligence,  
					 char sex, String playToys, String metabolism,  String eyeColor)
			{
				//calls and passes in general parameters from superclass(**did not include all properties from superclass, tooo many)
				super ( sex, playToys, metabolism, eyeColor, name);
				
				
				// assign characteristics from parameters 
				this. dogBreed= dogBreed;
				this. dogcolourSight= dogcolourSight;
				this.aggressionFactor= aggressionFactor;
				this.furColour= furColour;
				this.behaviour =dogBehaviour();// invokes method behavior
				this. intelligence= intelligence;
				this.sensitivityLevel= sensitivityLevel;
				
			}
	
	
			// sets and stores values to specified variables
			public void setDogBreed(String factor )
		
			{
	
			this. dogBreed= factor;
			
			}
					
			public void setSensitivityLevel(int factor )
		
			{
		
				this. sensitivityLevel= factor;
			}
		
			public void setIntelligence(double factor )
		
			{
		
				this. intelligence= intelligence;
			}
		
			public void setBehaviour(String factor )
		
			{
		
				this. behaviour=factor ;
			}
		
			public void setDogcolourSight(String factor )
			
			{
		
				this. dogcolourSight=factor ;
			}
			
			public void setAggressionFactor(int factor )
			
			{
		
				this. aggressionFactor=factor ;
			}
			
			public void setFurColour(String factor )
			
			{
		
				this. furColour=factor ;
			}
			
		
		
			// reads in and returns values from specified variables
			public String getDogBreed()
		
			{

			return this. dogBreed;
			
			}
					
			public int setSensitivityLevel()
		
			{
		
				return this. sensitivityLevel;
			}
		
			public double getIntelligence()
		
			{
		
				return this. intelligence;
			}
		
			public String setBehaviour()
		
			{
		
				return this. behaviour;
			}
		
			public String setDogcolourSight( )
			
			{
		
				return this. dogcolourSight;
			}
			
			public int getAggressionFactor()
			
			{
		
				return this. aggressionFactor;
			}
			
			public String setFurColour( )
			
			{
		
				return this. furColour;
			}
		
		
		

			// determines statement of aggression depending on the aggression factor
			public String dogBehaviour()

			{// start of method behavior

				String State;

				if(this.getAggressionFactor()>7)

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
			String dogData1="Name:"+this.name +"\n";
			String dogData2= "Breed:"+ this.dogBreed+"\n"+"Colour Vision:"+ this.dogcolourSight +"\n";
			String dogData3= "Aggression factor:"+ this.aggressionFactor + "\n";
			String dogData4= "Fur colour:"+ this.furColour+ "\n";
			String dogData5="Intelligence:"+this.intelligence +"\n"+"Sensitivity:"+ this.sensitivityLevel+ "\n";
			String dogData6=this.behaviour+"\n";
			
			//properties from superclass
			String dogData7= "Sex:"+ this.sex + "\n";
			String dogData8="PlayToys:"+ this.playToys+ "\n";
			String dogData9="Metabolism:"+ this.metabolism+ "\n";
			String dogData10="Eye Colour:"+ this.eyeColor+ "\n";
			
			
			String dogData= dogData1+dogData2+ dogData3+ dogData4+dogData5+dogData6+dogData7+dogData8+dogData9+dogData10+"\n";

			

			return dogData;

		}

}
