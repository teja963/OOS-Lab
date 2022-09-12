import java.util.*;
import java.lang.*;

class Gold extends Customers{
	  public Gold(String name,String mobile){
			super(name,mobile);
	  }

	  public void invoice(){
		    System.out.println("*******BILL*******");
			System.out.println(super.name+" "+super.mobile+" Gold");
			double total = (int)  super.BILL();
			double discount = total*0.15;
            System.out.println("Total "+total+"-"+discount);
			System.out.println("Please Pay :"+(total - discount));
	  }
}
