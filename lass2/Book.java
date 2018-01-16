/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lass2;

import java.util.Objects;

/**
 *
 * @author Martina
 */
public class Book {
    
    private String title, author, isbn;
    private int year;
    private double price;

    public Book(String title, String author, String isbn, int year, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    Book() {
        this.title = "NewBook";
        this.author = "NewAuthor";
        this.isbn = "NewISBN";
        this.year = 0000;
        this.price = 00.00;
    }

    
    @Override
    public String toString() {
        return "Book - Title: " + title + ", Author:  " + author + ", ISBN: " + isbn + ", Year: " + year + ", Price: $" + price + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
            
        final Book other = (Book) obj;
        
        if (this.year == other.year 
            && Double.compare(this.price, other.price) == 0 
            && this.title.equals( other.title)
            && this.author.equals(other.author)
            && this.isbn.equals(other.isbn) ) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.title);
        hash = 89 * hash + Objects.hashCode(this.author);
        hash = 89 * hash + Objects.hashCode(this.isbn);
        hash = 89 * hash + this.year;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        return hash;
    }
    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getYear() {
        return year;
    }  
    public double getPrice() {
        return price;
    }    
    
    public boolean setTitle(String title) {
        if(title.length()>0){
            this.title = title;
            return true;
        }
        return false;
        
    }
    public boolean setAuthor(String author) {
        if(author.length()>0){
            this.author = author;
            return true;
        }
        return false;
    }
    public boolean setIsbn(String isbn) {
        if(isbn.length()==11 || isbn.length()==13){
            if(isbn.matches("[a-zA-Z0-9 ]+")){
                this.isbn = isbn;
                return true;
            }
        }
        return false;  
    }
    public boolean setYear(int year) {
        if(year>=-2600 && year<=2017){
            this.year = year;
            return true;
        }
        return false;
    }
    public boolean setPrice(double price) {
        if(Double.compare(price, 0.00) >0){
            this.price = price;
            return true;
        }
        return false;
    }
    
}
