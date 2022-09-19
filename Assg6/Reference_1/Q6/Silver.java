import java.util.*;
import java.lang.*;

class Silver extends Customers{
	  public Silver(String name,String mobile){
			super(name,mobile);
	  }

	  public void invoice(){
		    System.out.println("*******BILL*******");
			System.out.println(super.name+" "+super.mobile+" Silver");
			double total = (int)  super.BILL();
			double discount = total*0.1;
            System.out.println("Total "+total+"-"+discount);
			System.out.println("Please Pay :"+(total - discount));
	  }
}
