import java.lang.*;
import java.util.*;

class IntegerAddition extends Addition{
	  private int a ;
	  private int b;

	  public IntegerAddition(int a,int b){
			this.a = a;
			this.b = b;
	  }

	  public void add(){
			int num = a+b;
			System.out.println(num);
	  }
}
