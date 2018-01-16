import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class playGame {

	public static void main(String[] args) throws IOException 
	
	{
		
			//declares and initializes 2-D arrays 
		
			int  [ ][ ]anwserMatrix= {

				{ 105,552 ,108 , 841},

				{ -34176,2, 8, 25},

				{ 22, 2100,72,-54 },

				{ 2, 264, 10, 3 }};


				      

		  String[ ][ ]cells= {

				  { " ", "", "", ""},

				  { "" ,"", "", ""},

				  { "", "","","" },

				  { "", "", "", "" }};

		
		  String [ ][ ]quesMatrix= {

				  { " (50-(5 * 5-(-(-(-5))))) + 30 = ? ", "46*12=?	", "12*9=?", "29^2=?"},

				        

				  { "-35023+847=?" ,"20+16-34= ?", "2^3=?", "Sq9 - Sq9 + (5*5) = ?"},

				  { "If Log(x) = 12, then log 2 (x / 4) is equal to?", "A school committee consists of 2 teachers and 4 students. The number of different committees that can be formed from 5 teachers and 10 students is?","72*1= ?","32-87+1= ?" },

				  { "1+1=?", "33*8=?", "sq100=?", "(0)(-8)+3= ?" }};

				
				  int userLives=2;
				 
				  String userName = null;
				
				  //object GameBoard
				  DisplayBoard cellsB = new  DisplayBoard();
				  
				// calls method form Game Board calls to print cells  
				  cellsB.PrintCells();
				  
				// calls in method playerAccount with parameters
				  playerAccount(quesMatrix,  cells, anwserMatrix, userLives); 
				  
				  

               
	}
		//method that sets or creates account for user
		public static void playerAccount(String quesMatrix[][], String cells[][], int anwserMatrix[][], int userLives) throws IOException

		    {
			
			//object 2- PlayerX
			userX  PlayerO = new userX( ); 
			
			//initializes array list
			ArrayList<String> Name = new ArrayList<String>();
			
			//declare variables
			String user  ;
			String userName ;
			String password ;
		        
			BufferedReader myInput = new BufferedReader (new InputStreamReader(System.in));

			System.out.println("\n\n" );
			
			
			System.out.println("Welcome to Tic Tac Math! You will be versing your opponent (computer) to try to get 4 X's in a row (only Horizontal and Vertical). Good Luck!");

			System.out.println("\n" );

		    System.out.println("Do you wish to sign in or create an account? SI/ACC");
		    //user input
		    user= myInput.readLine();

		    

		        if(user.equalsIgnoreCase("SI"))

		           {
		          
		        	  System.out.println(" " );
		        	
		  
		        	 //prints array list of those who recently joined 
		        	  System.out.println("People who recently played:---");
		        	
		        	  System.out.println();
		        	
		        	
		        	  for(int i = 0; i < Name.size(); i++) 
		        	 
		        	 {
		                 System.out.println(Name.get(i));
		             }
		        	
	
		                    System.out.println(" Enter Name:---------------------");
		                    //user input
		                    userName= myInput.readLine();

		                    //adds name to the array list
		                    Name.add(userName);

		                    
		                    System.out.println(" Now enter your password:");
		                    //user input
		                    password= myInput.readLine();

		                    //object 3-  creates Player sign in account
		                    userX PlayerSignIn= new userX(user, userName, password);
		                   
		                    //calls method PlayerXTurn from class userX
		                   PlayerO.playerXTurn(quesMatrix,  cells, anwserMatrix, userLives, userName);
		                
		                }

		        
		                	if(user.equalsIgnoreCase("ACC"))

		                {

		                        System.out.println(" Great! now enter your name:");

		                        userName= myInput.readLine();

		                    

		                        System.out.println(" Now create your password:");

		                        password= myInput.readLine();

		                    //object4- creates user Account
		                    userX  Account = new userX( userName,password);
		                        
		                    
		                        
		                }

	
		    }
    
		
  }
		
