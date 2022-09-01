import java.lang.*;
import java.util.*;

class Dealer{
	  String dealerName;
	  double discountPercentage;
	  Car car;

	  public Dealer(String name,double discount,Car car){
			this.dealerName = name;
			this.discountPercentage = discount;
			this.car = car;
	  }

	  public double onRoadPrice(){
			double retvalue = car.totalPrice() - car.totalPrice()*discountPercentage/100;
			return retvalue;
	  }
	  
	  public void print(){
			System.out.println(car.getname()+" "+car.totalPrice()+" "+onRoadPrice());
	  }
}
