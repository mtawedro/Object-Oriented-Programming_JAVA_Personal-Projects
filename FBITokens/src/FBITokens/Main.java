package FBITokens;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args)
	{
		BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		String fileName = "45,2000,300,50,martina,john,l";// supose to read in  the file
		String inputLine;
		StringTokenizer words;
		
		String section;
		
		int convertage;
		int convertYear;
		double convertSal;
		double convertSav;
		String convertName;
		String convertState;
		String convertCar;
		
		
		
		
int i =0;
int x=0;
		


words = new StringTokenizer(fileName, ","); // look for delimiters
	   
String [] name= new String[10]; 
		String [] add= new String[10]; 
	    String [] state= new String[10]; 
		int [] age= new int[10]; 
		String [] sex= new String[10]; 
		double [] sal= new double[10]; 
		double [] sav= new double[10]; 
		String [] car= new String[10]; 
		int [] year= new int[10]; 
		
		//try
		//{--> start of try
		
		
		//BufferedReader myinput=new BufferedReader(new InputStreamReader(System.in));
		//*BufferedReader in =new BufferedReader(new FileReader(fileName));
		//inputLine= in.readLine();
		
		
		// int x=0;
		// while(inputLine!=null)
		
		// x++;
		
		//System.out.println(inputLine)
		//{
		
		while(words.hasMoreTokens()) // when done readline supoose to add another while. 

		{
			
			section= words.nextToken();
			i++;// counts token
			                            //x++;// counts position in array
			
			if(i==1)// first array
			{	
			
				name[0/*x*/]=section; // don't have to convert already string 
				
			}
			
			else if(i==2)
			{	
			
				add[0/*x*/]=section;
				
			
			
			}
			
			else if(i==3)
			{
				
				state[0/*x*/]=section;
				
				
				
			}
			
			else if(i==4)
			{
				
				convertage = Integer.parseInt(section);// converts age to number
				age[0/*x*/]=convertage;// adds this number to an array
				
				
			}
			
			else if(i==5)
			{
				
				sex[0/*x*/]=section;
				
				
			}
			
			else if(i==6)
			{
				

				convertSal = Double.parseDouble(section);
				sal[0/*x*/]=convertSal;
				
				
				
			}
			
			else if(i==7)
			{
				
				
				convertSav = Double.parseDouble(section);
				sav[0/*x*/]=convertSav;
			}
			
			else if(i==8)
			{
				
				car[0/*x*/]=section;  // don't have to convert already string 
			}
			
			else if(i==9)
			{
				
				convertYear = Integer.parseInt(section);
				year[0/*x*/]=convertYear;
			}
			
			
			
		}// end of loop
			
		
		//inputLine= in.readLine();
		
		//}	
			
		
		//in.close();
		
		
	//} --> end of try	
		
		// catch (IOException e)
		//{
		// System.out.print("Problem reading" + fileName);
		//}
		
		
		
			
			
			}// end of main
			
			
	
		
		
		}// end of class

		

	

	
	