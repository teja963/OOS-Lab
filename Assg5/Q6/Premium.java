import java.util.*;
import java.lang.*;

class Premium extends Customers{
	  public Premium(String name,String mobile){
			super(name,mobile);
	  }

	  public void invoice(){
		    System.out.println("*******BILL*******");
			System.out.println(super.name+" "+super.mobile+" Premium");
			double total = (int)  super.BILL();
			double discount = total*0.2;
            System.out.println("Total "+total+"-"+discount);
			System.out.println("Please Pay :"+(total - discount));
	  }
}
