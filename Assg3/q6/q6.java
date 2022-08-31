import java.util.*;
import java.lang.*;

public class q6{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		StudentDataExtended sde = new StudentDataExtended("", "", "");
		
		for(int i = 0; i < n; i++){
			System.out.println("Enter the details of Student"+(i+1)+"(id, name, location):");
			sde.addDetails(new StudentDataExtended(sc.next(), sc.next(), sc.next()));
		}
		
		System.out.println();
		sde.printDetails();
	}	
}
