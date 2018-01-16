package pac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args) throws IOException
	{

		String[] name={"martina","john","Iriney","George"};
		int []age={16,8,37,46};
		
		boolean flag = true;
		
		while(flag)
		{//start of while
			flag=false;
		
		for (int i = 0; i < age.length - 1; i++) 
         {//start of for
           
                 if (name[i].compareTo(name[i + 1])>0); 
                {//start of if
         /*
         *Swap age with lowest age
         */
                 String nameTemp;
                 nameTemp= name[i];
                         name[i] = name[i + 1];
                               name[i + 1] = nameTemp;
 
                               flag=true; /*
                Swap name using the same index of the age
                        */

                     //    int ageTemp = age[i];
                   //       age[i] = age[i + 1];
                     //         age[i + 1] = ageTemp;

               //flag=true;
                }//end of if
                
                 
            
            
            }//end of for
         
		}//end of while
	
		for(int x=0;x<=name.length-1;x++)
		 {
			 
			 {
				
				 System.out.println(name[x]+age[x]);
				 
			 }
			
		 }
	  
            
            
            
            
            
            
            
            }}