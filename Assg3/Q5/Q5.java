import java.util.*;
import java.lang.*;

class Q5{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
			System.out.print("Enter the number of patients : ");
			int n = scanner.nextInt();
			scanner.nextLine();
            PriorityQueue<Patient> pq = new PriorityQueue<Patient>(new Comp());
			for(int i =1;i<=n;i++){
				  System.out.println("Enter the details of patient "+i+" :");
				  System.out.print("Name : ");
				  String name = scanner.nextLine();
				  System.out.print("Patient ID : ");
				  String id = scanner.nextLine();
				  pq.add(new Patient(name,id));
			}
			System.out.println("List of Patients to be tested are :");
			while(pq.size() != 0){
				  Patient p = pq.remove();
				  p.print();
			}

			
	  }

	  public static class Comp implements Comparator<Patient>{
			public int compare(Patient p1,Patient p2){
				  String[] s1 = p1.getid().split("-");
				  String[] s2 = p2.getid().split("-");
				  return Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
			}
	  }
}
