package pracicecc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException 
	
	{
		
		/*
		int num1 = 0;
		double num2 = 28.6;
		char lett = ' ';
		
		
		printf("Enter an Int value:");
		scanf("%d", &num1);
		printf("\nEnter a character:");
		scanf("%c", &lett);
		printf("\nThe 3 values are %lf %d and %c", num2, num1, lett);
		
		//
		int numSleep = 0;
		
		
		
		printf("Enter the amount of sleep you had for the previous night");
		scanf("%d" &numSleep);
		
		
		if( numSleep >= 0 && numSleep <= 4)
		{
			printf("Sleep deprived!");
		}
		
		else if(numSleep > 4 && numSleep < 6)
		{
			printf("You need more sleep");
			
		}
		
		else if(numSleep >= 6 && numSleep < 8)
			
		{
			printf("Not quite enough");
			
			
		}
		
		
		else if(numSleep >= 8)
		{
			printf("Well Done!");
		}
		
		*///
	
		
		/*
		BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));

		double userNum = 0; 
		double sum = 0;
		
		printf("Enter a value or enter -335 to exit");
		scanf("%lf", &userNum);
		
		while ((int)userNum != -335)
				
		{
			
			sum = sum + userNum;
			
			printf("\nEnter a value or enter -335 to exit");
			scanf("%lf", &userNum);
			
			
			
		}
		
	printf("\nSum of values: %.2f", sum);
	

	//
	
	char userChar = ' ';
	int a = 0;
	int b = 0;
	int c = 0;
	
	printf("Enter a next letter (a b or c) or type q to quit:");
	scanf("%c", &userChar);
	
	while(userChar != 'q')
			
		
	{
		
		switch(userChar)
		
		{ //start of switch
		
		case 'a':
		case 'A': 
					a++;
					printf("\na: %d\n", a );
					break;
		case 'b':
		case 'B':
			       	b++;
			       	printf("\nb: %d\n", b );
					break;
			
		case 'c':
		case 'C':
					c++;
					printf("\nc: %d\n", c );
					break;
					
					
		default:
				printf("\nOops! incorrect input");
				break;
				
	
		}//end of switch
		
		
		
		printf("-- Please enter the next letter or type q to quit:");
		scanf("%c", &userChar);
		
	
	}//end of while
	/*
	
		//
	int step = 3;
	int size = 4;
	double count = -1.0;
	double len;
	int val;
	int MAX = 500;
	double PI = 3.14159;
	

	val = step % size; // 3
	System.out.println(val);   
	val = (450 - MAX)/ step; // -16
	System.out.println(val);
	val = size % step;       // 1
	System.out.println(val);
	len = PI * count; 		//  -3.14159
	System.out.println(len);
	val = step / -size;     // 0
	System.out.println(val);
	len = step/size;       //0.0
	System.out.println(len);
	//len = step % (step/size); --> invalid because undefined value (cannot divide 3 by 0)! This will give an error when line is executed
	//System.out.println(len);
	//val = size/0;            -->  invalid because undefined value (cannot divide 4 by 0)! This will give an error when line is executed 
	//System.out.println(val);
	val = step % (470-MAX); // 3
	System.out.println(val);
	val = (MAX - 470)/size; // 7
	System.out.println(val);
	len = size/count;       // -4.0
	System.out.println(len);
	//val = PI * step;      --> invalid because the constant variable PI is a double(floating point value) and the variable step is 
								//an integer value and when you multiply a double by int the result is a double and so the 
								// holding variable must be a type double, however the variable val is an integer. The solution
								// to this is casting val as a double to hold the resulting value. 
	
	//val = step % (MAX - 480)  --> invalid missing semicolon;
	val = (MAX - 480)%step; // 2
	System.out.println(val);
	len = (double) step/size; //0.75
	System.out.println(len); 
	
*/
	//
	
	
		
		
		
		
		/*
		
		#include <stdio.h>
		#include <stdbool.h>
		
		void PrintArray(int num [])
		
		{
		
		
		for (int i = 0; i <= 2; i++)

		{// start of for.
		
		
			printf("%d\n", num[i]);
		
		
		}
 	
		
		
		
	}
		
		void Sort(int num[])
	 	
	 	
	 	{//start of Sort method.
			
		boolean flag = true;// set flag to true to begin first pass.

		while (flag)

		{// start of while

			flag = false;// set flag to false awaiting a possible swap

			for (int j = 0; j < 2; j++)

			{// start of for.

					if (num[j] > num[j + 1]) //Least to Greatest (ascending sort).

				    {// start of if.

					// Swapping names.
					int numTemp;// holding variable.
					numTemp = num[j];
					num[j] = num[j + 1]; // swap elements.
					num[j + 1] = numTemp;
	 
					
					flag = true;// shows a swap occurred.
					
	 				}// end of if.

			}// end of for.

		}// end of while.


		PrintArray(num);
	

	}// end of Sort method.
		

		int main (void)
		
		{
		
		int num [3]; 
		int user = 0;
	
		for (int i = 0; i <= 2; i++)

			{// start of for.
			
			
			printf("Enter an int Num:");
			scanf("%d", &user);
			num[i]= user;
			
			
			
			}
		
		
		Sort(num);
		
		
		
		return 0;
	    
	    }
	
		
		
		
		
		
		cons int MAX_LEN = 6;
		
		int sum = 0;
		
		int num [MAX_LEN] =	{8,1,3, 6, 2, 10}
		
		
		
		for(int i = 0 ; i < MAX_LEN; i++)
		
		{
		
		if (num [i] % 2 == 0)
		
		{
		
		sum = sum + num [i];
		
		}
		
		
		}
		
		printf("%d", sum);
		
		
		
		
		
		int MAX_LEN = 5;
		
		char name [] = {'M','O','M', 'M, 'Y'};
		
		int findM( int name [], int MAX_LEN)
		
		{
		
		for(int i = 0 ; i < MAX_LEN; i++)
		
		{
		
		if(word[i] == 'M')
		
		{
		 
		 return i;
		 
		 break;
		
		}
		
	
		}
		
		return –1;
		
		
		}
		
		
		
		
		
		// 
		
		
		#include <stdio.h>
        #include <string.h>
        #include <stdlib.h>

    int findSubString(char original[], char toFind[])
		
		{
		
		int k =0;
		int start =0;
		int length= strlen(toFind); 
		
		//change everything to length down
		
		  for(int i =0; i<strlen(original); i++)
		
		    {
		        if(original[i] == toFind[0])
		        
		           {
		              for(int j=1; j<strlen(toFind); j++)
		                 
		                 {
                               if(toFind[j] == original[i + j])
                                  
                                  {		   
		                             k++;
		                          
		                             if(k == strlen(toFind) -1)
		                          
		                               {
		                                  start = i;
		                                  return start;
		                          
		                               }
		                          
		                           }
		                          
		                          
		                    }
		              }            
		     }
		
		return -1;
		
	
	
	}
		





int main(void) 

{
	
         char original[] = "martinajohn";
		 char toFind[] = "tina";  // test
		 int index = 0;
		
		index = findSubString(original, toFind);
		printf(" Index %d", index);


	return 0;
}


		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//function 3
	 
	 	
	 	#include <stdio.h>
#include <string.h>
#include <stdlib.h>



void insertString(char original[], int start, int length, char toInsert[])

{



int frontRemain = 0;

int endRemain = 0;

char frontArray[60];

char endArray[60];

char firstHalf[60];

char final[60];

int store = 0; 


	for(int m = 0; m<strlen(frontArray); m++ )
	{
		frontArray[m] = "  ";
		endArray[m] = "  ";
		firstHalf[m] = "  ";
		final[m] = "  ";
	
	
	}







//up to beggining of the ubtring
for(int x = 0; x<3; x++)

  {

    frontRemain++;

  }


//put letter in each poition up to the begging of the ubtring
for(int i = 0; i<frontRemain; i++)

   {

    frontArray[i] = original[i];

     store++;


   }





frontArray[store+1] = '\0';

//start at the end of ubtring and add one to get the next poition(start of remaing of orogual) to the end of oroginal
for(int k = length+1; k<=strlen(original); k++)

  {

      endRemain++;
  }

//put each letter from the end of ubtring +1 into end array  to the end of the original 
for(int u = length+1; u<=strlen(original); u++)

  {

    endArray[u] = original[u];

    store++;

 }


endArray[store +1] = '\0';

strcpy(firstHalf, (strcat(frontArray, toInsert)));

//toInsert[length]= '\0';
//printf("%s", firstHalf);

//printf("\n end part %s:",  strcat(toInsert, endArray));


// include null ter put after marball
//int len = strlen(firstHalf);


//	printf("%s", firstHalf);
	
	


//firstHalf[len+1]= '\0';
//printf("length of firthalf %d", len);
 
// strcat(firstHalf,endArray);
 //printf("\nend part %s:",  strcat(firstHalf,endArray));
 
 strcpy(final, (strcat(firstHalf,endArray)));

// strcpy(firstHalf, endArray);




//printf("\nReplace string %s:", final);







}
int main(void) {
	// your code goes here

char original[60]= "  ";


	for(int o = 0; o < strlen(original); o++ )
        {
          	original[o] = " ";
          	
         }



        original[10] = "martinajohn";
		 char toFind[] = "tina";  // test
		 char replace[] = "ball";
		int length= strlen("tina");
		// int index = 0;
		
	//	index = findSubString(original, toFind);
	//	printf(" length %d", length);

insertString(original, 3, length, replace);
	
	return 0;
}










// main
 
 ***include main from 3rd function
 
 int ROWS=5;
 int COLS= 80;
 char buffer[ROWS][COLS];
 char tempBuffer[] = " ";
 int fail = 0;

	strcpy(buffer[0],"tomorrow and yesterday and today" );
	strcpy(buffer[1],"tomorrow and yesterday and today" );
	strcpy(buffer[2],"tomorrow and yesterday and today" );
	strcpy(buffer[3],"tomorrow and yesterday and today" );
	strcpy(buffer[4],"tomorrow and yesterday and today" );

 
 
 do
 {
   printf("please  choose a line to edit: 1,2,3,4 or 5, press 10 to exit\n");
   scanf("%d", &num); 
   getchar();
 
   //pass in num and get rid of switch?
 
    strcpy(tempBuffer, buffer[num]);
    
    askUser(tempBuffer, substring, replace); //call function ak uer

    
   }  while(num!=10);
     
     
     
     
     //switch(num,  )
       //{
         // case 1:



//eperate function
void askUser(char tempBuffer[],char substring[], char replace[])

{
               
             int c   = -1;
               printf("press r to remove the whole line\n");
               scanf("%c", &user);
               getchar();



                   if(user == 'r' || user == 'R')

                      {//tart of if

                           for(int i = 0; i <strlen(tempBuffer); i++)

                               {

        // num min 1                       
                                         c++;
                                         tempBuffer[i] = ' ';
                                          
                                  
                               }

                        //break;
                        
                        }//end of if




                printf("press \'s\' to insert or delete a substring in line\n");

                scanf("%c", &user);
                getchar();

               


     if(user == 's' || user == 'S')


     {//tart of if

               printf("Enter in the substring you want to remove:\n");

               getf(substring, 80 ,stdin); 
               
                    if(substring[strlen(substring)-1] == '\n')
	                    
	                    {
		  
		                   substring[strlen( substring)-1] = '\0';
	                    
	                    }



               printf("Enter in the word you will like to replace:\n");

                getf(replace, 80 ,stdin); 
               
                    if(replace[strlen(replace)-1] == '\n')
	                    
	                    {
		  
		                   replace[strlen( replace)-1] = '\0';
	                    
	                   }

              fail =  replaceInString(tempBuffer, substring, replace);  
              
              
              while(fail == 0) 
              
              {
              
                  printf("\nSrry coudn't find substring, please enter in another substring you want to remove:\n");

                   getf(substring, 80 ,stdin); 
               
                      if(substring[strlen(substring)-1] == '\n')
	                    
	                    {
		  
		                   substring[strlen( substring)-1] = '\0';
	                    
	                    }
              
              
              }



           printf("\nSucsess);
    //  break;
     
     } //end of if

 

//case 2: 











}
		
		
		
		//function 1
		
		
		int replaceInString(char original[], char substring[], char replace[])
		
		{//tart of function 1
		
		int start = 0;
		int length = 0;
		char toFind[] = " ";
		
		strcpy(toFind, substring);
		length = strlen(toFind);
		
		start= findSubString(original[1], toFind);
		
		if(start == -1)
		{
		
		return 0;
		
		}
		
		else 
              {

                       printf("INDEX 3:%d", start);
                    
                       insertString(original[1], start, length, replace);
                       
                            start=1;
                            
                            return start;
                         
              
              }
		
		
		}//end of function 1
		
		
		
		
		
		
		
		
		
		//TET Function1 
		
		
		
		
		
		
		#include <stdio.h>
#include <string.h>
#include <stdlib.h>


int replaceInString(char original[], char substring[], char replace[])
		
		{//tart of function 1
		
		int check = 4;
		//check= findSubString(original, toFind);
		check = 4;
		
		if(check == -1)
		{
		
		printf("in here\n");
		return 0;
	
		
		}
		
		else 
              {

                   
                   printf("\nwork");  // insertString(original[0], start, length, replace);
                   
                       check=1;
                       return check;
                     
                  
              }
		
		
		}//end of function 1
		


int main(void) {
	 char original[] = "martinajohn";
		 char substring [] = "tina";  // test
		 char replace[] = "ball";
		 int fail = 0;
		
	
	  
	fail = replaceInString(original, substring, replace);
	printf("\nTEt");
		
	 while(fail == 0) 
              {
              
              printf("try again");
              
              
              }
	
	
	
	return 0;
}


*** tet one:

    strcpy(buffer[0],"tomorrow and yesterday and today" );
	strcpy(buffer[1],"tomorrow and yesterday and today" );
	strcpy(buffer[2],"tomorrow and yesterday and today" );
	strcpy(buffer[3],"tomorrow and yesterday and today" );
	strcpy(buffer[4],"tomorrow and yesterday and today" );



repeate main in function 3 over and over agin but with diff case staments









		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 
	 */
		
	 

	 
	 
		

	 
	 
	 
	 
	 
	 
	 
	
	
	
	}




}
