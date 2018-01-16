/***************************
Project: Creating a Bunny
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTBunny.Java
Description: Creates Bunny with its own specific features and characteristics
****************************/

			package Pets;

			public class MTBunny extends MTPets

			{

			// Declare additional properties
			String useOfTeeth;
			String memory;
			double attentionSpan;
			String bunEnvironment;
			String bunDiet;
		
			
			// constructor 1
			public MTBunny ( String name,String useOfTeeth, String memory, double  attentionSpan,  String bunDiet, String bunEnvironment, int age, char sex, String playToys,
					 String skinTexture, String eyeColor)
			{
				//calls and passes in general parameters from superclass(**did not include all properties from superclass, tooo much)
				super( age, sex,  playToys, skinTexture, eyeColor, name);
				
				// assign characteristics from parameters 
				this. useOfTeeth= useOfTeeth;
				this. memory= memory;
				this.attentionSpan=attentionSpan;
				this.bunDiet= bunDiet;
				this.bunEnvironment =bunEnvironment;
			}


		   // sets and stores values to specified variables
			public void setBunEnvironment(String factor )
		
			{
	
			this. bunEnvironment= factor;
			
			}		
			
			public void setMemory(String factor )
		
			{
		
				this. memory= factor;
			}
		
			public void setAttentionSpan(double factor )
		
			{
		
				this. attentionSpan= attentionSpan;
			}
		
			public void setBunDiet(String factor )
		
			{
		
				this. bunDiet=factor ;
				
				
			}
		
			public void setUseofTeeth(String factor )
			
			{
		
				this. useOfTeeth=factor ;
			}
		
			
			
			// reads in and returns values from specified variables
			public String getBunEnvironment()
			
			{
	
			return this. bunEnvironment;
			
			}		
			
			public String getMemory()
		
			{
		
				return this. memory;
			}
		
			public double getAttentionSpan()
		
			{
		
				return this. attentionSpan;
			}
		
			public String getBunDiet()
		
			{
		
				return this. bunDiet;
				
				
			}
		
			public String getUseofTeeth()
			
			{
		
				return this. useOfTeeth ;
			}
		
			
			
			
			// method to display info 
			public String toString()

			{
				String bunnyData1="Name:"+this.name +"\n";
				String bunnyData2= "Purpose of Teeth :"+ this. useOfTeeth+"\n"+"Memory:"+ this.memory +"\n";
				String bunnyData3= "Attention Span:"+ this. attentionSpan + "\n";
				String bunnyData4= "Diet:"+ this.bunDiet+ "\n";
				String bunnyData5= "Natural Habitat:"+ this.bunEnvironment+ "\n";
				
				//properties from superclass
				String bunnyData6= "Age:"+ this.age +"\n";
				String bunnyData7= "Sex:"+ this.sex + "\n";
				String bunnyData8="PlayToys:"+ this.playToys+ "\n";
				String bunnyData9="Skin Texture:"+this.skinTexture +"\n"+"Eye Colour:"+ this.eyeColor+ "\n";
				String bunnyData= bunnyData1+bunnyData2+ bunnyData3+ bunnyData4+bunnyData5+bunnyData6+bunnyData7+bunnyData8+bunnyData9+"\n";

				return bunnyData;

			}
				
			
	
}
