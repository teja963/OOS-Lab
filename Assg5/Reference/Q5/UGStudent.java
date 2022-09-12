import java.lang.*;
import java.util.*;

class UGStudent extends Student{
	  private int fee;

	  public UGStudent(String name,String roll,int fee){
			super(name,roll);
			this.fee = fee;
	  }

	  public void getFee(){
			System.out.println(fee);
	  }

}
