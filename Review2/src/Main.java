
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		 int user;
		int x=0;
		int num1= (int)(1+Math.random()*(100-1+1));
		
		do
		{
			System.out.println("enter a number between 1-100");
			user=Integer.parseInt(myinput.readLine());
		}
		while(user<1||user>100);
		
		
		
		
		
		
		do
		{
			
			x++;
			if(user>num1)
			{
				
				System.out.println(" too high try again");
				user=Integer.parseInt(myinput.readLine());
			}
			else if(user<num1)
			{
				
				System.out.println(" too low try again");
				user=Integer.parseInt(myinput.readLine());
			}
		
			
		}
		while(user!=num1);
		
		System.out.println("Great job it took you"+x+"tries to guess the num");
	
	
	
	}
	}