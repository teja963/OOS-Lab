import java.lang.*;
import java.util.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
            try{
				  int num1 = scanner.nextInt();
				  scanner.nextLine();

				  char op = scanner.nextLine().charAt(0);

				  int num2 = scanner.nextInt();
				  scanner.nextLine();
				  getans(num1,op,num2);
			}
			catch(Exception e){
				  System.out.println(e);
			}

	  }
     
	  public static void getans(int num1,char op,int num2){
		    int ans = -1;
			if(op == '+')
				ans = num1+num2;
			else if(op == '-')
				ans = num1 - num2;
			else if(op == '*')
				ans = num1*num2;
			else if(op == '/')
				ans = num1/num2;
			System.out.println(ans);
	  }
}
