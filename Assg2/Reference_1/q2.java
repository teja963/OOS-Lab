import java.util.*;
import java.lang.*;

class q2{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			String str = scanner.nextLine();
			int count = 1;
			for(int i=0;i<str.length();i++){
				  if(str.charAt(i) == ' ')
					  count++;
			}
			System.out.println("Words count is "+count);
			for(int i=0;i<str.length();i++){
					  int num = str.charAt(i);
					  System.out.println("'"+str.charAt(i)+"' "+num);
			}

	  }
}
