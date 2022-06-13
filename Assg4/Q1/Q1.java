import java.lang.*;
import java.util.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String input = scanner.nextLine();
			String[] details = input.split(" ");
			if(details.length == 2)
				  And(Integer.parseInt(details[0]),Integer.parseInt(details[1]));
			else
				And(Integer.parseInt(details[0]),Integer.parseInt(details[1]),
						Integer.parseInt(details[2]));

	  }

	  public static void And(int a,int b){
			System.out.println(a&b);
	  }

	  public static void And(int a,int b,int c){
			System.out.println(a&b&c);
	  }
}
