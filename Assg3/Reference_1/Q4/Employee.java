import java.util.*;
import java.lang.*;

class Employee{
	  protected  int id;
	  protected  String name;
	  protected  String department;
	  protected  int salary;

	  public Employee(int id,String name,String department,int salary){
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
	  }

	  public int getsalary(){
			return this.salary;
	  }
}
