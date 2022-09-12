import java.lang.*;
import java.util.*;

abstract class Student{
	  private String name;
	  private String roll;

	  public Student(String name,String roll){
			this.name = name;
			this.roll = roll;
	  }

	  public String getRoll(){
			return this.roll;
	  }

	  public abstract void getFee();
}
