import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Student {

	public static void main(String[] args) throws NumberFormatException, IOException 
	
	{
		BufferedReader myinput = new BufferedReader (new InputStreamReader(System.in));

		String ID;
		String name;
		String age;
		String grade1;
		String grade2;
		String grade3;
		String grade4;
		String grade5;
		String change;
		int numchoice;
		int add;
		int x =1;
		int total=0;
		String choice;
		String e;
		
		
		String table [][]= new String [20][8];
		
		
		
		do
		
		{
		
		System.out.println(" ");
		System.out.println("Enter a: To add student info");
		System.out.println("Enter c: To update student info");
		System.out.println("Enter l: To list a student's info");
		System.out.println("Enter s: To list all student info");
		
		choice=  myinput.readLine();
		
		if(choice.equalsIgnoreCase("c"))
		
		{
			System.out.println("Enter Student's ID:");
			ID=myinput.readLine();
			
			for(int r=0; r<20; r++)
			
			{
				
			
			if(ID.equals(table[r][0]))
					
					
					
					{
				
				//display menu for students averages
				for(int c=3; c<8;c++) 

					
				{
				
					System.out.print("\t" + table[r][c]);
					
			
			
				}
			
				
				System.out.println(" ");
				
				System.out.println("Enter" +" "+table[r][1]  + "'s # grade you want to change ex. 1/2/3/4/5:");
				numchoice=Integer.parseInt(myinput.readLine());
					
				System.out.println("Enter" +" "+table[r][1]  + "'s average you want to replace:");
				change =myinput.readLine();
					
				switch(numchoice)
				{
				
				case 1:
						{
					
							table[r][3]=change;
					
							break;
				
						}
				
				
				case 2:
						{
							table[r][4]=change;
							
							break;
							
						
						}
				
				case 3: 
						{
							table[r][5]=change;
							
							break;
						}
				
				case 4: 
				
						{
							table[r][6]=change;
					
							break;
						}
						
				case 5: 
						{
					 
							table[r][7]=change;
					
							break;
						}
				
			
				}//end of switch
					
					
				
				
				//prints updated averages
				for(int c=3; c<8;c++) 

			
				{
				
					System.out.print("\t" + table[r][c]);
			
			
			
				}
			
					}// end of if 
			
		
			
			}//end of first for 
		
		
		}//end of first if
		
		
		
		if(choice.equalsIgnoreCase("a"))
		
		{
			
			
			System.out.println("How many students do you wish to add?:");
			add=Integer.parseInt(myinput.readLine());
			
			int prevResult=total;
			total=total+add;
			
		
				
				if(total<=20)
				
				{
			
					
					int r=-1+add;
					
					
					if(r==0)
					{
						r++;
					}
				
			
					for(r= (prevResult + (r-1)); r<total; r++)
			
			{
				
				System.out.println("Enter Student ID:" +" " + (r+1));
				ID= myinput.readLine();
				table [r][0]=ID;
				 
				System.out.println("Enter Student's name:"+" " + (r +1) );
				name= myinput.readLine();
				table [r][x]=name;
				
				System.out.println("Enter Student's age:"+" " + (r +1));
				age= myinput.readLine();
				table [r][x+1]=age;
				
				System.out.println("Enter Student's final grade 1:");
				grade1= myinput.readLine();
				table [r][x+2]=grade1;
				
				System.out.println("Enter Student's final grade 2:");
				grade2= myinput.readLine();
				table [r][x+3]=grade2;
				
				System.out.println("Enter Student's final grade 3:");
				grade3= myinput.readLine();
				table [r][x+4]=grade3;
				
				System.out.println("Enter Student's final grade 4:");
				grade4= myinput.readLine();
				table [r][x+5]=grade4;
				
				System.out.println("Enter Student's final grade 5:");
				grade5= myinput.readLine();
				table [r][x+6]=grade5;
				
		
			
			}
			
			
				
				
				}//end of if
			
		
				else 
				
				{
					System.out.println("Sorry, no more spots available");
				}
				
		
				
				//print table 1 info
			for(int z=0; z<total;z++)
				
				
			{
			

			
				for(int c=0; c<table[0].length;c++) 

			
				{
				
					System.out.print("\t" + table[z][c]);
			
			
			
				}
			
			
				System.out.println(" ");
			
		}
		
		
			
		
		
		
	
		
		}//end od bigger if
		
		
		if(choice.equalsIgnoreCase("l"))
		
		{
			
		
			System.out.println("Enter Student ID:");
			ID= myinput.readLine();
		
		for(int r=0;r<20; r++)
			
		{
			if(ID.equalsIgnoreCase(table[r][0]))
			{
			
				for(int c=0; c<8; c++)
				{
					System.out.println(table[r][c]);
				}
			
			}
			
			
			
			
		}
		
		
	}
		
		
		
		
	
		if(choice.equalsIgnoreCase("s"))
		
		{
		
		
		for(int z=0; z<table.length;z++)
			
			
		{
		

		
			for(int c=0; c<table[0].length;c++) 

		
			{
			
				System.out.print("\t" + table[z][c]);
		
		
		
			}
		
			System.out.println( );
		
	}
	
	
	}
	
		
		System.out.println("Enter e: To exit/ press c to continue");
		e=myinput.readLine();
		
		}//end of do
		
		while(!(e.equalsIgnoreCase("e")));
	
		System.out.println("See ya next time!");
	
	
	}
	

}
