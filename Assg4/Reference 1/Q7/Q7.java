import java.util.*;
import java.lang.*;

class Q7{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			int n = scanner.nextInt();
			scanner.nextLine();

			PriorityQueue<PGStudent> pq = new PriorityQueue<PGStudent>(new Comp());
			for(int i = 0;i<n;i++){
				  String input = scanner.nextLine();
				  String[] details = input.split(":");
				  details[3] =  details[3].trim();
                  pq.add(new PGStudent(details[0],Integer.parseInt(details[1]),i,Integer.parseInt(details[3]),details[2]));
			}

			while(pq.size() != 0){
				  PGStudent stu = pq.remove();
				  System.out.println(stu.getname());
			}
	  }

}

class Comp implements Comparator<PGStudent>{
	  public int compare(PGStudent s1,PGStudent s2){
			return s2.getpercentage() - s1.getpercentage();
	  }
}
