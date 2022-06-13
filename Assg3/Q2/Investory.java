import java.lang.*;
import java.util.*;

class Investory{
	  HashMap<Item,Integer> mylist;

	  public Investory(){
			mylist = new HashMap<>();
	  }

	  public void add(Item item,int num){
			mylist.put(item,num);
	  }

	  public void invoice(){
		   int cost = 0;
			System.out.println("****INVOICE****");
			for(Item item : mylist.keySet()){
				  System.out.println(item.id+","+item.name+","+item.cost+","+mylist.get(item));
				  cost = cost + item.cost*mylist.get(item);
			}
			System.out.print("Total :");
			System.out.println(cost);
			System.out.println("********");
	  }


}

