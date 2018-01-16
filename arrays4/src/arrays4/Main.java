package arrays4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

	double totalClassAverage;
	double average=0;
	String subject;
	double enteries;
	String name;
	double grade;
	double total=0;
	double classaverage=0;
	int x;
	for(x=1;x<=2; x++)
	{
		System.out.println("What is your name?");
		name=myinput.readLine();
		
		for(int y=1;y<=2; y++)
		{
			System.out.println("subject: "+y);
			subject=myinput.readLine();
			
			System.out.println("What is your grade?");
			grade=Double.parseDouble(myinput.readLine());
			
			total=total+grade;
			
		
		}
		average=total/2;
		System.out.println(" your average is"+ average);
	
		classaverage+=average;
		total=0;
		
	}
	totalClassAverage=classaverage/2;
	System.out.println(" class average is "+totalClassAverage);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}