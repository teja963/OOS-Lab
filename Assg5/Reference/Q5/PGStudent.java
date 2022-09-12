import java.lang.*;
import java.util.*;

class PGStudent extends Student{
     public int fee;

	  public PGStudent(String name,String roll,int fee){
			super(name,roll);
			this.fee = fee;
	  }


	  public void getFee(){
			System.out.println(fee);
	  }

}
