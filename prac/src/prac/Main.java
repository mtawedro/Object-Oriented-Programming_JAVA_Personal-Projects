package prac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{//start of class
	public static void main(String[] args) throws IOException
	{//start of main
		paint();
		//BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		//	int[] caseNum={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		//double[] amount={0,0.01,1,5,10,25,50,75,100,200,300,400,500,750,1000,5000,10000,50000,25000,75000,100000,200000,300000,400000,500000,750000,1000000};
	// insert do you wish to exist here?
		
		
	}//end of main
	
	public static void paint() throws IOException
	{
		int[] caseNum={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		double[] amount={500000,300000,500,100000,100,10000,750,1000000,400,0.01,75000,50,200000,5000,5,25000,1,400000,750000,10,50000,75,200,1000,300,25};
		
	
	part1(caseNum,amount);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void part1(int caseNum[],double amount[]) throws IOException
	{//start of round 1
		
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int user;
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;
		double realOffer=0;
		String userName;
		String decision;
		int userCase;
		double amountUserCase;
		int i=0;
		int x;
		int y=6;
		
		boolean choice=false;
		
		System.out.println("Welcome to Deal or No Deal!");
		System.out.println("Please enter your user name and we'll get started!(Only Characters!)");
		userName= myinput.readLine();
		System.out.println("Ok "+ userName+" let's get started!");
		System.out.println("Choose a briefcase:");
		userCase=Integer.parseInt(myinput.readLine());
		
		//userCase=caseNum[userCase];
		amountUserCase=amount[userCase-1];
		System.out.println(userCase+" "+amountUserCase);
		
		do
		{//start of do
				
				
				
				for( i=0;i<5;i++)// number of rounds (6)
				{//start of first for
					
					
					System.out.println("Round "+(i+1)+": ");
					System.out.println("Open "+(y)+" cases: ");
				
					// if i> equal 6 go to the method to continue the game
					y--;
			
					for(x=i;x<6;x++)// amount of cases being open each round(6 first time,5 second time)
		
			{//start of for
				
				
				
				System.out.println("Pick a Briefcase");
			
				user=Integer.parseInt(myinput.readLine());
			
			 // insert error trap here
			
				 System.out.println(amount[user-1]);
				 amount[user-1]=0;
			
		}//end of for
			 
		if(i==0)	 
		{
			realOffer=calculation(caseNum,amount);
	
		} 
		else if(i==1)	 
		{
			realOffer=calculation2(caseNum,amount);
	
		} 
		else if(i==2)	 
		{                                             //do switches here.
			realOffer=calculation3(caseNum,amount);
	
		} 
		else if(i==3)	 
		{
			realOffer=calculation4(caseNum,amount);
	
		} 
		else if(i==4)	 
		{
			realOffer=calculation5(caseNum,amount);
			
		
		} 
		
		
		
		
		
		
		
		
			 System.out.println("The Banker is calling...");
			 System.out.println("Here is the offer:");
			 System.out.println(realOffer);
			 
			 System.out.println("Deal or no Deal?");
			 decision=myinput.readLine();
			 
			 if(decision.equalsIgnoreCase("deal"))
			 {
				 choice=true;
				 System.out.println("Congratulations! You won"+"\n"+ "$"+realOffer);
				 //insert play again.
				 
				 break;
			
			 
			 }
			 else if(decision.equalsIgnoreCase("no deal"))
			 {
				 System.out.println("No Deal!");
				 choice=false;
			 }
				
			 
				} //end of start for
		
		
				System.out.println("Great! Let's continue");
				 part2(userCase,amountUserCase,caseNum,amount,i);
					
		}//end of do
	
				while(true);
		
	}
	
	public static double calculation(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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

		 return  totalAverage;


	}

	public static double calculation2(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.09* averageLess;
		
		 totalAverageMore=0.0144*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation3(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.13* averageLess;
		
		 totalAverageMore=0.0273*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation4(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.17* averageLess;
		
		 totalAverageMore=0.0442*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}
	public static double calculation5(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.2* averageLess;
		
		 totalAverageMore=0.062*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation6(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.25* averageLess;
		
		 totalAverageMore=0.1025*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation7(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.33* averageLess;
		
		 totalAverageMore=0.1683*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation8(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.5* averageLess;
		
		 totalAverageMore=0.305*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double calculation9(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;	
		
		
	
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
			
		
		 totalAverageLess=0.5* averageLess;
		
		 totalAverageMore=0.355*averageMore;
		
		 totalAverage=totalAverageLess+totalAverageMore;

		 return  totalAverage;


	}

	public static double part2(int userCase,double amountUserCase, int caseNum[],double amount[],int i) throws IOException
	
	{//start of method
		
BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		int user=0;
		double averageLess=0;
		double averageMore=0;
		double totalAverageLess;
		double totalAverageMore;
		double totalAverage=0;
		double realOffer=0;
		char anwser = ' ';
		String decision;
		double[] returncaseValue; 
		int returncaseNum;
		int x;
		double[] Exchange;
		
		boolean choice=false;
		
	
		
		do
		{//start of do
			
		
	
	
	for(x=i;x<=11;x++)

	{//start of second for
	 
		System.out.println("Round:"+(x+1)+": ");
					
				 
				  if(x==9)
				 {
					 
							
					  sortAmount( userCase, amountUserCase, caseNum, amount);
						returncaseValue	=sortAmount( userCase, amountUserCase, caseNum, amount);
						  int convert=(int)returncaseValue[1];
						
						System.out.println(" the return value of last case num is "+returncaseValue[0]);
						System.out.println(" the case number is "+convert);	
					  
					//  double hhh =  9.0;
					//  int ggg = (int)hhh ;
				
					  
						System.out.println("Do you wish to swap your case with case"+convert+"? Y/N");
							 anwser=myinput.readLine().charAt(0);
							
							 if(anwser=='Y'||anwser=='y')
							 {
								 Exchange=swap(convert,returncaseValue,userCase,amountUserCase,amount,caseNum);
									int convert2=(int)Exchange[1];
								
									System.out.println("You now have case"+convert2);
								 System.out.println("Now let's open your case...");// but what was in your case
								 System.out.println(Exchange[3]);
								 
								
							 
								 if(Exchange[3]<=50000)
								 {
									 System.out.println("Boo! You won"+"\n"+ "$"+Exchange[3]); 
									 System.out.println("Better luck next time");
								 }
								 
								 else if(Exchange[3]>50000)
								 {
									 System.out.println("Wow Congratulations! You won"+"\n"+ "$"+Exchange[3]);
								 }
								
								 System.out.println("Let's open case "+Exchange[0]+": ");
								 System.out.println(Exchange[2]);
							 }
								 
						
							 else if(anwser=='N'||anwser=='n')
							
							 {
								 System.out.println("Let's open case "+convert+": ");
								 System.out.println("Now let's open your case...");// but what was in your case
								 System.out.println(amountUserCase);
								 
								 if(amountUserCase<=50000)
								 {
									 System.out.println("Boo! You won"+"\n"+ "$"+amountUserCase); 
									 System.out.println("Better luck next time");
								 }
								 
								 else if(amountUserCase>50000)
								 {
									 System.out.println("Wow Congratulations! You won"+"\n"+ "$"+amountUserCase);
								 }
								
								 //insert play again.
								 choice=true;
								// break;
				
							 }
				 
				 }	
							 
				  System.out.println("Pick a case number");
							 user=Integer.parseInt(myinput.readLine());	 
				
							 System.out.println(amount[user]);
				
							 amount[user]=0;
		 
		
	
		 realOffer=calculation5(caseNum,amount);
		 
		 
	
		 System.out.println("The Banker is calling...");
		 System.out.println("Here is the offer:");
		 System.out.println(realOffer);
		 
		 System.out.println("Deal or no Deal?");
		 decision=myinput.readLine();
		
		 
	 		if(decision.equalsIgnoreCase("deal"))
		 {
			 
			 System.out.println("Congratulations! You won"+"\n"+ "$"+realOffer);
			 System.out.println("But what was in your case?...");// but what was in your case
			 //insert play again.
			 choice=true;
			 break;
		
		 
		 }
		 
	 		 else if (decision.equalsIgnoreCase("no deal")) 
	 		{
	 			 System.out.println("No Deal!");
	 			
	 			choice=false;
	 		}
	 	
	 		
		

			
	
			}//end of start for
	
		}//end of do

			while(true);
	
		}

	public static double[] sortAmount( int userCase,double amountUserCase, int caseNum[],double amount[])
	{
		double lastCase1=0;
		amountUserCase=-1;
		int lastCase2=0;
	 
		
	    for(int x=0;x<=caseNum.length-1;x++)
	{
		if(amount[x]!=0||amount[x]!=-1)
		
		{
			lastCase1=amount[x];     // the last cases that are left
			
			lastCase2=caseNum[x];
			
			
		
		}
		
	}
	    
	    double []newarray={lastCase1,lastCase2};// case number and amount.
	   // int convert=(int)newarray[1];
	    return newarray;


}
	
	public static double[] swap(int convert,double returncaseValue[],int userCase, double amountUserCase,double amount[],int caseNum[])
	{
		
		
	double tempAmount;
	int tempCase;
	
	tempAmount=returncaseValue[0];//the last amount in the last case (outside)
	returncaseValue[0]=amountUserCase;  //switches amount outside with amount in users oriognal breifcase.
	amountUserCase=tempAmount;///switches orignal breifcase amount with last case amount (outside).. brifcase amount equals the otherone

	tempCase=convert;//the last case number
	convert=userCase;  //switches last case numbers with the users oriognal breifcase
	userCase=tempCase;//switches orogianl breifcase with last case number
	
	double []newarray2={convert,userCase,returncaseValue[0],amountUserCase};
   
	//int convert2=(int)newarray2[1];
    return newarray2;
	

	
	
	}
























}
	