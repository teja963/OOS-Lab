import java.util.*;
import java.lang.*;

class Customers{
	  public String name;
	  public String mobile;
	  List<Item> kart;
	  
	  public  Customers(String name,String mobile){
			this.name = name;
			this.mobile = mobile;
			this.kart = new ArrayList<Item>();
	  }

	  public void addItem(Item item){
			kart.add(item);
	  }

	  public int BILL(){
		 int sum = 0;
		 for(int i=1;i<=kart.size();i++){
		        System.out.println(i+". "+kart.get(i-1).name+" "+kart.get(i-1).cost);
				sum+= kart.get(i-1).cost;
		 }

		 return sum;
	  }

	  public void invoice(){
		    System.out.println("*******BILL*******");
			System.out.println(this.name+" "+this.mobile+" None");
			double  total = (double) BILL();
			System.out.print("Total : "+total);
			System.out.println("Please Pay: "+total);
	  }
}
