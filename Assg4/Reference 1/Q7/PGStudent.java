import java.lang.*;
import java.util.*;

class PGStudent extends Student {
	  private  String elective;
	  private int noOfElectives;

	  public PGStudent(String name,int age,int roll,int percentage,String elective){
			super(name,age,percentage,roll);
			this.elective = elective;
			noOfElectives = 1;
	  }

}
