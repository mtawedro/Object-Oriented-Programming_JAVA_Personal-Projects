package arrays2;
import java.io.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));

		double [] num= new double [20];
		double age;
		int ageC=0;
		
		for(int x=0;x<=num.length-1;x++)
			{
				
				System.out.println("Enter age: "+x);
				age=Double.parseDouble(myinput.readLine());
				
				if(age>15)
				{
					ageC++;
				}
			}
	
		System.out.println("Total number of ages greater than 15: "+ageC);
	
		//for( int x=0;x<=num.length;x++)
		//	{
				
			//System.out.println("Enter age: "+x);
			//	num[x]=Double.parseDouble(myinput.readLine());
				
			
	//	if(num[x]>5)
		//{
		//	ageC++;
		//	}
		//}

	//System.out.println("Total number of ages greater than 15: "+ageC);
		
	
	
	
	
	
	
	}
	}