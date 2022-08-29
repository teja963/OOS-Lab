import java.lang.*;
import java.util.*;

class Q2{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			System.out.print("a=");
			int a = scanner.nextInt();
			System.out.print("b=");
			int b = scanner.nextInt();

			a = a + b;
			b = a - b;
			a = a - b;

			System.out.println("a="+a);
			System.out.println("b="+b);
			scanner.close();
	  }
}
