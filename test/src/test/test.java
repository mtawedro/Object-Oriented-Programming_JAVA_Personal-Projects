
package test;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

import BreezyGUI.*;
public class test extends GBFrame
{
	public static void main (String[ ] args) throws IOException
	{
	Frame frm = new test( );
	frm.setSize (1000,2000);
	frm.setVisible(true);
	
	}
	
	public void paint(Graphics g) 
	{
		int[] caseNum={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		
		double [] amount={500000,300000,500,100000,100,10000,750,1000000,400,0.01,75000,50,200000,5000,5,25000,1,400000,750000,10,50000,75,200,1000,300,25};
	
				boxes(g);
				try {
					part1(caseNum,amount,g);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		
		
	
	}
	
	
	public static void part1(int caseNum[],double[] amount, Graphics g) throws IOException
	{//start of round 1
		
		
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		
		DecimalFormat twoDigit= new DecimalFormat("#,##0.00");//Initializing the formatting to two decimal places.
		
				
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
		
		boolean choice=true;
		
		System.out.println("Welcome to Deal or No Deal!");
		System.out.println("Please enter your user name and we'll get started!(Only Characters!)");
		userName= myinput.readLine();
		System.out.println("Ok "+ userName+" let's get started!");
		System.out.println("Choose your own briefcase:");
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
				
					
					y--;
			
					for(x=i;x<6;x++)// amount of cases being open each round(6 first time,5 second time)
		
			{//start of for
				
				
				
				System.out.println("Choose a breifcase");
			
				user=Integer.parseInt(myinput.readLine());
			
				//errorTrap(user);
				
				//pause();
				
			if(amount[user-1]==0.01)
				 {
				 System.out.println(amount[user-1]);
				 amount[user-1]=0;
				 }
				
				else if(amount[user-1]==1000000)
				
				{
					System.out.println("OH NO!");
					System.out.println("The amount in this briefcase is "+"$"+(int)amount[user-1]);
				    amount[user-1]=0;
				}
				
				else 
				
				{
					System.out.println("The amount in this briefcase is "+"$"+(int)amount[user-1]);
				    amount[user-1]=0;
				}
				    removeBox(user,g);
					removeAmount(amount,user,g);
		
			}//end of for
	 
	
					realOffer=calculation(caseNum,amount);
		
		
					System.out.println("The Banker is calling...");
			 System.out.println("Here is the offer:");
			 System.out.println(twoDigit.format(realOffer));
			 
			 System.out.println("Deal or no Deal?");
			 decision=myinput.readLine();
			 
			 if(decision.equalsIgnoreCase("deal"))
			 {//start of if
				 
				 System.out.println("Congratulations! You won"+"\n"+ "$"+ twoDigit.format(realOffer));
				
				 // exsit
			 }
				 
			 else if(decision.equalsIgnoreCase("no deal"))
			 {//start of else if
				 System.out.println("No Deal!");
				 choice=true;
			
			 }//end of else of if
				
				
			
				} //end of start for // false will stop
		
		
		System.out.println("Great! Let's continue");
				 part2(userCase,amountUserCase,caseNum,amount,i,g);
					
		}//end of do
	
				
		
		while(choice);
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static double calculation(int caseNum[],double amount[])
	{
	
		
		double averageLess=0;
	
		double AverageLess;
		double Average = 0;
		double totalAverage=0;	
		
		
	
		for(int y=0;y<=caseNum.length-1;y++)
	{//start of for
		
			Average+=amount[y];//add remaining cases
			
	}//end of for
			
		
		AverageLess=0.15* Average;
		
		 totalAverage=Average-AverageLess;
		
		

		 return  totalAverage;


	}

	
	public static double part2(int userCase,double amountUserCase, int caseNum[],double amount[],int i,Graphics g) throws IOException
	
	{//start of method
		
BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
	
DecimalFormat twoDigit= new DecimalFormat("#,##0.00");//Initializing the formatting to two decimal places.
	
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
		char play = 0;
		boolean choice=false;
		
	
		
		do
		{//start of do
			
		
	
	
	for(x=i;x<=11;x++)

	{//start of second for
	 
		System.out.println("Round:"+(x+1)+": ");
					
				 
				  if(x==9)
				 {
					 
							
						returncaseValue	=sortAmount( userCase, amountUserCase, caseNum, amount);
						  
						//int convert=(int)returncaseValue[1];
						
						System.out.println(" the return value of last case num is "+returncaseValue[0]);
						System.out.println(" the case number is "+(int)returncaseValue[1]);	
					  
					
				
					  
							System.out.println("Do you wish to swap your case with case "+(int)returncaseValue[1]+"? Y/N");
							 anwser=myinput.readLine().charAt(0);
							
							 if(anwser=='Y'||anwser=='y')
							 {
								 Exchange=swap((int)returncaseValue[1],returncaseValue,userCase,amountUserCase,amount,caseNum);
									//int convert2=(int)Exchange[1];
								
								 System.out.println("You now have case"+(int)Exchange[1]);
								 System.out.println("Now let's open your case...");// but what was in your case
								 System.out.println((int)Exchange[3]);
								 
								
							 
								 if(Exchange[3]<=50000)
								 {
									 System.out.println("Boo! You won"+"\n"+ "$"+(int)Exchange[3]); 
									 System.out.println("Better luck next time");
								 }
								 
								 else if(Exchange[3]>50000)
								 {
									 System.out.println("Wow Congratulations! You won"+"\n"+ "$"+(int)Exchange[3]);
								 }
								
								 System.out.println("Let's open case "+(int)Exchange[0]+": ");
								 System.out.println((int)Exchange[2]);
 
								
								 
									 
								 
								
								
							
				
							 
							 
							 
							 
							 
							 }
								 
						
							 else if(anwser=='N'||anwser=='n')
							
							 {
								 System.out.println("Let's open case "+(int)returncaseValue[1]+": ");
								 System.out.println("Now let's open your case...");// but what was in your case
								 System.out.println((int)amountUserCase);
								 
								 if(amountUserCase<=50000)
								 {
									 System.out.println("Boo! You won"+"\n"+ "$"+(int)amountUserCase); 
									 System.out.println("Better luck next time");
								//exsit mehtod
								 }
								 
								 else if(amountUserCase>50000)
								 {
									 System.out.println("Wow Congratulations! You won"+"\n"+ "$"+(int)amountUserCase);
								
								 //exsit method
								 }
								 
				 
							 }
							 }
							 
				  			
							 System.out.println("Pick a case number");
							 user=Integer.parseInt(myinput.readLine());	 
				//error
							 if(amount[user-1]==0.01)
							 {
							 System.out.println(amount[user-1]);
							 amount[user-1]=0;
							 }
							
							else if(amount[user-1]==1000000)
							
							{
								System.out.println("OH NO!");
								System.out.println("The amount in this briefcase is "+"$"+(int)amount[user-1]);
							    amount[user-1]=0;
							}
							
							else 
							
							{
								System.out.println("The amount in this briefcase is "+"$"+(int)amount[user-1]);
							    amount[user-1]=0;
							}
							    removeBox(user,g);
								removeAmount(amount,user,g);
					
		 
		
	
		realOffer=calculation(caseNum,amount);
		 
		 
	
		 System.out.println("The Banker is calling...");
		 System.out.println("Here is the offer:");
		 System.out.println(twoDigit.format(realOffer));
		 
		 System.out.println("Deal or no Deal?");
		 decision=myinput.readLine();
		
		 
	 		if(decision.equalsIgnoreCase("deal"))
		 {
			 
			 System.out.println("Congratulations! You won"+"\n"+ "$"+twoDigit.format(realOffer));
			 System.out.println("But what was in your case?...");
			 System.out.println((int)amountUserCase);
			//exsit method
		 } 
			 
	 		 else if (decision.equalsIgnoreCase("no deal")) 
	 		
	 		 {
	 			 System.out.println("No Deal!");
	 			
	 			choice=false;
	 		
	 		}//end of else if
		
		 }//end of if
	 			}//end of start for
	
		

			while(true);
	
		}

	

	
	
	
	public static double[] sortAmount( int userCase,double amountUserCase, int caseNum[],double amount[])
	{
		double lastCase1=0; 
		amount[userCase-1]=-1;
		
		 int lastCase2=0;
	 
	    
		for(int x=0;x<=caseNum.length-1;x++)
	{
		if(amount[x]>0)
		
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


	
		
	
	
	public static void boxes(Graphics g)

	 {


	

			Font newFont = new Font("Rosewood Std Regular", Font.PLAIN, 40);
			g.setColor(Color.black);
			g.setFont(newFont);
	
		
		g.setColor(Color.orange);
		g.fillRect(35,45,250,35);
		g.setColor(Color.black);
		g.drawRect(35,45,250,35);
		g.drawString("0.01", 130, 75);
		
		
		g.setColor(Color.orange);
		g.fillRect(35,90,250,35);
		g.setColor(Color.black);
		g.drawRect(35,90,250,35);
		g.drawString("$1", 130, 120);
		
		g.setColor(Color.orange);
		g.fillRect(35,135,250,35);
		g.setColor(Color.black);
		g.drawRect(35,135,250,35);
		g.drawString("$5", 130, 165);
		
		g.setColor(Color.orange);
		g.fillRect(35,180,250,35);
		g.setColor(Color.black);
		g.drawRect(35,180,250,35);
		g.drawString("$10", 130, 210);
		
		g.setColor(Color.orange);
		g.fillRect(35,225,250,35);
		g.setColor(Color.black);
		g.drawRect(35,225,250,35);
		g.drawString("$25", 130, 255);
		
		g.setColor(Color.orange);
		g.fillRect(35,270,250,35);
		g.setColor(Color.black);
		g.drawRect(35,270,250,35);
		g.drawString("$50", 130, 300);
		
		g.setColor(Color.orange);
		g.fillRect(35,315,250,35);
		g.setColor(Color.black);
		g.drawRect(35,315,250,35);
		g.drawString("$75", 130, 345);
		
		g.setColor(Color.orange);
		g.fillRect(35,360,250,35);
		g.setColor(Color.black);
		g.drawRect(35,360,250,35);
		g.drawString("$100", 130, 390);
		
		g.setColor(Color.orange);
		g.fillRect(35,405,250,35);
		g.setColor(Color.black);
		g.drawRect(35,405,250,35);
		g.drawString("$200", 130, 435);
		
		g.setColor(Color.orange);
		g.fillRect(35,450,250,35);
		g.setColor(Color.black);
		g.drawRect(35,450,250,35);
		g.drawString("$300", 130, 480);
		
		g.setColor(Color.orange);
		g.fillRect(35,495,250,35);
		g.setColor(Color.black);
		g.drawRect(35,495,250,35);
		g.drawString("$400", 130, 525);
		
		g.setColor(Color.orange);
		g.fillRect(35,540,250,35);
		g.setColor(Color.black);
		g.drawRect(35,540,250,35);
		g.drawString("$500", 130, 570);
		
		g.setColor(Color.orange);
		g.fillRect(35,585,250,35);
		g.setColor(Color.black);
		g.drawRect(35,585,250,35);
		g.drawString("$750", 130, 615);
		
		
		
		
		
	g.setColor(Color.orange);
	g.fillRect(1050,45,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,45,250,35);
	g.drawString("$1000", 1110, 75);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,90,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,90,250,35);
	g.drawString("$5000", 1110, 120);
	
	g.setColor(Color.orange);
	g.fillRect(1050,135,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,135,250,35);
	g.drawString("$10000", 1110, 165);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,180,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,180,250,35);
	g.drawString("$50000", 1110, 210);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,225,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,225,250,35);
	g.drawString("$25000", 1110, 255);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,270,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,270,250,35);
	g.drawString("$75000", 1110, 300);
	
	g.setColor(Color.orange);
	g.fillRect(1050,315,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,315,250,35);
	g.drawString("$100000", 1110, 345);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,360,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,360,250,35);
	g.drawString("$200000", 1110, 390);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,405,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,405,250,35);
	g.drawString("$300000", 1110, 435);	
	
	g.setColor(Color.orange);
	g.fillRect(1050,450,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,450,250,35);
	g.drawString("$400000", 1110, 480);
	
	g.setColor(Color.orange);
	g.fillRect(1050,495,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,495,250,35);
	g.drawString("$500000", 1110, 525);
	
	g.setColor(Color.orange);
	g.fillRect(1050,540,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,540,250,35);
	g.drawString("$750000", 1110, 570);
	
	g.setColor(Color.orange);
	g.fillRect(1050,585,250,35);
	g.setColor(Color.black);
	g.drawRect(1050,585,250,35);
	g.drawString("$1000000", 1110, 615);	
	
	
	
	
	
	Font courierBold10 = new Font("Rosewood Std Regular", Font.BOLD, 72);
	g.setColor(Color.black);
	g.setFont(courierBold10);
	g.drawString("Deal or No Deal", 410, 90);
	
	Font TimesNewRoman = new Font("Rosewood Std Regular", Font.PLAIN, 82);
	g.setColor(Color.black);
	g.setFont(TimesNewRoman);
	
		
		
	//1st row
	
	g.setColor(Color.gray);
	g.fillRoundRect(450,110,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(450,110,100,100,10,10);
	g.drawString("1", 480, 180);
	
	g.setColor(Color.gray);
	g.fillRoundRect(560,110,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(560,110,100,100,10,10);
	g.drawString("2", 590, 180);
	
	g.setColor(Color.gray);
	g.fillRoundRect(670,110,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(670,110,100,100,10,10);
	g.drawString("3", 700, 180);
	
	g.setColor(Color.gray);
	g.fillRoundRect(780,110,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(780,110,100,100,10,10);
	g.drawString("4", 810, 180);
	

	//2nd row
	g.setColor(Color.gray);
	g.fillRoundRect(340,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(340,220,100,100,10,10);
	g.drawString("5", 370, 290);
		
		
	
	
	g.setColor(Color.gray);
	g.fillRoundRect(450,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(450,220,100,100,10,10);
	g.drawString("6", 480, 290);

	g.setColor(Color.gray);
	g.fillRoundRect(560,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(560,220,100,100,10,10);
	g.drawString("7", 590, 290);
	
	g.setColor(Color.gray);
	g.fillRoundRect(670,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(670,220,100,100,10,10);
	g.drawString("8", 700, 290);
	
	g.setColor(Color.gray);
	g.fillRoundRect(780,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(780,220,100,100,10,10);
	g.drawString("9", 810, 290);
	
	g.setColor(Color.gray);
	g.fillRoundRect(890,220,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(890,220,100,100,10,10);
	g.drawString("10", 905, 290);
	
	//3rd row
	g.setColor(Color.gray);
	g.fillRoundRect(340,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(340,330,100,100,10,10);
	
	g.drawString("11", 355, 400);
		
	
	
	g.setColor(Color.gray);
	g.fillRoundRect(450,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(450,330,100,100,10,10);
	g.drawString("12", 455, 400);
	
	g.setColor(Color.gray);
	g.fillRoundRect(560,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(560,330,100,100,10,10);
	g.drawString("13", 570, 400);
	
	g.setColor(Color.gray);
	g.fillRoundRect(670,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(670,330,100,100,10,10);
	g.drawString("14", 680, 400);
	
	g.setColor(Color.gray);
	g.fillRoundRect(780,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(780,330,100,100,10,10);
	g.drawString("15", 790, 400);
	
	g.setColor(Color.gray);
	g.fillRoundRect(890,330,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(890,330,100,100,10,10);
	g.drawString("16", 900, 400);
	
	//4th row
	g.setColor(Color.gray);
	g.fillRoundRect(340,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(340,440,100,100,10,10);
	
	g.drawString("17", 355, 510);
		
	
	
	g.setColor(Color.gray);
	g.fillRoundRect(450,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(450,440,100,100,10,10);
	g.drawString("18", 455, 510);
	
	g.setColor(Color.gray);
	g.fillRoundRect(560,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(560,440,100,100,10,10);
	g.drawString("19", 570, 510);
	
	g.setColor(Color.gray);
	g.fillRoundRect(670,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(670,440,100,100,10,10);
	g.drawString("20", 680, 510);
	
	g.setColor(Color.gray);
	g.fillRoundRect(780,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(780,440,100,100,10,10);
	g.drawString("21", 790, 510);
	
	g.setColor(Color.gray);
	g.fillRoundRect(890,440,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(890,440,100,100,10,10);
	g.drawString("22", 900, 510);
	


		
	//5th row
	
	g.setColor(Color.gray);
	g.fillRoundRect(450,550,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(450,550,100,100,10,10);
	g.drawString("23", 455, 620);
	
	g.setColor(Color.gray);
	g.fillRoundRect(560,550,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(560,550,100,100,10,10);
	g.drawString("24", 570, 620);
	
	g.setColor(Color.gray);
	g.fillRoundRect(670,550,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(670,550,100,100,10,10);
	g.drawString("25", 680, 620);
	
	;
	g.setColor(Color.gray);
	g.fillRoundRect(780,550,100,100,10,10);
	g.setColor(Color.black);
	g.drawRoundRect(780,550,100,100,10,10);

	g.drawString("26", 790, 620);
	
	

}
	public static void removeBox(int user,Graphics g)

	{
	switch(user)
		{//start of switch
	case 1:
	{
		g.setColor(Color.white);
		g.fillRoundRect(450,110,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(450,110,100,100,10,10);
		g.drawString("1", 480, 180);
	}
	case 2:	
		
	{
		g.setColor(Color.white);
		g.fillRoundRect(560,110,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(560,110,100,100,10,10);
		g.drawString("2", 590, 180);
	}
		
	case 3:
	{
		g.setColor(Color.white);
		g.fillRoundRect(670,110,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(670,110,100,100,10,10);
		g.drawString("3", 700, 180);
	}
		
	case 4:
	{
		g.setColor(Color.white);
		g.fillRoundRect(780,110,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(780,110,100,100,10,10);
		g.drawString("4", 810, 180);	
	}
	case 5:
	{
		//2nd row
		g.setColor(Color.white);
		g.fillRoundRect(340,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(340,220,100,100,10,10);
		g.drawString("5", 370, 290);
			
	}
	

	case 6:
	{
		g.setColor(Color.white);
		g.fillRoundRect(450,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(450,220,100,100,10,10);
		g.drawString("6", 480, 290);
	}
		
	
	case 7:
	{
		g.setColor(Color.white);
		g.fillRoundRect(560,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(560,220,100,100,10,10);
		g.drawString("7", 590, 290);
		
	}

	case 8:
	{
		g.setColor(Color.white);
		g.fillRoundRect(670,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(670,220,100,100,10,10);
		g.drawString("8", 700, 290);	
	}
	
	case 9:
	{
		g.setColor(Color.white);
		g.fillRoundRect(780,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(780,220,100,100,10,10);
		g.drawString("9", 810, 290);	
	}
	
	case 10:
	{
		g.setColor(Color.white);
		g.fillRoundRect(890,220,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(890,220,100,100,10,10);
		g.drawString("10", 905, 290);
	}
	
	case 11:
	{
		//3rd row
		g.setColor(Color.white);
		g.fillRoundRect(340,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(340,330,100,100,10,10);
		g.drawString("11", 355, 400);
	}
	
	case 12:
	{
		g.setColor(Color.white);
		g.fillRoundRect(450,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(450,330,100,100,10,10);
		g.drawString("12", 455, 400);
			
	}
		
	
	
	case 13:
	{
		g.setColor(Color.white);
		g.fillRoundRect(560,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(560,330,100,100,10,10);
		g.drawString("13", 570, 400);
	}
	
	case 14:
	{
		g.setColor(Color.white);
		g.fillRoundRect(670,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(670,330,100,100,10,10);
		g.drawString("14", 680, 400);
	}
	
	case 15:
	{
		g.setColor(Color.white);
		g.fillRoundRect(780,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(780,330,100,100,10,10);
		g.drawString("15", 790, 400);	
	}
	
	case 16:
	{
		g.setColor(Color.white);
		g.fillRoundRect(890,330,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(890,330,100,100,10,10);
		g.drawString("16", 900, 400);	
	}
	
	case 17:
	{
		//4th row
		g.setColor(Color.white);
		g.fillRoundRect(340,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(340,440,100,100,10,10);
		g.drawString("17", 355, 510);
	}
	
	case 18:
	{
		g.setColor(Color.white);
		g.fillRoundRect(450,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(450,440,100,100,10,10);
		g.drawString("18", 455, 510);	
	}
		
	
	case 19:
	{
		g.setColor(Color.white);
		g.fillRoundRect(560,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(560,440,100,100,10,10);
		g.drawString("19", 570, 510);
	}
	
	case 20:
	{
		g.setColor(Color.white);
		g.fillRoundRect(670,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(670,440,100,100,10,10);
		g.drawString("20", 680, 510);	
	}
	
	case 21:
	{
		g.setColor(Color.white);
		g.fillRoundRect(780,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(780,440,100,100,10,10);
		g.drawString("21", 790, 510);
	}
	
	case 22:
	{
		g.setColor(Color.white);
		g.fillRoundRect(890,440,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(890,440,100,100,10,10);
		g.drawString("22", 900, 510);
	}
	
	case 23:
	{
		//5th row
		
		g.setColor(Color.white);
		g.fillRoundRect(450,550,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(450,550,100,100,10,10);
		g.drawString("23", 455, 620);
		
	}
	


	case 24:
	{
		g.setColor(Color.white);
		g.fillRoundRect(560,550,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(560,550,100,100,10,10);
		g.drawString("24", 570, 620);
	}
	
	case 25:
	{
		g.setColor(Color.white);
		g.fillRoundRect(670,550,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(670,550,100,100,10,10);
		g.drawString("25", 680, 620);
	}
	
	case 26:
	{
		g.setColor(Color.white);
		g.fillRoundRect(780,550,100,100,10,10);
		g.setColor(Color.white);
		g.drawRoundRect(780,550,100,100,10,10);
		g.drawString("26", 790, 620);
	}

			}//end of switch
	
	
	
	
	}


	public static void removeAmount( double amount[],int user,Graphics g)
	{
		
	if(amount[user-1]==0.01)
	{
		g.setColor(Color.white);
		g.fillRect(35,45,250,35);
		g.setColor(Color.white);
		g.drawRect(35,45,250,35);
		g.drawString("0.01", 130, 75);
	}
	
	switch((int)amount[user-1])
	{
	case 1:
	{
		g.setColor(Color.white);
		g.fillRect(35,90,250,35);
		g.setColor(Color.white);
		g.drawRect(35,90,250,35);
		g.drawString("$1", 130, 120);
	}
	
	case 5:
	{
		g.setColor(Color.white);
		g.fillRect(35,135,250,35);
		g.setColor(Color.white);
		g.drawRect(35,135,250,35);
		g.drawString("$5", 130, 165);
	}
	
	case 10:
	{
		g.setColor(Color.white);
		g.fillRect(35,180,250,35);
		g.setColor(Color.white);
		g.drawRect(35,180,250,35);
		g.drawString("$10", 130, 210);
	}
	
	
	case 25:
	{

		g.setColor(Color.white);
	g.fillRect(35,225,250,35);
	g.setColor(Color.white);
	g.drawRect(35,225,250,35);
	g.drawString("$25", 130, 255);
	}

	case 50:
	{
		g.setColor(Color.white);
		g.fillRect(35,270,250,35);
		g.setColor(Color.white);
		g.drawRect(35,270,250,35);
		g.drawString("$50", 130, 300);
	}
	
	case 75:
	{
		g.setColor(Color.white);
		g.fillRect(35,315,250,35);
		g.setColor(Color.white);
		g.drawRect(35,315,250,35);
		g.drawString("$75", 130, 345);
	}
	
	
	case 100:
	{
		g.setColor(Color.white);
		g.fillRect(35,360,250,35);
		g.setColor(Color.white);
		g.drawRect(35,360,250,35);
		g.drawString("$100", 130, 390);	
	}
	
	case 200:
	{
		g.setColor(Color.white);
		g.fillRect(35,405,250,35);
		g.setColor(Color.white);
		g.drawRect(35,405,250,35);
		g.drawString("$200", 130, 435);
	}
	
	case 300:
	{

		g.setColor(Color.white);
	g.fillRect(35,450,250,35);
	g.setColor(Color.white);
	g.drawRect(35,450,250,35);
	g.drawString("$300", 130, 480);
	}
	
	case 400:
	{

		g.setColor(Color.white);
	g.fillRect(35,495,250,35);
	g.setColor(Color.white);
	g.drawRect(35,495,250,35);
	g.drawString("$400", 130, 525);
	}
	
	case 500:
	{
		if(amount[user-1]==0.01)
			g.setColor(Color.white);
			g.fillRect(35,540,250,35);
			g.setColor(Color.white);
			g.drawRect(35,540,250,35);
			g.drawString("$500", 130, 570);
	}
	
	case 750:
	{
		if(amount[user-1]==0.01)
			g.setColor(Color.white);
			g.fillRect(35,585,250,35);
			g.setColor(Color.white);
			g.drawRect(35,585,250,35);
			g.drawString("$750", 130, 615);
	}
	
	
	case 1000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,45,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,45,250,35);
		g.drawString("$1000", 1110, 75);
	}
	
	case 5000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,90,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,90,250,35);
		g.drawString("$5000", 1110, 120);
	}
	
	case 10000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,135,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,135,250,35);
		g.drawString("$10000", 1110, 165);	

	}
	
	case 50000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,180,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,180,250,35);
		g.drawString("$50000", 1110, 210);
	}
	
	case 25000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,225,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,225,250,35);
		g.drawString("$25000", 1110, 255);	
	}
	
	case 75000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,270,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,270,250,35);
		g.drawString("$75000", 1110, 300);
	}
	
	
	case 100000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,315,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,315,250,35);
		g.drawString("$100000", 1110, 345);	
	}
	
	case 200000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,360,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,360,250,35);
		g.drawString("$200000", 1110, 390);	
	}
	
	case 300000:
	{

		g.setColor(Color.white);
		g.fillRect(1050,405,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,405,250,35);
		g.drawString("$300000", 1110, 435);	
	}
	case 400000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,450,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,450,250,35);
		g.drawString("$400000", 1110, 480);
	}
	case 500000:
	{
		if(amount[user-1]==0.01)
			g.setColor(Color.white);
			g.fillRect(1050,495,250,35);
			g.setColor(Color.white);
			g.drawRect(1050,495,250,35);
			g.drawString("$500000", 1110, 525);
	}
	case 750000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,540,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,540,250,35);
		g.drawString("$750000", 1110, 570);
	}
	
	case 1000000:
	{
		g.setColor(Color.white);
		g.fillRect(1050,585,250,35);
		g.setColor(Color.white);
		g.drawRect(1050,585,250,35);
		g.drawString("$1000000", 1110, 615);
	}
	
	}// end of switch
	
	}
	
	
	public static void pause (int time) throws Throwable
	{
	
	
		Thread.sleep(1000);
	
		
		
	}
	
	
	public static void errorTrap(int user) throws IOException
	
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		do
		{
			//if(user<1||user>26)
			
			//{
				System.out.println("This is not a valid option. Please try again");
				user=Integer.parseInt(myinput.readLine());
			//}
			
			
				
	}	
				
				while(user<1||user<26);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	




















