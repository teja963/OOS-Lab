import java.lang.*;
import java.io.*;
import java.util.*;

class Q2{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
		  String name = scanner.nextLine();
		  try{
			File file = new File(name);
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()){
				  String str = sc.nextLine();
				  if(isNum(str))
					  System.out.println(str);
				  else
					  System.out.println("OtherCharactersFound");
			}
		  }

		  catch(Exception e){
				System.out.println(e);
		  }
	  }

	  public static boolean isNum(String str){
			for(int i = 0; i < str.length(); i++){
				  if(!Character.isDigit(str.charAt(i)))
					  return false;
			}

			return true;
	  }
}
