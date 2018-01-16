package Deal_or_NoDeal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{//start of class
	public static void main(String[] args) throws IOException
	{//start of main
		//BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int[] caseNum={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		double[] amount={0,0.01,1,5,10,25,50,75,100,200,300,400,500,750,1000,5000,10000,50000,25000,75000,100000,200000,300000,400000,500000,750000,1000000};
	// insert do you wish to exist here?
		Round1(caseNum,amount);
		
	}//end of main
	
	public static void Round1(int caseNum[],double amount[]) throws IOException
	{//start of round 1
		
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int user;
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;
		String decision;
		
		
		int x;
		
		
		boolean choice=false;
		
			do
		{//start of do
				
				
				
				for(int i=0;i<6;i++)
				{//start of first for
					
					System.out.println("Round:"+(i+1)+": ");
				
				
				
			
			for(x=i;x<6;x++)
		
			{//start of for
			 System.out.println("Pick a case number");
			 user=Integer.parseInt(myinput.readLine());
			
			 // insert error trap here
			
				 System.out.println(amount[user]);
				 amount[user]=0;
			
		}//end of for
			 
			 
			 for(int y=0;y<=caseNum.length-1;y++)
		{//start of for
			if(amount[y]<100000)
		
			{
				averageLess+=amount[y];//add remaining cases
				
				
			}
			
			else if(amount[y]>=100000)
			{
				averageMore+=amount[y];
				
			}
		
			
		
		}//end of for
				
			
			 totalAverageLess=0.07* averageLess;
			
			 totalAverageMore=0.0077*averageMore;
			
			 totalAverage=totalAverageLess+totalAverageMore;
	
			 System.out.println("The Banker is calling...");
			 System.out.println("Here is the offer:");
			 System.out.println(totalAverage);
			 
			 System.out.println("Deal or no Deal?");
			 decision=myinput.readLine();
			 
			 if(decision.equalsIgnoreCase("deal"))
			 {
				 choice=true;
				 System.out.println("Congratulations! You won"+"\n"+ "$"+totalAverage);
				 //insert play again.
				 
				 break;
			
			 
			 }
			 else if(decision.equalsIgnoreCase("no deal"))
			 {
				 choice=false;
			 }
			 
		} //end of start for
		}//end of do
	
				while(true);
		
		
	
			
			
			
			
			
			
			
			
			
			/*	
	public static void Round2(int caseNum[],double amount[]) throws IOException
		{
			BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
			
			int user;
			double averageLess=0;
			double averageMore=0;
			double totalAverageLess;
			double totalAverageMore;
			double totalAverage=0;
			String decision;
			
			System.out.println("Round 2:");
			do
			{//start of do
			
				boolean choice=false;
				
				for(int x=0;x<5;x++)
			{//start of for
				 System.out.println("Pick a case number");
				 user=Integer.parseInt(myinput.readLine());
				
				 // insert error trap here
				
					 System.out.println(amount[user]);
					 amount[user]=0;
				
			}//end of for
				 
				 
				 for(int y=0;y<=caseNum.length-1;y++)
			{//start of for
				if(amount[y]<100000)
			
				{
					averageLess+=amount[y];//add remaining cases
					//totalAverageLess=0.07* averageLess;
					
				}
				
				else if(amount[y]>=100000)
				{
					averageMore+=amount[y];
					//totalAverageMore=0.0077*averageMore;
				}
			
				
			
			}//end of for
					
				
				 totalAverageLess=0.09* averageLess;
				
				 totalAverageMore=0.0144*averageMore;
				
				 totalAverage=totalAverageLess+totalAverageMore;
		
				 System.out.println("The Banker is calling...");
				 System.out.println("Here is the offer:");
				 System.out.println(totalAverage);
				 
				 System.out.println("Deal or no Deal?");
				 decision=myinput.readLine();
				 
				 if(decision.equalsIgnoreCase("deal"))
				 {
					 choice=true;
					 System.out.println("Congratulations! You won"+"\n"+ "$"+totalAverage);
					 //insert play again.
					 
					 break;
				
				 
				 }
				 else if(decision.equalsIgnoreCase("no deal"))
				 {
					 Round3( caseNum,amount);
				 }
				 
			} 
				 while(true);
		
		
		
		}
		public static void Round3(int caseNum[],double amount[]) throws IOException
		
		{
			System.out.println("welcome to round 3");
		}
	
	
	
	
	*/
	
	
	
	
	
	
}
}
	