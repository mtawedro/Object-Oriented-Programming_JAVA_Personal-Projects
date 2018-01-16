import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeastGreatest {

	public static void main(String[] args) throws NumberFormatException, IOException 
	
	{
		BufferedReader myinput = new BufferedReader (new InputStreamReader(System.in));

		int [] num = new int[5];
		int y=1;
		int choice;
		int pic;
		
		
		for(int x=0; x<5; x++)
		
		{
			
			System.out.println("Enter Num"+" "+ (x+1));
			choice=Integer.parseInt(myinput.readLine());
			
			num[x]=choice;
		}

		
		System.out.println("Enter 1: Least to Greatest");
		System.out.println("Enter 2: Greatest to Least");
		pic=Integer.parseInt(myinput.readLine());
		
		switch(pic)
		
		{
		
		
		case 1:
			
		{
			for(int x=0; x<5; x++)
			
			{
				
				for(int z=y;z<5;z++)
					
				{
					
					if(num[x]>num[z])
					
					{
						int temp= num[x];
						num[x]=num[z];
						num[z]=temp;
						
					
					}
					
				
				}
				
				y++;
				
				
			}
			
		
			break;
			
			
		}
		
	
		
		case 2:
			
		{
			
		
			for(int x=0; x<5; x++)
			{
				
				for(int z=y;z<5;z++)
					
				{
					
					if(num[x]<num[z])
					
					{
						int temp= num[x];
						num[x]=num[z];
						num[z]=temp;
						
					
					}
					
				
				}
				
				y++;
				
				
			}
			
	
		}
		
		
			break;
		
		}
	
	
		System.out.println(" ");
		
		for(int x=0; x<5;  x++)
			
		{
			
			System.out.println(num[x]);
			
		}

	
	
	}

}
