import java.util.*;
import java.lang.*;

public class StudentDataExtended extends StudentData{
		private String location;
		PriorityQueue<StudentDataExtended> pq = new PriorityQueue<StudentDataExtended>(new Comp());
		
		public StudentDataExtended(String id, String name, String location){
			super(id, name);
			this.location = location;
		}
		
		public void addDetails(StudentDataExtended sde){
			pq.add(sde);
		}
		
		public String getLocation(){
			return this.location;
		}
		
		public void printDetails(){
			System.out.println("The Student Details are:");
			int n = pq.size();
			while(n-- > 0){
				StudentDataExtended sde = pq.remove();
				System.out.println(sde.getId()+" "+sde.getName()+" "+sde.getLocation());
			}
		}
		
		public static class Comp implements Comparator<StudentDataExtended>{
			public int compare(StudentDataExtended sde1, StudentDataExtended sde2){
				String s1 = sde1.getId();
				String s2 = sde2.getId();
				return s1.compareTo(s2);
			}
		}
}
