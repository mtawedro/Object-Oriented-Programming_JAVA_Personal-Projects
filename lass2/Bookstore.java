/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lass2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import lass2.Book.*;


/**
 * @author Martina
 */
class Bookstore {
    
    static Scanner input = new Scanner(System.in);
    
    public void run(){
        
        int choice = 0;
        ArrayList<Book> books = new ArrayList<Book>();
        
        while(choice != 5)
        {
            switch(choice)
            {
                case 0:
                {
                    printMainMenu();
                    choice = getChoice(1, 5);
                    break;
                }
                case 1:
                {
                    addBook(books);
                    choice = 0;
                    break;
                }
                case 2:
                {
                    printBooks(books);
                    choice = 0;
                    break;
                }
                case 3:
                {
                    printAuthors(books);
                    choice = 0;
                    break;
                }
                case 4:
                {
                    averagePrice(books);
                    choice = 0;
                   break;
                }
            }
        }
        
        seperator();
        
        System.out.println("Goodbye!");
    }
    

         
    private static int getChoice(int low, int high){
        
    	int choice = -9999;
       
        System.out.println("Enter number" +  low + " - " +  high);
        
        do{
            try{
                choice = -9999;
                
                choice = input.nextInt();
                
                input.nextLine();
               
                if(choice<low || choice>high)
                {
                    System.out.println("Invalid input, Try again");
                }
            }
            
            catch (InputMismatchException exception)
            {
                System.out.println("Integers only, please.");
                
                input.nextLine();
            }
        }
        
        while (choice <low || choice>high);
        
        return choice; 
    }
    
    
    private static void printMainMenu(){
        seperator();
        
        System.out.println("1. Add unique book to the inventory");
        System.out.println("2. Information on each book");
        System.out.println("3. All unique authors");
        System.out.println("4. Average book price, total number of books");
        System.out.println("5. Quit\n");
    }
    
    private static void seperator(){
        System.out.println("____________________________________\n");
    }
    
    private static void addBook(ArrayList<Book> books){
        seperator();
        
        Book tempBook = new Book();
        String tempString = "";
        double tempDouble = 0;
        System.out.print("Enter new book details\n");
        
        System.out.print("Title: ");
        tempString = input.nextLine();
        while(!tempBook.setTitle(tempString)){
            System.out.println("Cannot have empty Name, Try Again");
            System.out.print("Title: ");
            tempString = input.nextLine();
        }
        
        System.out.print("Author: ");
        tempString = input.nextLine();
        while(!tempBook.setAuthor(tempString)){
            System.out.println("Cannot have empty Author, Try Again");
            System.out.print("Author: ");
            tempString = input.nextLine();
        }
        
        System.out.print("ISBN: ");
        tempString = input.nextLine();
        while(!tempBook.setIsbn(tempString)){
            System.out.println("ISBN has to be 11 or 13 letters long, Try Again");
            System.out.print("ISBN: ");
            tempString = input.nextLine();
        }
        
        System.out.print("Publishing Year - ");
        tempBook.setYear(getChoice(-2600, 2017));
        
        System.out.print("Price: ");
        tempDouble = input.nextDouble();
        while(!tempBook.setPrice(tempDouble)){
            System.out.println("Price has to be >0, Try Again");
            System.out.print("Price: ");
            tempDouble = input.nextDouble();
        }
        
        if(books.contains(tempBook)){
            System.out.println("This book already exists");
        }else{
            books.add(tempBook);
        }
        
    }
    
    private static void printBooks(ArrayList<Book> books){
        seperator();
        
        if(books.isEmpty()){
            System.out.println("No books available");
            return;
        }
        
        for(Book entry: books){
            System.out.print(entry);
        }
    }
    
    private static void printAuthors(ArrayList<Book> books){
        seperator();
        
        if(books.isEmpty()){
            System.out.println("No books or authors available");
        }
        
        String authors[] = new String[books.size()];
        int authorCount = 0;
        
        for(Book entry: books){
            if(!(Arrays.asList(authors).contains(entry.getAuthor()))){
                authors[authorCount] = entry.getAuthor();
                authorCount++;
            }
        }   
        
        for(String author: authors){
            if(!author.equals("null")){
                System.out.println(author);
            }
        }
    }
    
    private static void averagePrice(ArrayList<Book> books){
        seperator();
                
        if(books.isEmpty()){
            System.out.println("No books or prices available");
        }
        
        double avg = 0;
        
        for(Book entry: books){
            avg += entry.getPrice();
        }
        System.out.printf("%d Books \nAverage Price: %.2f\n", books.size(), (double)(avg/books.size()) );
    }
}
