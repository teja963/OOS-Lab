import java.lang.*;
import java.util.*;


class Q3{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();

			String[] details = scanner.nextLine().split(" ");
			int[] arr = new int[n];
			for(int i = 0;i<n;i++)
				arr[i] = Integer.parseInt(details[i]);
			String[] in = scanner.nextLine().split(" ");
			try{
				  int sum = 0;
				  for(String str : in){
						sum +=arr[Integer.parseInt(str)];
				  }
				  System.out.println(sum);
			}

			catch(Exception e){
				  System.out.println(e);
			}
	  }
}
