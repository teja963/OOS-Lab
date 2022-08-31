import java.util.*;
import java.lang.*;
public class q5{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of patients:");
		int n = sc.nextInt();
		sc.nextLine();
		if(n > 0){
			PriorityQueue<patient> pq = new PriorityQueue<patient>(n, new comp());
			for(int i = 0; i < n; i++){
				System.out.println("Enter the details of patient "+(i+1)+":");
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Patient ID: ");
				String id = sc.nextLine();
				pq.add(new patient(name, id));
			}
			
			System.out.println();
			for(int i = 0; i < n; i++){
				patient p = pq.remove();
				System.out.println(p.patient_id+" "+p.person_name);
			}
		}
	}
	
	public static class comp implements Comparator<patient>{
		public int compare(patient p1, patient p2){
			return -1*(p1.getPatient_id() - p2.getPatient_id());
		}
	}
	
	public static class person{
		String person_name;
		String patient_id;
	}
	
	public static class patient extends person{
		patient(String person_name, String patient_id){
			super.person_name = person_name;
			super.patient_id = patient_id;
		}
		
		public int getPatient_id(){
			String id = this.patient_id;
			String age = "";
			int flag = 0;
			for(int i = 0; i < id.length(); i++){
				if(flag == 1)age += id.charAt(i);
				if(id.charAt(i) == '-')flag = 1;
			}
			return Integer.parseInt(age);
		}
	}
}
