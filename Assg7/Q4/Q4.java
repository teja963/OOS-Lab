import java.lang.*;
import java.util.*;

class Q4{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			String str = scanner.nextLine();
			StringBuilder sb = new StringBuilder();
			try{
				  String size = str.substring(0,8);
				  int n = Integer.parseInt(size,2);
				 // System.out.println(n);
				  // int runner = 8;
				   for(int runner  = 8;runner<str.length();runner+=8){
						int num = Integer.parseInt(str.substring(runner,runner+8),2);
						num = num^n;
						char ch = (char)num;
						sb.append(ch);
				//		System.out.println(ch);
						
				   }
				   System.out.println(sb);

			}

			catch(Exception e){
				  System.out.println("Incorrect Input");
			}
	  }
}
