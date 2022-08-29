import java.lang.*;
import java.util.*;

class q7{
	  public static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args){
			System.out.print("Enter the no of students : ");
			int n = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the details of the students ");
			PriorityQueue<Student> pq = new PriorityQueue<Student> (n,new Comp());
			for(int i=0;i<n;i++){
				  Student stu = new Student();
				  String det = scanner.nextLine();
				  String[] details = det.split(",");
				  stu.readStudent(details[0],details[1],getnumber(details[2]),getnumber(details[3]));
				  pq.add(stu);
			}

			for(int i=0;i<n;i++){
				  Student student = pq.remove();
				  student.printStudentDetails();
			}
	  }

	  public static class Comp implements Comparator<Student>{
			public int compare(Student s1,Student s2){
				  return s1.getheight() - s2.getheight();
			}
	  }

	  public static int getnumber(String num){
			int rem = 0;
			double result = 0;
			for(int i=0;i<num.length();i++){
				  char ch = num.charAt(i);
				  if(ch <= '9' && ch >= '0'){
						result = result*10 + Character.getNumericValue(ch);
				  }else if(ch == ' '){
						continue;
				  }else{
						break;
				  }
			}
			return (int)result;
	  }


	  public static class Student{
		  private String name;
		  private String roll;
		  private int height;
		  private int weight;

		  public void readStudent(String name,String roll,int height,int weight){
				this.name = name.trim();
				this.roll = roll.trim();
				this.weight = weight;
				this.height = height;
		  }

		  public int getheight(){
				return this.height;
		  }

		  public void printStudentDetails(){
				System.out.println(this.name+", "+this.roll+", "+this.height+"cm, "+this.weight+"KG");
		  }
	  }
}
