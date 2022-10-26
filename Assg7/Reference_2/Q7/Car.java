import java.lang.*;
import java.util.*;

class Car extends Vehicle{
	  int passengers;
	  public Car(String modelname,String fuelType,int rate,int num){
			super(modelname,fuelType,rate,4);
			this.passengers  = num;
	  }

	  public double getTax(){
				  double pass = (double)passengers;
				  double rb = (double)super.getRB();
			if(super.getType().equals("petrol")){
                return (rb*0.1*pass)*0.5;
			}else{
				  return rb*0.1*pass*0.4;
			}
	  }

	  public void print(){
			super.print();
			System.out.println(getTax());
	  }
}
