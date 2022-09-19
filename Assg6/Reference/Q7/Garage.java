import java.lang.*;
import java.util.*;

class Garage{
	List<Vehicle> mylist;

	public Garage(){
		  mylist = new ArrayList<Vehicle>();
	}

	public void addVehicle(Vehicle veh){
		  mylist.add(veh);
	}

	public void print(){
		  Collections.sort(mylist,(a,b)->Double.compare(b.getTax(),a.getTax()));
		  for(Vehicle v : mylist)
			  v.print();
	}
	  
}
