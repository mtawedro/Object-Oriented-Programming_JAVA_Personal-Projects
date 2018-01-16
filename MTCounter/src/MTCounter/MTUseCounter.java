/***************************
Project: OverLoad Assignment 
Programmer: Martina Tawedrous
Date: April 26 2016
Program Name: MTUseCounter.Java
Description: Creates object Counter that is incremented and decremented several times by specified values
****************************/

package MTCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MTUseCounter {//start of class MTUseCounter

	public static void main(String[] args) throws NumberFormatException, IOException 
	
	{//start of main
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int inputValue; 
		
		// creates object Counter
		MTCounter Counter= new MTCounter(0,2,4);
		
		//calls method to increment counter by given value 2
		Counter.Increment(0,2); 
		// prints the final value of the counter
		System.out.println(Counter);
		
		//calls method to decrement counter by given value 4
		Counter.decrement(0,4); 
		// prints final value of the counter
		System.out.println(Counter);
		
		// sets counter value to 0
		Counter.setCounter(0);
		
		System.out.println(" What value do you wish to increment the counter by?");
		// user input
		inputValue=Integer.parseInt(myinput.readLine());
		
		//sets user's value to parameter that increments the counter by
		Counter.setAddCounter(inputValue);
		
		// passes user input into increment method to increment counter by specified amount
		Counter.Increment(0,inputValue);
		// prints final value of counter
		System.out.println(Counter);
	
	
	}//end of main


}// end of class MTUseCounter
