package arrays5;

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
	
	double grade;
	double total=0;
	double classaverage=0;
	int x;
	double total2=0;
	double grade2=0;
	String [] name= new String [2];
	double []score1= new double [2];
	double []score2= new double [2];
	int a=0;
	int b=0;
	int c=0;
	int r=0;
	
	for(x=0;x<=name.length-1; x++)
	{
		System.out.println("What is your name?");
		name[x]=myinput.readLine();
		
		for(int y=0;y<=0; y++)
		{
			
			System.out.println("What is your grade?");
			score1[x]=Double.parseDouble(myinput.readLine());
			
		}
		for( r=0;r<=0; r++)
		{
			
			System.out.println("What is your second grade?");
			score2[x]=Double.parseDouble(myinput.readLine());
		
		
		}
	}
	sum(name,score1,score2);
	}
	
	public static void sum(String name[],double score1[],double score2[]) 
	{
	
		double sum;
		int c=0;
		for(int y=0;y<=name.length-1;y++)
		{
			sum=score1[c+y]+score2[c+y];
			
			System.out.println("sum: "+sum);
		}
		
		//average=total2+total;
		//average/=2;
		//System.out.println("average "+average);
	
	}
}