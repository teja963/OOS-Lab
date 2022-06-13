import java.lang.*;
import java.util.*;


class Manager extends Employee{
	  int bonus;
	  public Manager(int id,String name,String department,int salary,int bonus){
			super(id,name,department,salary);
			this.bonus = bonus;
	  }

	  public void print(){
			System.out.println(this.id+" "+this.name+" "+this.department+" "
			     +this.salary+" "+this.bonus);
					
	  }

	  public int getbonus(){
			return this.bonus;
	  }
}
