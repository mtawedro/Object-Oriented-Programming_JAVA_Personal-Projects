
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userX

{
	DisplayBoard cellsB = new DisplayBoard();

	//declares and initializes variables
	String user;

	String userName;

	String password;

	int userChoiceRow;

	int userChoiceColumn;

	int userNum;

	int userUsed = 0;

	int Anwser;

	int currentScore = 0;

	int incrementScore = 500;

	int computer = 0;

	int userLives = 2;
	
	String Name;

	//Creates object 5- computer
	ComputerO PlayerO = new ComputerO();


	BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));

    
	//constructor 1
	 public userX()
	 {
		 
	 }

	
	//Constructor 2
    public userX(String user, String userName, String password)

    {

        

        this.user=user;

        

        this.userName=userName;

        

        this.password=password;

    

    }

    

    //constructor 3
   public userX( String userName,String password) throws IOException

    {

        

        this. password =password;

        

        this. userName= userName;

     
             

    }
    
   	//main method function that allows user to input the targeted position and place an X or an O
    public void playerXTurn( String quesMatrix[][],  String cells[][], int anwserMatrix[][], int userLives, String userName) throws NumberFormatException, IOException

    {

    	BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));

    	
    	//prints user's info
    	 System.out.println("\t\t\t\t\tPlayerX:" +" "+ userName);
    	 System.out.println("\t\t\t\t\tPlayerO: Computer");
    	 System.out.println("\t\t\t\t\tLives:" +" "+ userLives +" "+ "apples");
    	
    
    	 System.out.println("Choose a cell row! ex. 0");
         userChoiceRow = Integer.parseInt(myInput.readLine());


    	 System.out.println(" Now choose a cell column ex. 0");
         userChoiceColumn = Integer.parseInt(myInput.readLine());

        
         for(int x=0; x<cells.length; x++)

        {

        	

            for(int y=0; y<cells.length; y++)

            {

   
                {

                // prints question that corresponds to user's position
                System.out.println(quesMatrix[userChoiceRow][userChoiceColumn]);

                Anwser= Integer.parseInt(myInput.readLine());

                //if user's answers matches answers to the position they choose on the gamebaord
                if(Anwser==anwserMatrix[userChoiceRow][userChoiceColumn])

                {

               
                	System.out.print("Correct!");

                	//replaces user's choice of position with an O
                	cells[userChoiceRow][userChoiceColumn]="X";

                	//calls method from GameBoard class to print new updated board
                	cellsB.PrintCells2(cells);
               
                	//increments score by 500
                	currentScore+= incrementScore;

                	System.out.println("score:" + this.currentScore);

                	// calls method from computerO class check if there are 4 0's in each row/column
                	PlayerO.EndTheGameO(cells);
                	
                	// calls method from computerO class check if there are 4 X's in each row/column
                	PlayerO.EndTheGameX(cells);
                
                	//calls method for player to input their O on an empty space on the gameBaord
                	PlayerO.ComputerPlay(cells);

                	
                	//repeats question
                	System.out.println("Choose a cell row!");
                
                	userChoiceRow = Integer.parseInt(myInput.readLine());


            	
                	System.out.println(" Now choose a cell column");
                
                	userChoiceColumn = Integer.parseInt(myInput.readLine());
                
               
                }

               /*
                * if user answers incorrectly
                */
             
                else 

               {

               
                System.out.println("Uh Oh! Incorrect");
                
                //prints correct 
                System.out.println("The Correct Anwser is: " + anwserMatrix[userChoiceRow][userChoiceColumn]);
               
                //takes away a life
                userLives-=1;

                
                System.out.println("\t\t\t\t\tLives Left:" +" "+ userLives);
               
                //score decreases
            	currentScore-=200;
                
                System.out.println("\t\t\t\t\tScore:" +" "+ this.currentScore);
                
                //replaces user's choice of position with an O
                cells[userChoiceRow][userChoiceColumn]= "O";

               //calls method from GameBoard class to print updated game board
                cellsB.PrintCells2(cells);
               
             
                //if Lives done
                if(userLives==0)
                {
               
                
                	System.out.println("OH NO! no more apples!");
               
                	System.out.println("GAME OVER: PLAYER O WINS!");
              
                	System.exit(0);
                
                }
                
            
                // calls method from computerO class check if there are 4 O's in each row/column
                PlayerO.EndTheGameO(cells);
               
                // calls method from computerO class check if there are 4 X's in each row/column
                PlayerO.EndTheGameX(cells);
               
                //calls method for player to input their O on an empty space on the gameBaord
                PlayerO.ComputerPlay(cells);
          
                //repeats questions
                System.out.println("Choose a cell row!");
                userChoiceRow = Integer.parseInt(myInput.readLine());


           	 	System.out.println(" Now choose a cell column");
                userChoiceColumn = Integer.parseInt(myInput.readLine());
                
                
                }

                
   
            }

            

        }

 

    }
        
    
 } 

 
    	   // sets and stores values to specified variables
    	 	public void setUser(String factor)

 			{
 			 
 			this.user= factor;

 			}
 			
 			public void setPassword(String factor)

 			{
 			 
 			this.password= factor;

 			}
 			
 			
 			public void setUserName(String factor)

 			{
 			 
 			this.userName= factor;

 			}
 			
 			public void setUserChoiceRow(int factor)

 			{
 			 
 			this.userChoiceRow= factor;

 			}
 			
 			public void setUserChoiceColumn(int factor)

 			{
 			 
 			this.userChoiceRow= factor;

 			}
 			
 			
 			 
 			public void setUserNum(int factor)

 			{
 			 
 			this.userNum= factor;

 			
 			}
 			 
 		
 			public void setAnwser1(int factor)

 			{
 			 
 			this.Anwser= factor;

 			}

 			public void setCurrentScore(int factor)

 			{
 			 
 			this.currentScore= factor;

 			}


 		    public void setName(String name) 
 		    
 		    {
 		        this.Name = Name;
 		    }

 	
 			// reads in and returns values from specified variables
 			public int getcurrentScore()

 			{
 			 
 			return this.currentScore;

 			}

	
 			public int getAnwser1()

 			{
 			 
 			return this.Anwser;

 			}

 			
 			public int getuserNum()

 			{
 			 
 			return this.userNum;

 			}
 			
 			public int getuserChoiceRow()

 			{
 			 
 			return this.userChoiceRow;

 			}
 			
 			public int getuserChoiceColumn()

 			{
 			 
 			return this.userChoiceRow;

 			}

 			public String getuserName()

 			{
 			 
 			return this.userName;

 			}
 			public String  getPassword()

 			{
 			 
 			return this.password;

 			}
 			public String getUser()

 			{
 			 
 			return this.user;

 			}

 			public String getName()
 			
 			{
 		        return Name;
 		    }
}


