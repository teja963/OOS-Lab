import java.lang.*;
import java.util.*;

class Employee{
	  private int employeeId;
	  private String employeeName;
      private double salary;

	  public Employee(String name,int employeeId){
			this.employeeName = name;
			this.employeeId = employeeId;
	  }

	  public  double  getsalary(){
			return this.salary;
	  }

      public void calculateSalary(){
			this.salary = 0;
	  }

	  public  void  setSalary(double salary){
			this.salary = salary;
	  }

	  public void print(){
			System.out.println(employeeId+" "+employeeName+" "+salary);
	  }
}
