/***************************
Project: Creating a Cat
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTCat.Java
Description: Creates cat with its own specific features and characteristics
****************************/	

				package Pets;
		
				public class MTCat extends MTPets
		
				{
					
					// declare additional properties
					String balance;
					double sensitivity;
					String interactions;
					String urineMarking;
				
			
				// constructor 1
				public MTCat (String name, String balance, double sensitivity, String interactions, String urineMarking,
						String digestiveandUrinaryTracts, int age, char sex, String temperatureRegulation, String bodySize, 
						String playToys, String reproductiveStatus, String metabolism, String skinTexture, String eyeColor)
			
				{
					//calls and passes in general parameters from superclass
					super(digestiveandUrinaryTracts, age, sex, temperatureRegulation, bodySize, playToys, reproductiveStatus, metabolism, skinTexture, eyeColor, name);
					
					// assign characteristics from parameters 
					this. balance= balance;
					this. sensitivity= sensitivity;
					this.interactions=interactions;
					this.urineMarking= urineMarking;
				
				}
		
		
				// sets and stores values to specified variables
				public void setBalance(String factor )
			
				{
		
					this. balance= factor;
			
				}
						
				public void setSensitivity(double factor )
			
				{
			
					this. sensitivity= factor;
				}
			
				public void setInteractions(String factor )
			
				{
			
					this. interactions= interactions;
				}
			
				public void setUrineMarking(String factor )
			
				{
			
					this. urineMarking=factor ;
				}
			
				
				// reads in and returns values from specified variables
				public String getBalance( )
				
				{
		
					return this. balance;
			
				}
						
				public double getSensitivity()
			
				{
			
					return this. sensitivity;
				}
			
				public String  getInteractions( )
			
				{
			
					return this. interactions;
				}
			
				public String setUrineMarking()
			
				{
			
					return this. urineMarking;
				}
				
				
				// method to display info 
				public String toString()

				{
					String catData1="Name:"+this.name +"\n";
					String catData2= "Stability :"+ this. balance+"\n"+"Human interaction:"+ this.interactions +"\n";
					String catData3= "Sensitivity:"+ this. sensitivity + "\n";
					String catData4= "Importance of urine marking:"+ this.urineMarking+ "\n";
					
					//properties from superclass
					String catData5= "Digestive and Urinary Tracts:"+ this. digestiveandUrinaryTracts+"\n"+"Age:"+ this.age +"\n";
					String catData6= "Sex:"+ this.sex + "\n";
					String catData7= "Temperature Regulation:"+ this.temperatureRegulation+ "\n";
					String catData8="Body Size:"+this.bodySize +"\n"+"PlayToys:"+ this.playToys+ "\n";
					String catData9="Reproductive Status:"+this.reproductiveStatus +"\n"+"Metabolism:"+ this.metabolism+ "\n";
					String catData10="Skin Texture:"+this.skinTexture +"\n"+"Eye Colour:"+ this.eyeColor+ "\n";
					String catData= catData1+catData2+ catData3+ catData4+catData5+catData6+catData7+catData8+catData9+catData10+"\n";

			
					return catData;

				}
		
		
}
