import java.lang.*;
import java.util.*;

class Q6{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			int num = scanner.nextInt();
			String str = ""+num;
			int i = 0;
			int j = str.length()-1;
			while(j >= i && str.charAt(i) == str.charAt(j)){
				  i++;
				  j--;
			}
			if(j > i){
				  System.out.println("False");
			}else{
				  System.out.println("True");
			}
			scanner.close();
	  }
}
