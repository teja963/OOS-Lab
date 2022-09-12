import java.util.*;
import java.lang.*;

class FractionAddition extends Addition{
	  private int num1;
	  private int num2;
	  private int deno1;
	  private int deno2;

	  public FractionAddition(int num1,int deno1,int num2,int deno2){
			this.num1 = num1;
			this.deno1 = deno1;
			this.num2 = num2;
			this.deno2 = deno2;
	  }

	  public void add(){
		    makeperfect();
			int lcm = deno1*deno2/gcd(deno1,deno2);
			int num = num1*(lcm/deno1) + num2*(lcm/deno2);
			System.out.println(num+" / "+lcm);

	  }

	  public int gcd(int num1,int num2){
			if(num2 == 0){
				  return num1;
			}else{
				  return gcd(num2,num1%num2);
			}
	  }

	  public void makeperfect(){
			int gcd1 = gcd(num1,deno1);
			num1 = num1/gcd1;
			deno1 = deno1/gcd1;
			int gcd2 = gcd(num2,deno2);
			num2 = num2/gcd2;
			deno2 = deno2/gcd2;
	  }
}
