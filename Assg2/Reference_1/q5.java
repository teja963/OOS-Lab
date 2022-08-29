import java.lang.*;
import java.util.*;

class q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		   System.out.print("Enter the details : ");
			String name = scanner.next();
			String emp = scanner.next();
			String food = scanner.next();
			System.out.print("No of days : ");
			int days = scanner.nextInt();
			double fee = days;
			if(emp.equals("employee"))
				fee = fee*1.05;
			
			if(food.equals("veg"))
				fee = fee*100;
			else
				fee = fee*120;

			System.out.println((int)fee);

			
	  }
}
