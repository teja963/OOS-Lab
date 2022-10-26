import java.lang.*;
import java.util.*;

class RollList implements OrderStudents{
	  List<Student> mylist;

	  public RollList(){
			this.mylist = new ArrayList<Student>();
	  }

	  public void addStudent(Student student){
			mylist.add(student);
	  }

	  public void OrderByRollno(){
		    System.out.println("//Sorted by Rollno");
			Collections.sort(mylist,(a,b)->a.getRoll() - b.getRoll());
			for(Student stu : mylist)
				stu.print();
	  }

	  public void OrderByName(){
		    System.out.println("//Sorted by Name");
			Collections.sort(mylist,(a,b)->a.getName().compareTo(b.getName()));
			for(Student stu : mylist)
				stu.print();
	  }
}
