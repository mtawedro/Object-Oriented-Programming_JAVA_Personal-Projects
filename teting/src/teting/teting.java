/*
#include <stdio.h>

#include <string.h>

#include <stdlib.h>




void insertString(char original[], int start, int length, char toInsert[])

{







    int frontRemain = 0;

    int endRemain = 0;

    char frontArray[80]= " ";

    char endArray[80]= " ";

    char firstHalf[80];

    char final[80];

    int store = 0;

    int count = start + length; 

    int z= 0;




           for(int i = 0; i<start; i++)

             

             {

				 

                frontArray[i] = original[i];




             }







           for(count+1; count<strlen(original); count++)

                

              {

                   endArray[z] = original[count];

                   z++;

             

              }







            strcpy(firstHalf, (strcat(frontArray, toInsert)));




            strcpy(final, (strcat(firstHalf,endArray)));




            print("New Line is %s ",final);

            

            

            

           

          // for(int r=0; r<5; r++)

           

           //{

			   //for(int c = 0; c<strlen(original); c++)

			   

			   //{

				//   printf("%c", original[r][c]);

				   

			  // }

           

	      //}

         

           //printf("%s\n%s\n%s\n%s\n%s\n",original[0], original[1], original[2],original[3],original[4]);



//print the rest of the lines



}


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







//function 1

int replaceInString(char original[], char substring[], char replace[])

    

    {//start of function 1

             

             int start = 0;

             int length = 0;

             char toFind[80] = " ";

                  

             strcpy(toFind, substring);

             length = strlen(toFind);

             //start= findSubString(original, toFind);

           // printf("\nshould be INDEX 2:%d", start);

          

                  if(start == -1)

                     {

                       return 0;

                     }

               

                 else

                    

                    {

                        //printf("INDEX:%d", start);

                        //insertString(original, start, length, replace);

                        start=1;

                        return start;

                    }




    }//end of function 1




int main(void)




{//start of main




// main

//***include main from 3rd function




//char original[80]= " ";

//strcpy(original, "martinajohn");




//original[80] = "martinajohn";

//char toFind[] = "tina"; // test

//char replace[] = "ooooooooooooooooooooooooo";

//int length= strlen("tina");







int ROWS=5;

int COLS= 80;

char buffer[ROWS][COLS];

char tempBuffer[80] = " ";

int num = 0;

char substring[80]=" ";

char replace[80]= " ";


int start = 0;


int fail = 0;



strcpy(buffer[0],"1 I can dream, dreams that nobody has dreamt before" );

strcpy(buffer[1],"2 advent adventures all over the world" );

strcpy(buffer[2],"3 I want to write out my imagination" );

strcpy(buffer[3],"4 tomorrow and yesterday and today" );

strcpy(buffer[4],"5 A yellow fire clinging deep in a dry well" );







printf("%s\n%s\n%s\n%s\n%s\n",buffer[0], buffer[1], buffer[2],buffer[3],buffer[4]);




//num = 4;




 strcpy(tempBuffer, buffer[(num-1)]);




   int orLen=strlen(tempBuffer);




    for(int x = orLen; x < 80; x++ )

        {

          tempBuffer[x] = '\0';

        }


  //second function
   start =  findSubString(buffer[3], "tomorrow"); //call function ak uer
   printf("Should return index 2: %d\n",  start);
   
   start =  findSubString(buffer[2], "want to write"); //call function ak uer
   printf("Should return index 4: %d\n",  start);
   
   start =  findSubString(buffer[0], "martina"); //call function ak uer
   printf("Should return -1: %d\n",  start);
   
   start =  findSubString(buffer[1], "adventures"); //call function ak uer
   printf("Should return index 9: %d\n",  start);

   start =  findSubString(buffer[4], "Ayell"); //call function ak uer
   printf("Should return -1: %d\n",  start);
  
//first function
   fail =  replaceInString(buffer[3], "tomorrow", "candy"); //call function ak uer
   printf("Should return 1: %d\n",  fail);
   
   fail =  replaceInString(buffer[2], "want to write", "hate"); //call function ak uer
   printf("Should return 1: %d\n",  fail);
 
   fail =  findSubString(buffer[0], "martina", "john"); //call function ak uer
   printf("Should return 0: %d\n",  fail);
 
   fail =  findSubString(buffer[1], "adventures", "advent"); //call function ak uer
   printf("Should return 1: %d\n",  fail);

   fail =  findSubString(buffer[4], "Ayell", "hello"); //call function ak uer
   printf("Should return 0: %d\n",  fail);
   
  
   //third function   
    // put definition from function 3
   insertString(buffer[3], 2, strlen("tomorrow"), "candy");
   printf("Should be: 4 candy and yesterday and today\n");
   
   
  insertString(buffer[2],4, strlen("want to write"), "hate"); //call function ak uer
  printf("Should be: 3 I hate out my imagination\n");
   
   
   
 
 
 
 
 
 
 



//num = 5;







//result= replaceInString(tempBuffer, "5 A yellow fire clinging", "fire fire fire burning on"); //call function ak uer




//printf("\nReplace Final String Should be: fire fire fire burning on deep in a dry well %s\n", result);






return 0;




}//end of main





































*/