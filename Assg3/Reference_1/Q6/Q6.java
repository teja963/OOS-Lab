import java.util.*;
import java.lang.*;

class Q6{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
		System.out.print("Enter the number of students : ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Database db = new Database();
		for(int i=0;i<n;i++){
			  System.out.println("Enter the details of Student "+(i+1)+"(id, name, location):");
              db.addDetails(new StudentDataExtended(scanner.next(),scanner.next(),scanner.next()));


		}

		db.printDetails();

	  }
}
