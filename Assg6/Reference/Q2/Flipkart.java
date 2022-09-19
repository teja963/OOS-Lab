import java.lang.*;
import java.util.*;

class Flipkart implements ICICI,HDFC{
      int money = 0; 
	  public void geticici(int num1,int num2){
		    money += num2;
			System.out.println(money+" "+(num1-num2));
	  }

	  
	  public void gethdfc(int num1,int num2){
		    money += num2;
			System.out.println(money+" "+(num1-num2));
	  }
}
