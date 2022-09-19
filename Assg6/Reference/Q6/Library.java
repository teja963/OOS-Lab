import java.lang.*;
import java.util.*;


class Library{
	  Map<Integer,Book> myhash;

	  public Library(){
			this.myhash = new LinkedHashMap<Integer,Book>();
	  }

	  public void addReferanceBook(Book book){
			myhash.put(book.getId(),book);
	  } 

	  public void addTextBook(Book book){
			myhash.put(book.getId(),book);
	  }

	  public void ListBooks(){
			for(Book book : myhash.values())
				book.print();
	  }

	  public void checkIn(int id){
			Book book = myhash.get(id);
			book.checkIn();
	  }

	  public void checkOut(int id){
			Book book = myhash.get(id);
			book.checkOut();
	  }

}
