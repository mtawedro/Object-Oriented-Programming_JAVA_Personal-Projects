package prac2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{

		String[]name={"Bowman","Walker","Christian","Edwards","Cummings","Halpern","Scott","Rhineheart","Haley","Brooks"};
		 String[]add={" Canaan","Newark","Hardwick","Montgomery","Trenton","Liverpool","Sheridan","Houston","Westfield","Syosset"};
		 String[]state={"CT",     "NJ",     "VT",      "AL",       "NJ",      "NY",       "WY",      "TX",      "NJ",       "NY"};
		 int[]age={      48,       39,		 46,        71,         31,        38,         51,        62,        22,         32};
		 char[]sex={     'M',      'F',      'M',       'M',        'M',       'F',        'M',       'F',       'F',        'M'};
		 int[]sal={     18000,    27000,    59000,     78000,       25000,     45000,     19000,     91000,     33000,       40000};
		 int[]sav={      4200,     3600,     1900,      500,         7800,     12000,      400,      53200,     4700,         3900};
		 String[]car={"Saturn",    "Olds",   "Chev",    "Chev",     "Ford",     "Chev",    "Ford",   "Cad",     "Honda",      "Ford"};
		 int[]year={    1999,       2000,     2001,      2003,       2004,       2002,      2006,     2005,       2002,        2004};
		 
		
		boolean flag = true;
		
		while(flag)
		{//start of while
			flag=false;
		
		for (int i = 0; i < age.length - 1; i++) 
         {//start of for
           
                 if (name[i].compareTo(name[i + 1])>0) 
                {//start of if
         /*
         *Swap age with lowest age
         */
                 String nameTemp;
                 nameTemp= name[i];
                         name[i] = name[i + 1];
                               name[i + 1] = nameTemp;
 
                              // flag=true; 
                               /*
                Swap name using the same index of the age
                        */

                        String addTemp;
                        addTemp= add[i];
                        add[i] = add[i + 1];
                             add[i + 1] = addTemp;

                             String stateTemp;
                             stateTemp= state[i];
                             state[i]= state[i+ 1];
                             state[i+ 1]=stateTemp;
                             
                             int ageTemp;
                             ageTemp=age[i];
                             age[i]=age[i + 1];
                             age[i + 1]=ageTemp;
                             
                             char sexTemp;
                             sexTemp=sex[i];
                             sex[i]=sex[i + 1];
                             sex[i + 1]=sexTemp;
                             
                             int salTemp;
                             salTemp=sal[i];
                             sal[i]=sal[i + 1];
                             sal[i + 1]=salTemp;
                             
                             int savTemp;
                             savTemp=sav[i];
                             sav[i]=sav[i + 1];
                             sav[i + 1]=savTemp;
                             
                             String carTemp;
                             carTemp= car[i];
                             car[i]= car[i+ 1];
                             car[i+ 1]=carTemp;
                             
                             int yearTemp;
                             yearTemp=year[i];
                             year[i]=year[i + 1];
                             year[i + 1]=yearTemp;
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             
                             flag=true;
                }//end of if
                
                 
            
            
            }//end of for
         
		}//end of while
	
		for(int x=0;x<=75;x++)
		 {
			 
			 {
				
				 System.out.print("*");
				 
			 }
			
		 }
	  
            
            
            
            
            
            
            
	}       } 