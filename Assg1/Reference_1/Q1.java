import java.lang.*;
import java.util.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			System.out.print("Enter the base of the number: ");
			int a = scanner.nextInt();
			System.out.print("Enter the exponent: ");
			int n = scanner.nextInt();
			System.out.println(getans(a,n));
			scanner.close();
	  }

	  public static int getans(int a,int n){
			int res = 1;
			while(n != 0){
				  if(n%2 == 1){
						res = res*a;
						n--;
				  }else{
						a = a*a;
						n = n/2;
				  }
			}
			return res;
	  }
}
