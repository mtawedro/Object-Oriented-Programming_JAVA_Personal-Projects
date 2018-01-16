/*



int findSubString(char original[], char toFind[])
		
		{
		
		int k =0;
		int start =0;
		int length= strlen(toFind); 
		
		//change everything to length down
		 
		  for(int i =0; i<strlen(original[1]); i++)
		
		    {
		      
		        if(original[1][i] == toFind[0])
		        
		           {
		              for(int j=1; j<strlen(toFind); j++)
		                 
		                 {
                               if(toFind[j] == original[1][i + j])
                                  
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
		


























*/