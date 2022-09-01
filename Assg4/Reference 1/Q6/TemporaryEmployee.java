import java.lang.*;
import java.util.*;

class TemporaryEmployee extends Employee{
	  private int hours;
	  private double wages;

	  public TemporaryEmployee(String name,int id,int hours,double wages){
			super(name,id);
			this.hours = hours;
			this.wages = wages;
			calculateSalary();
	  }

	  public void calculateSalary(){
			double sal = hours*wages;
			setSalary(sal);
	  }
}
