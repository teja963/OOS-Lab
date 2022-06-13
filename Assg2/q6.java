import java.lang.*;
import java.util.*;

class q6{
	  public static Scanner scanner = new Scanner(System.in);

	  public static void main(String[] args){
         System.out.print("Enter the no of students : ");
		 int n = scanner.nextInt();
		 List<Student> mylist = new ArrayList<Student>();
		 System.out.println("Enter the Student details");
		 for(int i=0;i<n;i++){
			  mylist.add(new Student(scanner.next(),scanner.next(),scanner.nextDouble()));
		 }

		 for(Student stu : mylist){
			  System.out.println(stu.getname()+" "+stu.getroll()+" "+stu.getcg()+" "+stu.getpercent()+"%");
		 }
		 scanner.close();
	  }


	  public static  class Student{
			String name;
			String roll;
			double cgpa;

			public Student(String name,String roll,double cgpa){
				  this.name = name;
				  this.roll = roll;
				  this.cgpa = cgpa;
			}

			public String getname(){
				  return this.name;
			}

			public String getroll(){
				  return this.roll;
			}

			public double getcg(){
				  return this.cgpa;
			}

			public double getpercent(){
				  return this.cgpa*9.5;
			}
	  }
}
