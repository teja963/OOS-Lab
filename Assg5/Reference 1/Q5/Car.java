import java.util.*;
import java.lang.*;

class Car{
	  private String modelName;
	  private String engineNo;
	  private int basePrice;
	  private int additionalCharge;

	  public Car(String modelName,String engineNo,int basePrice,int additionalCharge){
			this.modelName = modelName;
			this.engineNo = engineNo;
			this.basePrice = basePrice;
			this.additionalCharge = additionalCharge;
	  }

	  public int totalPrice(){
			return basePrice+additionalCharge;
	  }

	  public String getname(){
			return this.modelName;
	  }
}
