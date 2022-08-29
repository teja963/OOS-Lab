import java.util.*;
import java.lang.*;
class q6{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		System.out.println("Enter Student Details");
		ArrayList<Student> my_list = new ArrayList<Student>();
		for(int i = 0; i < n; i++){
			my_list.add(new Student(sc.next(), sc.next(), sc.nextDouble()));
		}
		for(Student x: my_list){
			System.out.println(x.getname()+" "+x.getroll()+" "+x.getcgpa()+" "+x.getpercentage()+"%");
		}
	}
	public static class Student{
		String name;
		String roll_number;
		double cgpa;
		public Student(String nm, String roll, double cgpa){
			this.name = nm;
			this.roll_number = roll;
			this.cgpa = cgpa;
		}
		public String getname(){
			return this.name;
		}
		public String getroll(){
			return this.roll_number;
		}
		public double getcgpa(){
			return this.cgpa;
		}
		public double getpercentage(){
			return this.cgpa*9.5;
		}
	}
}

