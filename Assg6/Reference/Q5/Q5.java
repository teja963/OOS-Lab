import java.lang.*;
import java.util.*;

public class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();
			RollList rl = new RollList();

			while(n != 0){
				  n--;
				  String[] detalis = scanner.nextLine().split(" ");
				  int roll = Integer.parseInt(detalis[0]);
				  rl.addStudent(new Student(detalis[1],detalis[2],roll));
			}
			rl.OrderByRollno();
			System.out.println();
			rl.OrderByName();
	  }
}
