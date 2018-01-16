/***************************
Project: Creating a Combination Lock
Programmer: Martina Tawedrous
Date: April 12 2016
Program Name: MTGetComboLock.Java
Description: User creating and guessing a Lock combo
****************************/

package CombinationLock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MTGetComboLock 

{// start of class
	
	public static void main(String[] args) throws NumberFormatException, IOException 

	{// Start of main
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
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
		
		System.out.println("Create your own lock combo! Enter your name:");
		name=myinput.readLine();
		
		System.out.println(name+", enter your 3 digit Combo! Enter Digit 1:");
		user1= Integer.parseInt(myinput.readLine());
		
		System.out.println("Enter Digit 2:");
		user2= Integer.parseInt(myinput.readLine());
		
		System.out.println("Enter Digit 3:");
		user3= Integer.parseInt(myinput.readLine());

		System.out.println("Great! Now unlock your passcode");
		unlock1= Integer.parseInt(myinput.readLine());
		unlock2= Integer.parseInt(myinput.readLine());
		unlock3= Integer.parseInt(myinput.readLine());
		
		MTCombinationLock Lock1= new MTCombinationLock(name,user1,user2,user3, unlock1, unlock2, unlock3); // 1st object
		System.out.println();
		
		System.out.println("Now Guess a random lock combo! Enter Digits from 1 to 3:");
		trial1 = Integer.parseInt(myinput.readLine());
		
		System.out.println(" Enter Digit 2:");
		trial2 = Integer.parseInt(myinput.readLine());
		
		System.out.println("Enter Digit 3:");
		trial3 = Integer.parseInt(myinput.readLine());

		MTCombinationLock Lock2= new MTCombinationLock(trial1,trial2,trial3);// 2nd object 


	}// end of main


}// end of class
