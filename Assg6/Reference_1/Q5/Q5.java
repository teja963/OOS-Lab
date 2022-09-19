import java.util.*;
import java.lang.*;

class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int UG = scanner.nextInt();
			int PG = scanner.nextInt();

			int n = scanner.nextInt();
			scanner.nextLine();

			Student[] arr = new Student[n];
			for(int i = 0;i<n;i++){
				  String str = scanner.nextLine();
				  String[] details = str.split(" ");
				  if(details[2].equals("UG")){
						arr[i] = new UGStudent(details[0],details[1],UG);
				  }else{
						arr[i] = new PGStudent(details[0],details[1],PG);
				  }
			}

		    String roll = scanner.nextLine();

			for(int i = 0;i<arr.length;i++){
				  if(arr[i].getRoll().equals(roll)){
						arr[i].getFee();
						break;
				  }
			}
	  }
}
