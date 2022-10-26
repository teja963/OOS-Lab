import java.lang.*;
import java.util.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();

			Bank bank = new Bank();
			String[] in = scanner.nextLine().split(" ");
			int a = bank.convertRs(Integer.parseInt(in[0]));
			int b = bank.convertDl(Integer.parseInt(in[1]));
			int c = bank.convertPd(Integer.parseInt(in[2]));
			int ans = n - (a+b+c);
			if(ans >= 0)
				System.out.println(ans);
			else
				System.out.println("Insufficient balance");

	  }
}
