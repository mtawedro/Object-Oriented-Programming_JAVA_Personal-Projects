/***************************
Project: OverLoad Assignment 
Programmer: Martina Tawedrous
Date: April 26 2016
Program Name: MTCounter.Java
Description: Increments and decrements a counter by given values
****************************/

package MTCounter;

public class MTCounter 

{//start of class MTCounter 
	
	int counter;
	int addCounter;
	int decCounter;
	
	
	//Constructor 1
	public  MTCounter(int counter, int addCounter, int  decCounter )
	
	{
		
		this.counter=counter;
		this. addCounter= addCounter;
		this.decCounter= decCounter;
		
	}
	
	//Increments Counter
	public void Increment()
	
	{
		for(int i=0; i<=3; i++)
		{
			i++;
			
		}
	
	}
	
	
	//Increments counter by given parameter
	public void Increment(int counter, int addCounter)
	
	{
		for(int x=this.counter; x<=6; x++)
		
		{
			this.counter+=this.addCounter;
	
			//prints current value of counter
			System.out.println("Incrementing Current"+ " "+ toString());
			
		}
	
	}
	
	//Decrements counter
	public void decrement()
	
	{
		for(int i=3; i<=0; i--)
		
		{
			i--;
			
		}
	}
	
	
	//Decrements the counter by the given parameter
	public void decrement(int counter, int decCounter)
	
	{
		for(int i=6; i<=this.counter; i--)
		
		{
			this.counter-=this.decCounter;
			
			//prints current value of counter
			System.out.println("Decrementing Current"+ " "+ toString());
		}
	
	}
	
	
	// sets and stores values to specified variables
	public void setCounter (int  factor)

	{
	 
		this.counter= factor;

	}
	
	public void setCounter()

	{
	 
		this.counter= 0;

	}
	
	public void setAddCounter (int  factor)

	{
	 
		this.addCounter= factor;

	}
	
	public void setDecCounter (int  factor)

	{
	 
		this.decCounter= factor;

	}
	
	
	// reads in and returns values from specified variables
	public int getCounter()

	{
	 
		return this.counter;

	}
	
	public int getAddCounter()

	{
	 
		return this.addCounter;

	}
	
	public int getDecCounter()

	{
	 
		return this.decCounter;

	}
	
	
	//prints info
	public String toString()

	{
		
		String counterData1="Value of Counter:"+ this.counter+"\n";
		
		return counterData1;

	}
	

	
}// end of class MTCounter 
