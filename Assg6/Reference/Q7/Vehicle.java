import java.lang.*;
import java.util.*;

abstract class Vehicle implements TaxCalculatable{
	  String modelNumber;
	  String fuelType;
	  int rateBought;
	  int numberOfWheels;
	  public Vehicle(String modelNumber,String fuelType,int rate,int wheels){
			this.fuelType = fuelType;
			this.rateBought = rate;
			this.numberOfWheels = wheels;
			this.modelNumber = modelNumber;
	  }

	  public String getType(){
			return this.fuelType;
	  }

	  public int getRB(){
			return rateBought;
	  }

	  public void print(){
			System.out.print(modelNumber+" "+fuelType+" ");
	  }
}
