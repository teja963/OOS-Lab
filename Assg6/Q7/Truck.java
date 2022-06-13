import java.lang.*;
import java.util.*;

class Truck extends Vehicle{
	  int loadLimit;

	  public Truck(String modelName,String fuelType,int rate,int load){
			super(modelName,fuelType,rate,4);
			this.loadLimit = load;
	  }

	  public double getTax(){
			double rb = (double) super.getRB();
			double ll = (double)loadLimit;
			if(super.getType().equals("petrol"))
				return rb*0.1*ll*0.002*0.5;
			else
				return rb*0.1*ll*0.002*0.4;
	  }

	  public void print(){
			super.print();
			System.out.println(getTax());
	  }
}
