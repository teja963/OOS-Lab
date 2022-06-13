import java.lang.*;
import java.util.*;

class Queue{
	  private LinkedList<Integer> mylist;

	  public Queue(){
			this.mylist = new LinkedList<Integer>();
	  }

	  public void enqueue(int val){
			mylist.add(val);
			System.out.println("Success");
	  }

	  public void dequeue(){
			try{
				  int val = mylist.remove(0);
				  System.out.println(val);
			}

			catch(Exception e){
				  System.out.println("EmptyQueue");
			}
	  }
	  

}
