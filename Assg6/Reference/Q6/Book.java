import java.lang.*;
import java.util.*;

abstract class Book implements Borrowable{
	String title;
	String author;
	int bookID;

	public Book(String title,String author,int id){
		  this.title = title;
		  this.author = author;
		  this.bookID = id;
	}

	public int getId(){
		  return this.bookID;
	}

	public void print(){
		  System.out.print(bookID+":"+title+":"+author);
	}

    public void checkIn(){
		  System.out.println("INVALID");
	}

	public void checkOut(){
		  System.out.println("Cannot be borrowed");
	}
	  
}
