public class ComputerO 

{

	DisplayBoard cellsB = new  DisplayBoard();
	
	//declare variables
	int currentScore;
	
	boolean endGame =false;
	
	
	String[ ][ ]cells= {

			{ "", "", "", ""},

			{ "" ,"", "", ""},

			{ "", "","","" },

			{ "", "", "", "" }};
    
  
	//Searches row by row to find if they have any 4 O's in the row
 	 public static void EndTheGameO( String cells[][]) 
 	  
 	   {
 		   
 		//Declare variables
 		 boolean endGame =false;
 	     
 		   for(int row=0; row<=3; row++)
 	    
 	    
 		   {//start of for
 	     
 			  //sets count to 0 after searching each row
 			  int countO=0;
 	    
 			  
 			  for(int col=0; col<=3; col++)
 	     
 	    
 	    
 			   {// start of second for
 	     
 				   //if O found in row, then increment coutO by 1
 				   if(cells[row][col]=="O" )
 	     
 	    
 				   {//start of if
 	     
 	    
 	    		 
 					   countO++;
 	     
 	   
 				   }//end of if
 	     
 	    
 	    
 			   }//end of second for
 	  
 			   
 			  //after looping the row check the valueO, if =4 then en the game
 			   if(countO==4  )
 	  
 	   
 			   {
 	    	
 				   endGame=true;
 	    	 
 				   System.out.println("Player O won! Game Over...");
 	    	
 				   System.out.println("Score:");
 	    	 
 	    	
 				   System.exit(0);
 	    
 			   }
 	     
 	     
 	     }//end of first for

 	   
 	     //Searches column by column to find if they have any 4 O's in the col (same process)
 	     for(int col=0; col<=3; col++)
 	    
 	     {
 	     
 	    	 int countOC = 0;
 	    	 
 	    	 
 	    	 for(int row=0; row<=3; row++)
 	     
 	    
 	    	 {
 	     
 	    	 
 	    		 if(cells[row][col]=="O")
 	     
 	     
 	    	 {
 	     
 	    
 	    		 countOC++;
 	     
 	    
 	    	 }
 	     
 	    
 	    	 }
 	     
 	  
 	    
 	    	 if(countOC==4)
 	  
 	    
 	    	 {
 	    	 
 	    		 endGame=true;
 	    	 
 	    	
 	    		 System.out.println("Player O won! Game Over...");
 	    	
 	    		 System.out.println("Score:");
 	    	 
 	    	
 	    		 System.exit(0);
 	    	 
 	    	 
 	   
 	    	 }
 	     
 	    
 	     }
 	   
 	   }

 	 	
 	 	//Searches row by row to find if they have any 4 X's in the row (same process)
 	     public static void EndTheGameX(String cells[][]) 
 	     
 	     {
 	     
 	    	boolean endGame =false;
 	    	  
 	     
 	    	 for(int row=0; row<=3; row++)
 	    	
 	    	 {
 	     
 	    		int countX=0;
 	     
 	    
 	    		 for(int col=0; col<=3; col++)
 	     
 	     
 	    		 {
 	     
 	    	 
 	    			 if(cells[row][col]=="X")
 	     
 	    
 	    			 {
 	     
 	    
 	    		
 	    				 countX++;
 	     
 	    
 	    			 }
 	     
 	    
 	    		 }
 	     
 	  
 	    
 	    		 if(countX==4)
 	  
 	     
 	    		 {
 	    	
 	    			 endGame=true;
 	    	 
 	    	
 	    			 System.out.println("Player X won! Game Over...");
 	    	
 	    			 System.out.println("Score:");
 	    	 
 	    	
 	    			 System.exit(0);
 	    	 
 	    	 
 	     
 	    		 }
 	     
 	     
 	     }

 	     
 	     //Search column by column to find if they have any 4 X's in the col
 	     for(int col=0; col<=3; col++)
     
 	   
 	     {
 	     
 	    	 int countXC = 0;
 	    
 	    	
 	    	 for(int row=0; row<=3; row++)
 	     
 	     
 	    	 {
 	     
 	    	 if(cells[row][col]=="X")
 	     
 	    
 	    	 {
 	     
 	    
 	    		 countXC++;
 	     
 	     
 	    	 }
 	     
 	     }
 	     
 	  
 	    
 	    	 if(countXC==4)
 	  
 	     
 	    	 {
 	    	
 	    		 endGame=true;
 	    	 
 	    	
 	    		 System.out.println("Player X won! Game Over...");
 	    	
 	    		 System.out.println("Score:");
 	    	 
 	    	 
 	    		 System.exit(0);
 	    	 
 	    	 
 	     
 	    	 }
 	     
 	     
 	     }
 	     
    
     }  
 
   
 	    //Searches  row by row to find first empty cell the put O on it
 	     public void ComputerPlay(String cells[][])
     
     {
     
 	    //random cell number put in for row
    	 int randomCellRow= (int) (Math.random()*3+0);
 	    
    	//random cell number put in for row
    	 int randomCellColumn= (int) (Math.random()*3+0);
    	 
    
    	 System.out.println("Player O's Turn:");
    	 
    
    	 for(int x=randomCellRow; x<= 3; x++)
    
    
    	 {
     
     
    
    		 for(int y=randomCellColumn; y<=3; y++)
     
    
    		 {

    	  
    			 //if empty cell put O and exit
    			 if(cells[x][y] =="" )
    	
    	
    			 {
    		
    				 cells[x][y]="O";
    		
    		
    				 //prints updated game board
    				 cellsB.PrintCells2(cells);
    		 
    				//breaks out of 'if'
    				 break;
    	
    			 }

    			 //breaks out of inner loop
    			 break;
    
    		 }

    		 //breaks out of outer loop
    		 break;
     
     }


}




}
