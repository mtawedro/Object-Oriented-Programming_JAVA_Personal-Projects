/***************************
Project: Superclass for all pets
Programmer: Martina Tawedrous
Date: April 19 2016
Program Name: MTPets.Java
Description: Creates general features and characteristics that all 3 pets have in common
****************************/

			package Pets;

			public class MTPets 
		
			{
				//Declare variables
				String digestiveandUrinaryTracts;
				String temperatureRegulation;
				String bodySize;
				String playToys;
				String reproductiveStatus;
				int age;
				char sex;
				String metabolism;
				String skinTexture; 
				String eyeColor;
				String name;

	
	
			// constructor 1
			public MTPets(String digestiveandUrinaryTracts, int age, char sex, String temperatureRegulation, String bodySize, String playToys)


			{
				// assign characteristics from parameters 
				this. digestiveandUrinaryTracts=digestiveandUrinaryTracts;
				this.age=age;
				this.sex =sex;
				this.temperatureRegulation=temperatureRegulation;
				this.bodySize=bodySize;
				this.playToys=playToys;


			}
		
			// constructor 2
			public MTPets(String reproductiveStatus, String metabolism, String skinTexture, String eyeColor, String name )

			{

				this.reproductiveStatus=reproductiveStatus;
				this.metabolism=metabolism;
				this.skinTexture=skinTexture;
				this.eyeColor=eyeColor;
				this.name=name;

			}


			// constructor 3
			public MTPets(String digestiveandUrinaryTracts, int age, char sex, String temperatureRegulation, String bodySize, String playToys,
					String reproductiveStatus, String metabolism, String skinTexture, String eyeColor, String name) 
			{

				this. digestiveandUrinaryTracts=digestiveandUrinaryTracts;
				this.age=age;
				this.sex =sex;
				this.temperatureRegulation=temperatureRegulation;
				this.bodySize=bodySize;
				this.playToys=playToys;
				this.reproductiveStatus=reproductiveStatus;
				this.metabolism=metabolism;
				this.skinTexture=skinTexture;
				this.eyeColor=eyeColor;
				this.name=name;


			}


			//Constructor 4
			public MTPets(char sex, String playToys, String metabolism, String eyeColor, String name) 

			{

				this.sex =sex;
				this.metabolism=metabolism;
				this.eyeColor=eyeColor;
				this.name=name;
				this.playToys=playToys;
			}

			//Constructor 5
			public MTPets(int age, char sex, String playToys, String skinTexture, String eyeColor, String name) 

			{

				this.age=age;
				this.sex =sex;
				this.playToys=playToys;
				this.skinTexture=skinTexture;
				this.eyeColor=eyeColor;
				this.name=name;

			}

			
			// sets and stores values to specified variables
			public void setDigestiveandUrinaryTracts(String factor )

			{

				this. digestiveandUrinaryTracts= factor;

			}

			public void setAge(int factor )

			{

				this. age= factor;
			}

			public void setSex (char factor )

			{

				this. sex = sex ;
			}

			public void setTemperatureRegulation(String factor )

			{

				this. temperatureRegulation=factor ;
			}

			public void setBodySize(String factor )

			{

				this. bodySize=factor ;
			}

			public void setPlayToys(String factor )

			{

				this. playToys=factor ;
			}

			public void setReproductiveStatus(String factor )

			{

				this. reproductiveStatus=factor ;
			}

			public void setMetabolism(String factor )

			{

				this. metabolism=factor ;
			}

			public void setSkinTexture(String factor )

			{

				this. skinTexture=factor ;

			}

			public void setEyeColor(String factor )

			{

				this. eyeColor=factor ;

			}

			public void setName(String factor )

			{

				this. name=factor ;

			}



			// reads in and returns values from specified variables
			public String getDigestiveandUrinaryTracts()

			{

				return this. digestiveandUrinaryTracts;

			}

			public int getAge()

			{

				return this. age;
			}

			public char getSex ()

			{

				return this. sex ;
			}

			public String getTemperatureRegulation()

			{

				return this. temperatureRegulation;
			}

			public String  getBodySize()

			{

				return this. bodySize ;
			}

			public String getPlayToys()

			{

				return this. playToys;
			}

			public String getReproductiveStatus()

			{

				return this. reproductiveStatus;
			}

			public String getMetabolism()

			{

				return this. metabolism;
			}

			public String getSkinTexture()

			{

				return this. skinTexture;
			}

			public String getEyeColor()

			{

				return this. eyeColor;
			}

			public String getName()

			{

				return this. name;
			}



}

