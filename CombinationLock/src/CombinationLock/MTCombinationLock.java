/***************************
Project: Creating a Combination Lock
Programmer: Martina Tawedrous
Date: April 12 2016
Program Name: MTCombinationLock.Java
Description: User creating and guessing a Lock combo
****************************/
package CombinationLock;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	
public class MTCombinationLock 
	
	{// start of class
	
		int num1=(int) (Math.random()*3+1);
		int num2=(int) (Math.random()*3+1);
		int num3=(int) (Math.random()*3+1);
	
	
			String name;
			int trial1;
			int trial2;
			int trial3;
			int user1;
			int user2;
			int user3;
			int unlock1;
			int unlock2;
			int unlock3;
	
		// first constructor
		public MTCombinationLock( String name, int user1, int user2, int user3,  int unlock1, int  unlock2, int unlock3) throws NumberFormatException, IOException 
	
		{
	
			this.name=name;
			this.user1= user1;
			this.user2= user2;
			this.user3= user3;
			this.unlock1=unlock1;
			this.unlock2=unlock1;
			this.unlock3=unlock1;
	
	
	
			userUnLock(name, user1, user2, user3, unlock1, unlock2, unlock3);
	
		} 
	
		//method to determine whether user's choice of combo is unlocked correctly
		public void userUnLock( String name, int user1, int user2, int user3, int unlock1, int unlock2, int unlock3) throws NumberFormatException, IOException
	
		{
			if(unlock1==user1 && unlock2==user2 && unlock3==user3)
	
			{
				System.out.println("Great! you unlocked your combo");
			}
	
			else
	
			{
				System.out.println("Boo!"+" " + name + ", you already forgot your passcode? Tsk.Tsk");
			}
	
	
		}
	
		// second constructor  
		public MTCombinationLock( int trial1, int trial2, int trial3) throws NumberFormatException, IOException
	
		{
	
	
			this.trial1= trial1;
			this.trial2= trial2;
			this.trial3=trial3;
	
	
			Lock(num1, num2,num3, trial1, trial2, trial3);
	
		} 
	
		//method to determine whether random combo is unlocked correctly by user
		public void Lock(int num1, int num2, int num3, int trial1, int trial2, int trial3) throws NumberFormatException, IOException
	
		{
			BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
	
			for(int x=1; x<=3; x++)
				
			{// start of for loop
	
				if(x==3 && !(trial1==this.num1 && trial2==this.num2 && trial3==this.num3)) // after 3 incorrect guesses, proper combo is displayed
	
				{
					System.out.println("Oopsy!! the correct lock combination is:" + this.num1 + ":"+this.num2 + ":"+ this.num3);
				}
	
				else if(trial1==this.num1 && trial2==this.num2 && trial3==this.num3 )
	
				{
					System.out.println("Yay!! The combination" +" "+ this.num1 + ":"+this.num2 + ":"+ this.num3 +" "+ "is correct!");
					break; // exist loop
				}
	
				else if(!(trial1==this.num1 && trial2==this.num2 && trial3==this.num3))
	
				{
					System.out.println("Oopsy!! try again:");
					System.out.println();
					
					System.out.println("Digit 1:");
					trial1 = Integer.parseInt(myinput.readLine());
					
					System.out.println("Digit 2:");
					trial2 = Integer.parseInt(myinput.readLine());
					
					System.out.println("Digit 3:");
					trial3 = Integer.parseInt(myinput.readLine());
	
				}
	
			
			} //end of for loop	 
	
	
		}// end of method
	
	
	}// end of class

