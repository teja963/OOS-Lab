import java.lang.*;
import java.util.*;

class PermanentEmployee extends Employee{
	  private int  basicPay;

	  public PermanentEmployee(String name,int id,int basicPay){
			super(name,id);
			this.basicPay = basicPay;
			calculateSalary();
	  }

	  public void calculateSalary(){
			double ret = basicPay * 0.88;
	        setSalary(ret);		
	  }


}
