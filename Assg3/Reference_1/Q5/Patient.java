import java.lang.*;
import java.util.*;

class Patient extends Person{
	  private String id;

	  public Patient(String name,String id){
			super(name);
			this.id = id;
	  }

	  public void print(){
			System.out.println(this.id+" "+this.name);
	  }

	  public String getid(){
			return id;
	  }
}
