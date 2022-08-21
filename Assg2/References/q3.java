import java.lang.*;
import java.util.*;

class q3{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			String input = scanner.nextLine();
			HashSet<Character> myhash =  new HashSet<Character>();
			for(int i=0;i<input.length();i++){
				  char ch = input.charAt(i);
				  if(!myhash.contains(ch)){
						myhash.add(ch);
						System.out.print(ch);
				  }
			}
			System.out.println();
	  }
}
