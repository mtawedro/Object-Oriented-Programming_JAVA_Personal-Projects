


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
	String [] name=new String [5];
	int [] score1=new int [5];
	int [] score2=new int [5];
	int[] TotalValue;
	for(int x=0;x<=name.length-1;x++)
	{
		System.out.println("what is you name?");
		name[x]=myinput.readLine();
		System.out.println("what is your score1?");
		score1[x]=Integer.parseInt(myinput.readLine());
		System.out.println("what is your score2?");
		score2[x]=Integer.parseInt(myinput.readLine());
		
	}
	for(int x=0;x<=name.length-1;x++)
	{
	System.out.println(name[x]);
	System.out.println("\t score1"+score1[x]);
	System.out.println("\t score2"+score2[x]);
	System.out.print(" ");
	}
	
	
	
	
	TotalValue=sum(score1,score2);
	for(int x=0;x<=name.length-1;x++)
	{
	System.out.print(TotalValue[x]);
	System.out.print(" ");
	}
	
	
	}
	
	
	
	
	public static int[] sum(int score1[],int score2[])
	{
		int[]sum=new int[5];
		for(int x=0;x<=score1.length-1;x++)
		{
			sum[x]=score1[x]+score2[x];
		}
	return sum;
	
	
	
	}
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	