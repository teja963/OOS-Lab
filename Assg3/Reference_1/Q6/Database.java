import java.util.*;
import java.lang.*;

class Database{
	  PriorityQueue<StudentDataExtended> pq;

	  public Database(){
			pq = new PriorityQueue<StudentDataExtended>(new Comp());
	  }

	  public void addDetails(StudentDataExtended student){
			pq.add(student);
	  }

      public void printDetails(){
		  System.out.println();
		  System.out.println("The Student Details are : ");
		  while(pq.size() > 0){
			StudentDataExtended stu = pq.remove();
			stu.printDetails();
		  }
	  }


	  class Comp implements Comparator<StudentDataExtended>{
			public int compare(StudentDataExtended s1,StudentDataExtended s2){
				  String str1 = s1.getid();
				  String str2 = s2.getid();
				  return str1.compareTo(str2);
			}
	  }

	  
}
