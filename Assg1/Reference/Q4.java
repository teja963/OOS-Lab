import java.lang.*;
import java.util.*;

class Q4{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int n = scanner.nextInt();
			StringBuilder sb = new StringBuilder(""+n);
			sb.reverse();
			int num = Integer.parseInt(sb.toString());
			System.out.println(num);
	  }
}
