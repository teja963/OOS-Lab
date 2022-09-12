import java.util.*;
import java.lang.*;

class Q1{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			String input = scanner.nextLine();
			String[] details = input.split(" ");
			if(details.length == 1){
				  int num = Integer.parseInt(details[0]);
				  int sum = 0;
				  for(int i = 1;i<=num;i++)
					  sum = sum + i;
				  System.out.println(sum);
			}else{
				  if(isNumber(details[0])){
						int a = Integer.parseInt(details[0]);
						int b = Integer.parseInt(details[1]);
						int ans = a*a + b*b;
						System.out.println(ans);
				  }else{
						int num = Integer.parseInt(details[1]);
						for(int i=1;i<=num;i++){
							  for(int j = 1;j<=i;j++){
									System.out.print(details[0]);
							  }
							  System.out.println();
						}
				  }
			}
	  }

	  public static boolean isNumber(String str){
			try{
				  int num = Integer.parseInt(str);
				  return true;
			}
			catch(Exception e){
				  return false;
			}
	  }
}
