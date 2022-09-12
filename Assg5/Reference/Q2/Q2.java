import java.lang.*;
import java.util.*;

class Q2{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		    System.out.print("X = ");
			int num = scanner.nextInt();
			scanner.nextLine();

			Bank[] arr = new Bank[3];
			arr[0]  = new SBI();
			arr[1] = new ICICI();
			arr[2] = new AXIS();

			for(int i = 0;i<3;i++){
				  arr[i].getInterest(num);
			}
	  }
}
