import java.util.*;
import java.lang.*;

class Q4{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		  System.out.print("Input : ");
		  int n = scanner.nextInt();
		  Database db = new Database();
		  for(int i =0;i<n;i++){
				db.add(new Manager(scanner.nextInt(),scanner.next(),scanner.next(),scanner.nextInt(),scanner.nextInt()));
		  }
		  System.out.println("Output");
		  db.printmax();
	  }
}

