import java.util.*;
import java.lang.*;

class StudentDataExtended extends StudentData{
	  private String location;

	  public StudentDataExtended(String id,String name,String location){
			super(name,id);
			this.location = location;
	  }

	  public void printDetails(){
			System.out.println(getid()+" "+getname()+" "+location);
	  }
}
