import java.util.*;
import java.lang.*;

class Student extends Person {
	  private int  percentage;
	  private int roll;

	  public Student(String name,int age,int percentage,int roll){
			super(name,age);
			this.percentage = percentage;
			this.roll = roll;
	  }

	  public int getpercentage(){
			return this.percentage;
	  }


}
