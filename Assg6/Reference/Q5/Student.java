import java.lang.*;
import java.util.*;

class Student{
	  private String name;
	  private String place;
	  private int roll;

	  public Student(String name,String place,int roll){
			this.name = name;
			this.place = place;
			this.roll = roll;
	  }

	  public String getName(){
			return this.name;
	  }

	  public int getRoll(){
			return this.roll;
	  }

	  public void print(){
			System.out.println(roll+" "+name+" "+place);
	  }
}
