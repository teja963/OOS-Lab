import java.lang.*;
import java.util.*;

class ReferanceBooks extends Book{
	  public ReferanceBooks(String title,String author,int id){
			super(title,author,id);
	  }

	  public void print(){
			System.out.print("ReferenceBook:");
			super.print();
			System.out.println();
	  }
}
