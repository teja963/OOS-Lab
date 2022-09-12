import java.lang.*;
import java.util.*;

class Q4{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String str1 = scanner.nextLine();
			String str2 = scanner.nextLine();
            
			String[] intdetails = str1.split(" ");
			String[] floatdetails = str2.split(" ");
             
			int num1 = Integer.parseInt(intdetails[0]);
			int num2 = Integer.parseInt(intdetails[1]);
			Addition a1 = new IntegerAddition(num1,num2);

		    int[] fraction = new int[4];
			for(int i= 0;i<4;i++){
				  fraction[i] = Integer.parseInt(floatdetails[i]);
			}

			Addition a2 = new FractionAddition(fraction[0],fraction[1],fraction[2],fraction[3]);

			a1.add();
			a2.add();
			
	  }
}
